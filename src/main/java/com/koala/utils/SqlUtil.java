package com.koala.utils;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;

/**
 * Created by determined on 2017/10/29.
 */
@Repository
public class SqlUtil<T> {

    public String buildSaveSqlByEntity(T t){
        Class clazz = t.getClass();
        String tableName = t.getClass().getSimpleName();
        if(tableName.indexOf("Entity")>0){
            tableName.replaceAll("Entity","");
        }
        String sql ="insert into "+tableName+"(";
        Field[] fields = clazz.getDeclaredFields();
        String valueSql = "";
        try{
            for (Field field : fields) {
                field.setAccessible(true);
                Object object = field.get(t);
                if(object!=null) {
                    sql += field.getName() + ",";
                    valueSql+=":"+field.getName() + ",";
                }
            }
            valueSql =valueSql.substring(0,valueSql.length()-1);
            sql =  sql.substring(0,sql.length()-1);
            sql+=")values("+valueSql+")";
        }catch (Exception e){
            e.printStackTrace();
        }
        return sql;
    }



    public  String buildQueryListSqlByEntity(T t){
        Class clazz = t.getClass();
        String tableName = t.getClass().getSimpleName();
        if(tableName.indexOf("Entity")>0){
            tableName.replaceAll("Entity","");
        }
        String sql ="select id,name from "+tableName+" where 1=1 ";
        Field[] fields = clazz.getDeclaredFields();
        String valueSql = "";
        try{
            for (Field field : fields) {
                field.setAccessible(true);
                Object object = field.get(t);
                if(object!=null) {
                    sql += " and "+field.getName() + "=:"+field.getName()+"";
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sql;
    }

}
