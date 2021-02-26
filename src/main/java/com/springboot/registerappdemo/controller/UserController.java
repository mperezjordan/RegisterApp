package com.springboot.registerappdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springboot.registerappdemo.entity.User;
import com.springboot.registerappdemo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;
	
	UserController(UserService theUserService){
		userService = theUserService;
	}
	//Add mapping for"/list"
	@GetMapping("/list")
	public String listUsers(Model theModel) {
		 
		 //Get employees from database
		 List<User> theUsers = userService.findAll();
		 // add to the spring model
		 theModel.addAttribute("users", theUsers);
		 return "list-users";
	 }
}
