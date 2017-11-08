package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Certificate { //礼券表
    private Integer cer_id; //id
    private String cer_name; //礼券名称
    private String cer_context; //礼券内容

    public Integer getCer_id() {
        return cer_id;
    }

    public void setCer_id(Integer cer_id) {
        this.cer_id = cer_id;
    }

    public String getCer_name() {
        return cer_name;
    }

    public void setCer_name(String cer_name) {
        this.cer_name = cer_name;
    }

    public String getCer_context() {
        return cer_context;
    }

    public void setCer_context(String cer_context) {
        this.cer_context = cer_context;
    }
}
