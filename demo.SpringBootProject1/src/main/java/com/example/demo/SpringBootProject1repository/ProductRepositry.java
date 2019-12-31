package com.example.demo.SpringBootProject1repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.SpringBootProject1.model.Product;


public interface ProductRepositry extends JpaRepository<Product, Integer> {

}

