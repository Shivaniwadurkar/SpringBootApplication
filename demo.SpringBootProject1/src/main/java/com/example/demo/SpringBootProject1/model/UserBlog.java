package com.example.demo.SpringBootProject1.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class UserBlog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int blog_id;
	private String name;
	private String blogInfo;
	
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlogInfo() {
		return blogInfo;
	}
	public void setBlogInfo(String blogInfo) {
		this.blogInfo = blogInfo;
	}
	
	

}

