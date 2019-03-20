package com.taotao.service;

import com.taotao.pojo.TbItem;

import java.util.List;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/20   10:47
 */
public interface ItemService {

    List<TbItem> getItemById(long itemId);

}
