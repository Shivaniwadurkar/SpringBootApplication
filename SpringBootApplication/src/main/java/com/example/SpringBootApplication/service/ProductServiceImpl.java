package com.example.SpringBootApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootApplication.model.Product;
import com.example.SpringBootApplication.repository.ProductRepository;

@Service

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product save(Product product) {

		return productRepo.save(product);
	}

	@Override
	public List<Product> listAll() {
		return productRepo.findAll();
	}

	@Override
	public void delete(Long id) {
		productRepo.deleteById(id);
		System.out.println("product deleted succesfully");
	}

	@Override
	public Product updateProductInfo(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
