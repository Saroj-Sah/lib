package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.library.dto.response.IssueBookResponse;
import com.example.library.model.IssueBook;
import com.example.library.util.SQLQueries;

@Repository
public interface IssueBookRepository extends SQLQueries, JpaRepository<IssueBook, Long>{

	@Query(value = "SELECT issue_book.issue_id AS issue_number, issue_book.issed_date, issue_book.expected_return_date, books.book_id, books.title AS book_name, books.author_name, books.publisher_name, books.published_date, books.edition, books.category, employee.emp_id AS issued_by_id, employee.emp_name AS issued_by_name, user.user_id AS issued_to_id, user.name AS issued_to_name FROM issue_book JOIN books ON books.book_id = ? JOIN employee ON employee.emp_id = ? JOIN user ON user.user_id = ?", nativeQuery = true)
	public IssueBookResponse issueBookResponseQuery(Long bookId, Long issuedToId, Long issuedById);
//	
//	@Query
//	(value = issueBookResponseQuery, nativeQuery = true)
//	public IssueBookResponse issueBookResponseQuery(Long bookId, Long issuedToId, Long issuedById);

}
