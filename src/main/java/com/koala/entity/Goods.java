package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Goods { //商品表
    private Integer g_id; //id
    private Integer b_id; //品牌id
    private String g_name; //商品名称
    private double g_price; //商品价格
    private String g_remark; //商品详情
    private String g_size; //尺码
    private String g_color; //颜色
    private Integer g_number; //商品数量

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public double getG_price() {
        return g_price;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    public String getG_remark() {
        return g_remark;
    }

    public void setG_remark(String g_remark) {
        this.g_remark = g_remark;
    }

    public String getG_size() {
        return g_size;
    }

    public void setG_size(String g_size) {
        this.g_size = g_size;
    }

    public String getG_color() {
        return g_color;
    }

    public void setColor(String g_color) {
        this.g_color = g_color;
    }

    public Integer getG_number() {
        return g_number;
    }

    public void setG_number(Integer g_number) {
        this.g_number = g_number;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public void setG_color(String g_color) {
        this.g_color = g_color;
    }
}
