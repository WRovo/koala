package com.koala.service.impl;

import com.koala.entity.Goods;
import com.koala.mapper.GoodsMapper;
import com.koala.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/5 0005.
 */
@Service
public class GoodsServiceImpl<T>  implements GoodsService<T> {
    @Autowired
    GoodsMapper goodsMapper;

    public GoodsServiceImpl() {
        super();
    }

    public int save(T t) {
        return 0;
    }

    public List<T> query4List() {
        return goodsMapper.queryGoods();
    }

    public int delete(int id) {
        return 0;
    }

    public int edit(T t) {
        return 0;
    }
}
