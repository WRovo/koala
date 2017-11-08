package com.koala.entity;

/**
 * Created by determined on 2017/10/30.
 */
public class Area { //县/区级表
    private Integer aid; //区id
    private String area_ID; //区编号
    private String area_name; //区名称
    private String father; //父级地区

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getArea_ID() {
        return area_ID;
    }

    public void setArea_ID(String area_ID) {
        this.area_ID = area_ID;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
}
