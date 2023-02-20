package com.example.library.util;

public interface SQLQueries {
	
	public String issueBookResponseQuery = 	"SELECT issue_book.issue_id AS issue_number, issue_book.issed_date, issue_book.expected_return_date, books.book_id, books.title AS book_name, books.author_name, books.publisher_name, books.published_date, books.edition, books.category, employee.emp_id AS issued_by_id, employee.emp_name AS issued_by_name, user.user_id AS issued_to_id, user.name AS issued_to_name"+
													"FROM issue_book "+
													"JOIN books ON books.book_id = ?1 "+
													"JOIN user ON user.user_id = ?2 " +
													"JOIN employee ON employee.emp_id = ?3 ";
			

}
