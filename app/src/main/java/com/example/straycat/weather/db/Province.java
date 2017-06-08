package com.example.straycat.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by stray cat on 2017/6/7.
 */

public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private int provinceCode;

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

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
