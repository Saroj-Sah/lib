package com.example.library.service;

import org.springframework.stereotype.Service;

import com.example.library.model.Employee;

@Service
public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	

}
