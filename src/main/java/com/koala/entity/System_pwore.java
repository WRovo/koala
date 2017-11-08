package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class System_pwore { //系统权限表
    private Integer power_id; //id
    private  Integer power_pid; //父级id
    private String power_name; //名称
    private String power_flag; //标志
    private String power_url; //连接
    private String power_target; //跳转到的frame的名字
    private Boolean power_isParent; //是否是父级
    private String power_icon; //图片路径

    public Integer getPower_id() {
        return power_id;
    }

    public void setPower_id(Integer power_id) {
        this.power_id = power_id;
    }
    public Integer getPower_pid() {
        return power_pid;
    }

    public void setPower_pid(Integer power_pid) {
        this.power_pid = power_pid;
    }

    public String getPower_name() {
        return power_name;
    }

    public void setPower_name(String power_name) {
        this.power_name = power_name;
    }

    public String getPower_flag() {
        return power_flag;
    }

    public void setPower_flag(String power_flag) {
        this.power_flag = power_flag;
    }

    public String getPower_url() {
        return power_url;
    }

    public void setPower_url(String power_url) {
        this.power_url = power_url;
    }

    public String getPower_target() {
        return power_target;
    }

    public void setPower_target(String power_target) {
        this.power_target = power_target;
    }

    public Boolean getPower_isParent() {
        return power_isParent;
    }

    public void setPower_isParent(Boolean power_isParent) {
        this.power_isParent = power_isParent;
    }

    public String getPower_icon() {
        return power_icon;
    }

    public void setPower_icon(String power_icon) {
        this.power_icon = power_icon;
    }
}
