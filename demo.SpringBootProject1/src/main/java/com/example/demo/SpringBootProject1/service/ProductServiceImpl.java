package com.example.demo.SpringBootProject1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SpringBootProject1.model.Product;
import com.example.demo.SpringBootProject1repository.ProductRepositry;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepositry productRepo;
	
	
	@Override
	public Product save(Product product) {
		
		return productRepo.save(product);
	}


	@Override
	public List<Product> productList() {
		return productRepo.findAll();
	}
	
	@Override
	public void addProduct(Product product) {
		
		 productRepo.save(product);
	}


	@Override
	public void delete(Integer id) {
		productRepo.deleteById(id);
		System.out.println("product deleted succesfully");
	}


	@Override
	public Product updateProductInfo(Product product) {
		return productRepo.save(product);
	}



	

	

}

