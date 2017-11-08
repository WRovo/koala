package com.koala.entity;

/**
 * Created by determined on 2017/10/29.
 */
public class Useri { //用户表
    private Integer u_id; //id
    private Integer m_id; //会员id
    private String u_name; //会员名
    private String u_password; //手机号
    private String u_phone; //登录密码
    private String u_zpassword; //支付密码
    private String u_email; //邮箱
    private String u_avatar; //头像
    private Integer u_seller; //是否为卖家

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_zpassword() {
        return u_zpassword;
    }

    public void setU_zpassword(String u_zpassword) {
        this.u_zpassword = u_zpassword;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_avatar() {
        return u_avatar;
    }

    public void setU_avatar(String u_avatar) {
        this.u_avatar = u_avatar;
    }

    public Integer getU_seller() {
        return u_seller;
    }

    public void setU_seller(Integer u_seller) {
        this.u_seller = u_seller;
    }
}
