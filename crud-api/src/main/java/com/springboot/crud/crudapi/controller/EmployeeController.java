package com.springboot.crud.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.springboot.crud.crudapi.entity.Employee;
import com.springboot.crud.crudapi.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> get() {
		List<Employee> employees = employeeService.get();
		if(employees.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(employees);
	}
	
	@PostMapping
	@PutMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employeeObj) {
		employeeService.save(employeeObj);
		return ResponseEntity.ok(employeeObj);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> get(@PathVariable int id) {
		Employee employeeObj = employeeService.get(id);
		if(employeeObj == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(employeeObj);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		employeeService.delete(id);
		return ResponseEntity.ok("Employee has been deleted with id: " + id);
	}
	
}
