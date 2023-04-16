package com.springboot.crud.crudapi.repository;

import java.util.List;

import com.springboot.crud.crudapi.entity.Employee;

public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
