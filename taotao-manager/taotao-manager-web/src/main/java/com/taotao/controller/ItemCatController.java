package com.taotao.controller;

import com.taotao.pojo.TbItemCat;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/28   0:14
 */
@RequestMapping("/item/cat")
@Controller
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @SuppressWarnings({"rawtypes","unchecked"})
    @RequestMapping("/list")
    @ResponseBody
    public List categoryList(@RequestParam(value = "id",defaultValue = "0") long parentId) throws Exception {
        List catList=new ArrayList();
        // 查询数据库
        List<TbItemCat> list=itemCatService.getItemCatList(parentId);
        for (TbItemCat tbItemCat:list){
            Map node=new HashMap<>();
            node.put("id",tbItemCat.getId());
            node.put("text",tbItemCat.getName());
            node.put("state",tbItemCat.getIsParent()?"closed":"open");
            catList.add(node);
        }
        return  catList;


    }



}
