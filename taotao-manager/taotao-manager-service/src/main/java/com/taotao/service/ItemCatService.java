package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemCat;

import java.util.List;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/28   0:09
 */
public interface ItemCatService {

    public List<TbItemCat> getItemCatList(long parentId) throws  Exception;

}
