package com.koala.web;
import com.koala.entity.Brand;
import com.koala.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/11/5 0005.
 */
@Controller
public class BrandController {
    @Autowired
    BrandService brandService;
    @RequestMapping("/queryBrand.xhtml")
    @ResponseBody
    public List queryBrand(){
        List list=brandService.query4List();
        return list;
    }
    @RequestMapping("/saveBrand.xhtml")
    @ResponseBody
    public int saveBrand(HttpServletRequest httpServletRequest){
        String b_name=httpServletRequest.getParameter("b_name");
        Brand brand=new Brand();
        brand.setB_name(b_name);
        int k=brandService.save(brand);
        return k;
    }
    @RequestMapping("/deleteBrand.xhtml")
    @ResponseBody
    public int deleteBrand(HttpServletRequest httpServletRequest){
        Integer b_id=Integer.parseInt(httpServletRequest.getParameter("b_id"));
        int k=brandService.delete(b_id);
        return k;
    }
    @RequestMapping("editBrand.xhtml")
    @ResponseBody
    public int editBrand(HttpServletRequest httpServletRequest){
        Integer b_id=Integer.parseInt(httpServletRequest.getParameter("b_id"));
        String b_name=httpServletRequest.getParameter("b_name");
        Brand brand=new Brand();
        brand.setB_id(b_id);
        brand.setB_name(b_name);
        int k=brandService.edit(brand);
        return k;
    }
}
