package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Picture { //商品图片表
    private Integer p_id; //图片id
    private Integer g_id; //商品id
    private String p_path; //图片路径

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getP_path() {
        return p_path;
    }

    public void setP_path(String p_path) {
        this.p_path = p_path;
    }
}
