package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Province { //省级表
    private Integer pid; //省id
    private String province_ID; //省编号
    private String province_name; //省名称

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProvince_ID() {
        return province_ID;
    }

    public void setProvince_ID(String province_ID) {
        this.province_ID = province_ID;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }
}
