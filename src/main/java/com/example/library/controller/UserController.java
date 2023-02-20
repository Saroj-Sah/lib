package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.User;
import com.example.library.serviceImpls.UserServiceImpls;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpls userServiceImpls;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		userServiceImpls.saveUser(user);
		return user;
		
	}
	
	@GetMapping("/letter/{letter}")
    public List<User> searchByLetter(@PathVariable("letter") String letter) {
        return userServiceImpls.searchByLetter(letter);
    }
	

}