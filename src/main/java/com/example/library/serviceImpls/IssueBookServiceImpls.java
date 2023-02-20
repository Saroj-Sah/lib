package com.example.library.serviceImpls;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.dto.request.IssueBookRequest;
import com.example.library.dto.response.IssueBookResponse;
import com.example.library.model.Books;
import com.example.library.model.Employee;
import com.example.library.model.IssueBook;
import com.example.library.model.User;
import com.example.library.repository.BooksRepository;
import com.example.library.repository.EmployeeRepository;
import com.example.library.repository.IssueBookRepository;
import com.example.library.repository.UserRepository;
import com.example.library.service.IssueBookService;
import com.example.library.util.Util;

@Service
public class IssueBookServiceImpls implements IssueBookService{
	
	@Autowired
	private IssueBookRepository issueBookRepository;
	
	@Autowired
	private Util util;
	
	@Autowired
	private BooksRepository booksRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public IssueBookResponse issueBookToUser(IssueBookRequest issueBookRequest) {

		IssueBook issueBook = new IssueBook();
		issueBook.setBookId(issueBookRequest.getBookId());
		issueBook.setIssuedById(issueBookRequest.getIssuedById());
		issueBook.setIssuedToId(issueBookRequest.getIssuedToId());
		issueBook.setIssedDate(LocalDate.now());
		issueBook.setBookId(issueBookRequest.getBookId());
		
//		write util function to calculate expected return date. 
		issueBook.setExpectedReturnDate(util.expectedReturnDate(issueBook.getIssedDate()));
		issueBook.setReturnDate(null);
		
		issueBook = issueBookRepository.save(issueBook);

		Books bookDetails = booksRepository.findByBookId(issueBook.getBookId());
		Employee employeeDetails = employeeRepository.findByEmpId(issueBook.getIssuedById());
		User userDetails = userRepository.findByUserId(issueBook.getIssuedToId());
		
//		IssueBookResponse issueBookResponse = IssueBookResponse.builder()
//												.issueNumber(issueBook.getIssueId())
//												.issueDate(issueBook.getIssedDate())
//												.expectedReturnDate(issueBook.getExpectedReturnDate())
//												.issuedToId(userDetails.getUserId())
//												.issuedToName(userDetails.getName())
//												.issuedById(employeeDetails.getEmpId())
//												.issuedByName(employeeDetails.getEmpName())
//												.bookId(bookDetails.getBookId())
//												.bookName(bookDetails.getTitle())
//												.authorName(bookDetails.getAuthorName())
//												.publisherName(bookDetails.getPublisherName())
//												.publishedDate(bookDetails.getPublishedDate())
//												.edition(bookDetails.getEdition())
//												.category(bookDetails.getCategory())
//												.build();
		IssueBookResponse issueBookResponse = issueBookRepository.issueBookResponseQuery(issueBook.getBookId(), issueBook.getIssuedToId(), issueBook.getIssuedById());
		
		
		return issueBookResponse;
	}

}
