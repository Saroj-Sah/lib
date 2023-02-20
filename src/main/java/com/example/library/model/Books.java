package com.example.library.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookId;
	
//	private String authNumber;
	private String authorName;
	private String publisherName;
	private LocalDate publishedDate;
	private String title;
	private String edition;
	private String category;
	private Long price;
	private Long totalStock;
	private Long remaingStock;
//	private Long totalBooks;
	
	public Books(Long id, String authNumber, String authorName, String publisherName,LocalDate publishedDate,String title, String edition,String category,Long price,Long totalStock,Long remaingStock,Long totalBooks) {
		super();
//		this.authorNumber=authNumber;
		this.authorName=authorName;
		this.publisherName=publisherName;
		this.publishedDate=publishedDate;
		this.title=title;
		this.edition=edition;
		this.category=category;
		this.price=price;
		this.totalStock=totalStock;
		this.remaingStock=remaingStock;
//		this.totalBooks=totalBooks;
	}
	public Books() {
		super();
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getTotalStock() {
		return totalStock;
	}
	public void setTotalStock(Long totalStock) {
		this.totalStock = totalStock;
	}
	public Long getRemaingStock() {
		return remaingStock;
	}
	public void setRemaingStock(Long remaingStock) {
		this.remaingStock = remaingStock;
	}
	
 
}
