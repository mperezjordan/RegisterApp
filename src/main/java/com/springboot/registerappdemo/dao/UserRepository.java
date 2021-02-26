package com.springboot.registerappdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.registerappdemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
   //That's is it, ........no need to write any code LOL!
}
