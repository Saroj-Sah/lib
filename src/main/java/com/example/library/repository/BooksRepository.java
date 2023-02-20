package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

	Books findByBookId(Long bookId);
	
}
