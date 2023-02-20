package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Books;
import com.example.library.serviceImpls.BooksServiceImpls;

@RestController
public class BooksController {
	
	@Autowired
	private BooksServiceImpls bookserviceImpl;
	
	@PostMapping("/save-books")
	public ResponseEntity<Books> saveBooks(@RequestBody Books book) {
		return new ResponseEntity<Books>(bookserviceImpl.saveBook(book), HttpStatus.CREATED);
		
	}

}
