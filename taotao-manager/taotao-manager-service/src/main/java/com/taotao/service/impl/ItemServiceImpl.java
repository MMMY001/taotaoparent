package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理service
 *
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/20   10:49
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public List<TbItem> getItemById(long itemId) {
//        TbItem tbItem=itemMapper.selectByPrimaryKey(itemId); // 直接根据主键id查询信息
        // 根据设定条件查询
        TbItemExample example = new TbItemExample();
        // 添加查询条件
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
//            TbItem item = list.get(0);
            return list;
        }
        return null;
    }
}
