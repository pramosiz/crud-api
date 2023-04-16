package com.springboot.crud.crudapi.service;

import java.util.List;

import com.springboot.crud.crudapi.entity.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
