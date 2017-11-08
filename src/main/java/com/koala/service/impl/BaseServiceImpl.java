package com.koala.service.impl;

import com.koala.service.BaseService;

import java.util.List;

/**
 * Created by determined on 2017/10/30.
 */

public class BaseServiceImpl<T> implements BaseService<T>{
    public int save(T t) {
        return 0;
    }

    public List<T> query4List() {
        return null;
    }

    public int delete(int id) {
        return 0;
    }

    public int edit(T t) {
        return 0;
    }
}
