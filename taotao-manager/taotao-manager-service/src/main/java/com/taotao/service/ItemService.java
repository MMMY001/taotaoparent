package com.taotao.service;

import com.taotao.common.pojo.EuiDataGridResult;
import com.taotao.pojo.TbItem;

import java.util.List;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/20   10:47
 */
public interface ItemService {

    TbItem getItemById(long itemId);

    EuiDataGridResult getItemList(int page,int rows);

}
