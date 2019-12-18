package com.zking.ssm.services;

import com.zking.ssm.model.Product;
import com.zking.ssm.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IProductService {

    List<Product> getListProduct(Product product, PageBean pageBean);

    int addProduct(Product product);

    int delProduct(Product product);

    int updateProduct(Product product);
    Product getProduct(Product product);
}