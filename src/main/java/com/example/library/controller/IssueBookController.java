package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.library.dto.request.IssueBookRequest;
import com.example.library.dto.response.IssueBookResponse;
import com.example.library.serviceImpls.IssueBookServiceImpls;

@Controller
public class IssueBookController {

	@Autowired
	private IssueBookServiceImpls issueBookService;
	
	@PostMapping("/issue-book")
	public ResponseEntity<IssueBookResponse> issueBookToUser(@RequestBody IssueBookRequest issueBookRequest){
		return new ResponseEntity<IssueBookResponse>(issueBookService.issueBookToUser(issueBookRequest), HttpStatus.OK);
	}
}
