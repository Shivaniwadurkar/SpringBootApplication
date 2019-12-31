package com.example.demo.SpringBootProject1.service;
import java.util.List;

import com.example.demo.SpringBootProject1.model.UserBlog;



public interface BlogService {

	UserBlog saveInfo(UserBlog user);

	List<UserBlog> allUsers();

	void deleteBlog(Integer id);

	void deleteAllPosts();

	public UserBlog addBlog(UserBlog blog);
}
