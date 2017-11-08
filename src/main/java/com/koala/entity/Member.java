package com.koala.entity;

/**
 * Created by determined on 2017/11/1.
 */
public class Member { //会员表
    private Integer m_id; //会员id
    private Integer m_grede; //会员等级
    private String m_privilege; //会员特权

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public Integer getM_grede() {
        return m_grede;
    }

    public void setM_grede(Integer m_grede) {
        this.m_grede = m_grede;
    }

    public String getM_privilege() {
        return m_privilege;
    }

    public void setM_privilege(String m_privilege) {
        this.m_privilege = m_privilege;
    }
}
