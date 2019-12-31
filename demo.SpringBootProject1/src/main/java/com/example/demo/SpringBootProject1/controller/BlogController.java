package com.example.demo.SpringBootProject1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringBootProject1.model.UserBlog;
import com.example.demo.SpringBootProject1.service.BlogService;


@RestController
@RequestMapping(value="/blog")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@GetMapping("/post")
	public UserBlog saveBlog()
	{
		return new UserBlog();
	}
	
	@PostMapping("/savepost")
	public UserBlog saveBloginfo(@RequestBody UserBlog user)
	{
		
		return blogService.saveInfo(user);
	}
	
	
	@GetMapping("/allusers")
	public List<UserBlog> listOfUsers()
	{
		
		return blogService.allUsers();
	}
	
	// delete a blog
	
	@DeleteMapping("/delete/{blog_id}")
	public void deleteBlog(@PathVariable("blog_id") Integer id)
	{
		blogService.deleteBlog(id);
	}
	
	// delete all
	@DeleteMapping("/delete/all")
	public void deleteAllpost()
	{
		blogService.deleteAllPosts();
	}
	
	
}
