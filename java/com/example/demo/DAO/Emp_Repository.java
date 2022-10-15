package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Employee_Crud;

public interface Emp_Repository extends JpaRepository<Employee_Crud, Integer> {
	
}
