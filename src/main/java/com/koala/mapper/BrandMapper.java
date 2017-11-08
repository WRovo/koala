package com.koala.mapper;
import com.koala.entity.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/4 0004.
 */
@Repository
public interface BrandMapper<T> {
    public List queryBrand();
    public int saveBrand(T t);
    public int deleteBrand(int id);
    public int editBrand(T t);
}