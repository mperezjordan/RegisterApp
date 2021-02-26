package com.springboot.registerappdemo.service;

import java.util.List;

import com.springboot.registerappdemo.entity.User;


public interface UserService {
       
    public List<User> findAll();
	
	public User findById(int theId);
	
	public void save(User theEmployee);
	
	public void deleteById(int theId);	
}
