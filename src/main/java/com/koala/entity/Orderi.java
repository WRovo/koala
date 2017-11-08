package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Orderi { //订单表
    private Integer o_id; //id
    private Integer g_id; //商品id
    private Integer a_id; //地址id
    private Integer o_number; //订单编号
    private String o_date; //订单日期
    private Integer p_number; //商品数量
    private Integer o_state; //运送状态
    private double o_price; //订单价格

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getO_number() {
        return o_number;
    }

    public void setO_number(Integer o_number) {
        this.o_number = o_number;
    }

    public String getO_date() {
        return o_date;
    }

    public void setO_date(String o_date) {
        this.o_date = o_date;
    }

    public Integer getP_number() {
        return p_number;
    }

    public void setP_number(Integer p_number) {
        this.p_number = p_number;
    }

    public Integer getO_state() {
        return o_state;
    }

    public void setO_state(Integer o_state) {
        this.o_state = o_state;
    }

    public double getO_price() {
        return o_price;
    }

    public void setO_price(double o_price) {
        this.o_price = o_price;
    }
}
