package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class City { //市级表
    private Integer cid; //市id
    private String city_ID; //市编号
    private String city_name; //市名称
    private String father; //父级地区

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCity_ID() {
        return city_ID;
    }

    public void setCity_ID(String city_ID) {
        this.city_ID = city_ID;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
}
