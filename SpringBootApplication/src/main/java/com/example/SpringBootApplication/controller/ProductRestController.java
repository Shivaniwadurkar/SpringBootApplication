package com.example.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootApplication.model.Product;
import com.example.SpringBootApplication.service.ProductService;

@RestController

public class ProductRestController {
	@Autowired
	private ProductService productService;

	@GetMapping("/product/upload")
	public Product upload() {
		return new Product();
	}

	@PostMapping("/product/upload")
	public Product upload(@RequestBody Product product) {
		return productService.save(product);
	}

	@GetMapping("/product/list")
	public List<Product> listAll() {
		return productService.listAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") Long id) {
		productService.delete(id);
		return null;
	}

	@PutMapping("/update/{id}")
	public Product updateProduct(@RequestBody Product product) {

		return productService.updateProductInfo(product);
	}

}
