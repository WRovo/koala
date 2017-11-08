package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Comment { //评论表
    private Integer c_id; //评论id
    private Integer g_id; //商品id
    private Integer u_id; //用户id
    private String c_date; //评论日期
    private String c_context; //评论内容

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getC_date() {
        return c_date;
    }

    public void setC_date(String c_date) {
        this.c_date = c_date;
    }

    public String getC_context() {
        return c_context;
    }

    public void setC_context(String c_context) {
        this.c_context = c_context;
    }
}
