package com.taotao.service.impl;

import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/28   0:10
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<TbItemCat> getItemCatList(long parentId) throws Exception {

        // 创建查询条件
        TbItemCatExample example = new TbItemCatExample();

        // 设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();

        // 根据parentId查询子节点
        criteria.andParentIdEqualTo(parentId);

        // 返回子节点列表
        List<TbItemCat> list = itemCatMapper.selectByExample(example);

        return list;
    }
}
