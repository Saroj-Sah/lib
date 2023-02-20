package com.example.library.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Employee;
import com.example.library.repository.EmployeeRepository;
import com.example.library.service.EmployeeService;

@Service
public class EmployeeServiceImpls implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

}
