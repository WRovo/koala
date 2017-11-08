package com.koala.service.impl;

import com.koala.mapper.PictureMapper;
import com.koala.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/5 0005.
 */
@Service
public class PictureserviceImpl<T> implements PictureService<T>{
    @Autowired
    PictureMapper pictureMapper;
    public int save(T t) {
        return 0;
    }

    public List<T> query4List() {
        return pictureMapper.queryPicture();
    }

    public int delete(int id) {
        return 0;
    }

    public int edit(T t) {
        return 0;
    }
}
