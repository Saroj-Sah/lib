package com.example.library.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IssueBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long issueId;
	private Long bookId;
	private Long issuedToId;
	private Long issuedById;
	private LocalDate issedDate;
	private LocalDate expectedReturnDate;
	private LocalDate returnDate;

}
