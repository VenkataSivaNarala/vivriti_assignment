package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee_Crud;
import com.example.demo.service.Service_Declaration;

@RestController
public class Employee_controller {
	
@Autowired
private Service_Declaration service;

public Employee_controller(Service_Declaration service) {
		this.service = service;
	}
	
	@GetMapping("/employees")
	public List<Employee_Crud> displayAll(){
		return service.findAll();
	}
	
	@GetMapping("/venkat")
	public Employee_Crud displayById(@PathVariable int employeeId) throws Exception {
		
		Employee_Crud employee = service.findById(employeeId);
		if(employee == null)
			throw new Exception("details not found "+employeeId);
		else
			return employee;		
	}
	
	@PostMapping("addEmployee")
	public Employee_Crud addEmployee(@RequestBody Employee_Crud employee) {
		
		employee.setId(0);
		service.insertOrUpdate(employee);
		return employee;
	}
	
	@PatchMapping("updateEmployee")
	public Employee_Crud updateEmployee(@RequestBody Employee_Crud employee) {
		
		service.insertOrUpdate(employee);
		return employee;
	}
	
	@DeleteMapping("deleteEmployee")
	public String deleteEmployee(@PathVariable int employeeId) throws Exception {
		
		Employee_Crud employee = service.findById(employeeId);
		if(employee == null)
			throw new Exception("details not not found"+employeeId);
			else {
				service.deleteById(employeeId);
				return "User Deleted Successfully "+employeeId;	
			}		
	}

}
