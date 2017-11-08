package com.koala.dao.impl;

import com.koala.dao.BaseDao;
import com.koala.utils.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


/**
 * Created by determined on 2017/10/29.
 */
@Repository
public class BaseDaoImpl<T> implements BaseDao<T>{
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    SqlUtil sqlUtil;
    @Autowired
    @Qualifier("datasourceSpring")
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    public int sava(T t) {
        String sql = sqlUtil.buildSaveSqlByEntity(t);
        SqlParameterSource sps = new BeanPropertySqlParameterSource(t);
        int k = jdbcTemplate.update(sql,sps);
        return k;
    }

    public List query4List( T t) {
        String sql = sqlUtil.buildQueryListSqlByEntity(t);
        SqlParameterSource sps = new BeanPropertySqlParameterSource(t);
        Class clazz = t.getClass();
        RowMapper rowMapper = new BeanPropertyRowMapper(clazz);
        List list = jdbcTemplate.query(sql,sps,rowMapper);
        return list;
    }

}
