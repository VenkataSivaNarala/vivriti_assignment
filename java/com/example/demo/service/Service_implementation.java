package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DAO.Emp_Repository;
import com.example.demo.Entity.Employee_Crud;

@Service
public class Service_implementation implements Service_Declaration{
	@Autowired
	private Emp_Repository emp_Repository;
	public Service_implementation(Emp_Repository emp_Repository) {
		this.emp_Repository = emp_Repository;
		}

		@Override
		@Transactional
		public List<Employee_Crud> findAll() {
			// TODO Auto-generated method stub
			return emp_Repository.findAll();
		}

		@Override
		@Transactional
		public Employee_Crud findById(int id) {
			// TODO Auto-generated method stub
			return emp_Repository.findById(id).get();
		}

		@Override
		@Transactional
		public void insertOrUpdate(Employee_Crud employee) {
			// TODO Auto-generated method stub
			emp_Repository.save(employee);
			
		}

		@Override
		@Transactional
		public void deleteById(int id) {
			// TODO Auto-generated method stub
			emp_Repository.deleteById(id);
		}
		
}
