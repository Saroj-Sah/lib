package com.example.library.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssueBookResponse {

//	issue_book table
	private Long issueNumber;
	private LocalDate issueDate;
	private LocalDate expectedReturnDate;
	
//	user table
	private Long issuedToId;
	private String issuedToName;
	
//	user/employee table
	private Long issuedById;
	private String issuedByName;
	
//	book table
	private Long bookId;
	private String bookName;
	private String authorName;
	private String publisherName;
	private LocalDate publishedDate;
	private String edition;
	private String category;
}
