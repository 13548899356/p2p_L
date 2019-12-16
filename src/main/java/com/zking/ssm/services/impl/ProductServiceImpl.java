package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.ProductMapper;
import com.zking.ssm.model.Product;
import com.zking.ssm.services.IProductService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getListProduct(Product product, PageBean pageBean) {

        return productMapper.getListProduct(product);
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public int delProduct(Product product) {
        return productMapper.delProduct(product);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }
}
