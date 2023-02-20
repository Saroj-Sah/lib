package com.example.library.service;

import com.example.library.dto.request.IssueBookRequest;
import com.example.library.dto.response.IssueBookResponse;

public interface IssueBookService {

	public IssueBookResponse issueBookToUser (IssueBookRequest issueBookRequest);
}
