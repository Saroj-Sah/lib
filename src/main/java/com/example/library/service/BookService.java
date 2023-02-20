package com.example.library.service;

import org.springframework.stereotype.Service;

import com.example.library.model.Books;

@Service
public interface BookService{
	
	public Books saveBook(Books books);

}
