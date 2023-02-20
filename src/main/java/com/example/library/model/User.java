package com.example.library.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	private String name;
	
	@Column(unique = true)
	private String email;
 
	private String password;
	private String address;
	
	@Column(unique = true)
	private Long phoneNumber;
	
	private LocalDate dateOfBirth;
	private String gender;
	
	public User(long userId, String name, String email, String password,String address,Long phoneNumber,LocalDate dateOfBirth,String gender) {
		super();
		this.userId=userId;
		this.name=name;
		this.email=email;
		this.password=password;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.gender=gender;
		this.dateOfBirth=dateOfBirth;
	}
	public User() {
		super();
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
}
