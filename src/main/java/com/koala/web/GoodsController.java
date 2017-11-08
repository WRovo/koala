package com.koala.web;
import com.koala.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
 * Created by Administrator on 2017/11/5 0005.
 */
@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/queryGoods.xhtml")
    @ResponseBody
    public List queryGoods(){
        List list=goodsService.query4List();

        return list;
    }
}
