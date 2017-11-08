package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class System_role { //系统角色表
    private Integer role_id; //id
    private String role_name; //名称
    private Integer role_pid; //父级id
    private String role_description; //备注

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Integer getRole_pid() {
        return role_pid;
    }

    public void setRole_pid(Integer role_pid) {
        this.role_pid = role_pid;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }
}
