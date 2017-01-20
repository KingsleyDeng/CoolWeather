package com.shiliangdeng.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shiliangdeng on 17/1/15.
 */

public class Province extends DataSupport {
    //id
    private int id;
    //记录省的名字
    private String provinceName;
    //记录省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return provinceName;
    }

    public void setProviceName(String proviceName) {
        this.provinceName = proviceName;
    }

    public int getProviceCode() {
        return provinceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.provinceCode = proviceCode;
    }
}
