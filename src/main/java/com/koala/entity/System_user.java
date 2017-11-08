package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class System_user { //系统用户表
    private Integer user_id; //id
    private String user_name; //用户名
    private String user_password; //密码
    private String user_avatar; //头像
    private String user_remark; //备注
    private String user_createTime; //创建时间
    private String user_state; //状态

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_remark() {
        return user_remark;
    }

    public void setUser_remark(String user_remark) {
        this.user_remark = user_remark;
    }

    public String getUser_createTime() {
        return user_createTime;
    }

    public void setUser_createTime(String user_createTime) {
        this.user_createTime = user_createTime;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }
}
