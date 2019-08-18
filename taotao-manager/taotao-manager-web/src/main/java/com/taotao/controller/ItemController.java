package com.taotao.controller;

import com.taotao.common.pojo.EuiDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/20   11:18
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping("/item/{itemId}")
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EuiDataGridResult getItem(Integer page, Integer rows) {
        EuiDataGridResult result = itemService.getItemList(page, rows);
        System.out.println("controller" + result.getRows());
        return result;
    }




}
