package com.zking.ssm.controller.back.finance;

import com.zking.ssm.model.Product;
import com.zking.ssm.services.IProductService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/product")

public class ProductController {


    @Autowired
    private IProductService productService;

    private PageBean pageBean;

    @ModelAttribute
    public void init(){
        pageBean=new PageBean();

    }

    @RequestMapping("/getListProduct")
    @ResponseBody
    public Object getListProduct(Product product){
        System.out.println(product);
        List<Product> listProduct = productService.getListProduct(product,pageBean);
        System.out.println(pageBean);
        return jsonData.toJsonPager("",true,pageBean.getTotal(),listProduct);
    }

    @RequestMapping("/addProduct")
    @ResponseBody
    public Object addProduct(Product product){
        product.setId(uuidUtil.getUUID());
        System.out.println(product);
        int i = productService.addProduct(product);
        if(i>0){
            return jsonData.toJsonMessage("新增成功",true);
        }else{
            return jsonData.toJsonMessage("新增失败",false);
        }
    }
    @RequestMapping("/updateProduct")
    @ResponseBody
    public Object updateProduct(Product product){
        int i = productService.updateProduct(product);
        if(i>0){
            return jsonData.toJsonMessage("修改成功",true);
        }else{
            return jsonData.toJsonMessage("修改失败",false);
        }
    }

    @RequestMapping("/delProduct")
    @ResponseBody
    public Object delProduct(Product product){
        int i = productService.delProduct(product);
        if(i>0){
            return jsonData.toJsonMessage("删除成功",true);
        }else{
            return jsonData.toJsonMessage("删除失败",false);
        }
    }



}
