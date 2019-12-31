package com.example.demo.SpringBootProject1repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.SpringBootProject1.model.UserBlog;


public interface BlogRepository extends JpaRepository<UserBlog, Integer> {

}

