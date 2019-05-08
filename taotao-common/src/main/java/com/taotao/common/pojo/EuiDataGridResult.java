package com.taotao.common.pojo;

import java.util.List;

/**
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/27   22:28
 */
public class EuiDataGridResult {

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    private long total;
    private List<?> rows;


}
