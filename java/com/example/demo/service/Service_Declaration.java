package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Employee_Crud;

public interface Service_Declaration {
		
		public List<Employee_Crud> findAll();
		public Employee_Crud findById(int id);
		public void insertOrUpdate(Employee_Crud employee);
		public void deleteById(int id);

	}

