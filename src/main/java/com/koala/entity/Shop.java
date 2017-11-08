package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Shop { //店铺表
    private Integer s_id; //id
    private Integer u_id; //用户id
    private String s_name; //店铺名

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
}
