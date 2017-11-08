package com.koala.mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/4 0004.
 */
@Repository
public interface GoodsMapper {
    public List queryGoods();
}