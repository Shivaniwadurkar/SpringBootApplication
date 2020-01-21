package com.example.SpringBootApplication.service;

import java.util.List;

import com.example.SpringBootApplication.model.Product;

public interface ProductService {
	Product save(Product product);

	List<Product> listAll();

	void delete(Long id);

	Product updateProductInfo(Product product);

	Product get(Long id);


}
