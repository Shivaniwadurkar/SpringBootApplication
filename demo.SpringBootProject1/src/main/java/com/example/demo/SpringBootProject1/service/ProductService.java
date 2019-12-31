package com.example.demo.SpringBootProject1.service;

import java.util.List;

import com.example.demo.SpringBootProject1.model.Product;

public interface ProductService {

	Product save(Product product);

	List<Product> productList();

	public void delete(Integer id);

	Product updateProductInfo(Product product);

	public void addProduct(Product product);

}

