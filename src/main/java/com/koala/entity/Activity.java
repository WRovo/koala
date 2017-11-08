package com.koala.entity;

/**
 * Created by determined on 2017/10/30.
 */
public class Activity { //活动表
    private Integer act_id; //id
    private String act_name; //活动名称
    private String act_context; //活动内容
    private String s_name; //活动店铺

    public Integer getAct_id() {
        return act_id;
    }

    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public String getAct_context() {
        return act_context;
    }

    public void setAct_context(String act_context) {
        this.act_context = act_context;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
}
