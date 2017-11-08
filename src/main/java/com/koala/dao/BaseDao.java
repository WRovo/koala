package com.koala.dao;

import java.util.List;

/**
 * Created by determined on 2017/10/29.
 */
public interface BaseDao<T> {
    public int sava(T t);
    public List query4List(T t);


}
