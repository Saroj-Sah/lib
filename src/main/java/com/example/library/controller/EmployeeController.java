package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Employee;
import com.example.library.serviceImpls.EmployeeServiceImpls;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpls empServiceImpls;
	
	@PostMapping("/emp-details")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empServiceImpls.saveEmployee(employee);
		
	}

}
