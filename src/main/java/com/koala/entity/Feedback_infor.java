package com.koala.entity;

/**
 * Created by Administrator on 2017/11/6 0006.
 */
public class Feedback_infor { //反馈信息表
    private Integer f_id; //反馈id
    private Integer u_id; //用户id
    private String f_context; //反馈内容

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getF_context() {
        return f_context;
    }

    public void setF_context(String f_context) {
        this.f_context = f_context;
    }
}
