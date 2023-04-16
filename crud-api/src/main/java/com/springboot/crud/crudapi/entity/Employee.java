package com.springboot.crud.crudapi.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_employee", schema = "crud_api")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column							// Not necesary specify the column name because is the same name 
	private String name;
	
	@Column
	private String gender;
	
	@Column
	private String departament;
	
	@Column
	private Date dob;
	
}
