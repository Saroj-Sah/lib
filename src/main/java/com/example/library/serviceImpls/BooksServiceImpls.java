package com.example.library.serviceImpls;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Books;
import com.example.library.repository.BooksRepository;
import com.example.library.service.BookService;

@Service
public class BooksServiceImpls implements BookService{
	
	@Autowired
	private BooksRepository bookRepo;
 

	@Override
	public Books saveBook(Books books) {
		return bookRepo.save(books);
	}



}
