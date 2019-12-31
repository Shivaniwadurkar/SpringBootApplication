package com.example.demo.SpringBootProject1.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SpringBootProject1.model.Product;
import com.example.demo.SpringBootProject1.model.UserBlog;
import com.example.demo.SpringBootProject1repository.BlogRepository;


@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogRepository blogRepo;
	
	@Override
	public UserBlog saveInfo(UserBlog user) {
		
		return blogRepo.save(user);
	}
	
	@Override
	public UserBlog addBlog(UserBlog blog) {
		
		return blogRepo.save(blog);
	}



	@Override
	public List<UserBlog> allUsers() {
		
		return blogRepo.findAll();
	}

	@Override
	public void deleteBlog(Integer id) {
		
		blogRepo.deleteById(id);
	}

	@Override
	public void deleteAllPosts() {
		
		blogRepo.deleteAll();
		
	}

	
	

}


