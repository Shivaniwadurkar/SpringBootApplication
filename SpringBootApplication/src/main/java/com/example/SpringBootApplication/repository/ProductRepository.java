package com.example.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootApplication.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
