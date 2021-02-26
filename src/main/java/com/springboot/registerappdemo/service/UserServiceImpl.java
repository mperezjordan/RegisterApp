package com.springboot.registerappdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.springboot.registerappdemo.dao.UserRepository;
import com.springboot.registerappdemo.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	UserServiceImpl(UserRepository theUserRepository){
		   userRepository = theUserRepository;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	
	@Override
	public User findById(int theId) {
		// TODO Auto-generated method stub
				Optional<User> result = userRepository.findById(theId);
				
				User theUser = null;
				if(result.isPresent()) {
					theUser = result.get();
				}
				else {
					// we did not find all employee
					throw new RuntimeException("Did not find user id - " + theId);
				}
				return theUser;
	}


	@Override
	public void save(User theUser) {
		// TODO Auto-generated method stub
        userRepository.save(theUser);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(theId);

	} 
	

}
