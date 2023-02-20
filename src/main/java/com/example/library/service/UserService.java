package com.example.library.service;

import java.util.List;

import com.example.library.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	List<User> searchByLetter(String letter);

}
