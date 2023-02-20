package com.example.library.serviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import com.example.library.service.UserService;

@Service
public class UserServiceImpls implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	@Override
	public List<User> searchByLetter(String letter) {
		return userRepo.searchByLetter(letter);
	}
	
	

}
