package com.koala.service.impl;

import com.koala.mapper.BrandMapper;
import com.koala.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/5 0005.
 */
@Service
public class BrandServiceImpl<T>  implements BrandService<T> {
    @Autowired
    BrandMapper brandMapper;

    public int save(T t) {
        int k=brandMapper.saveBrand(t);
        return k;
    }

    public List<T> query4List() {
        return brandMapper.queryBrand();
    }

    public int delete(int id) {
        return brandMapper.deleteBrand(id);
    }

    public int edit(T t) {
        return brandMapper.editBrand(t);
    }
}
