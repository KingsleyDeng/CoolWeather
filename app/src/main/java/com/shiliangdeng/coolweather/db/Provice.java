package com.shiliangdeng.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shiliangdeng on 17/1/15.
 */

public class Provice extends DataSupport {
    //id
    private int id;
    //记录省的名字
    private String proviceName;
    //记录省的代号
    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
