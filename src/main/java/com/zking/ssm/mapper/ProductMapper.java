package com.zking.ssm.mapper;

import com.zking.ssm.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProductMapper {

List<Product> getListProduct(Product product);

int addProduct(Product product);

int delProduct(Product product);

int updateProduct(Product product);

Product getProduct(Product product);

}