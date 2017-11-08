package com.koala.service;

import java.util.List;

/**
 * Created by determined on 2017/10/29.
 */
public interface BaseService<T> {
    public int save(T t);
    public List<T> query4List();
    public int delete(int id);
    public int  edit(T t);
}
