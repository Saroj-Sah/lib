package com.example.library.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueBookRequest {

	private Long bookId;
	private Long issuedToId;
	private Long issuedById; 
}
