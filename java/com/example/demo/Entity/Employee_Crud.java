package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table
public class Employee_Crud {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id")
	private int User_id;
	
	@Column(name="First_Name")
	private String First_Name;
		
	@Column(name="Last_Name")
	private String Last_Name;
		
	@Column(name="phone_no")
	private long phone_no;
		
	@Column(name="Address")
	private String Address;
	
	@Column(name="Department")
	private String Department;

	public Employee_Crud() {	}

		@Autowired
		public Employee_Crud(int User_id, String First_Name, String Last_Name, long phone_no, String Address, String Department) {
			this.User_id = User_id;
			this.First_Name = First_Name;
			this.Last_Name = Last_Name;
			this.phone_no = phone_no;
			this.Address = Address;
			this.Department = Department;
		}

		public int getId() {
			return User_id;
		}

		public void setId(int id) {
			this.User_id = User_id;
		}

		public String getFirst_name() {
			return First_Name;
		}

		public void setFirst_name(String First_name) {
			this.First_Name = First_name;
		}

		public String getLast_name() {
			return Last_Name;
		}

		public void setLast_name(String last_name) {
			this.Last_Name = last_name;
		}

		public long getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(long phone_no) {
			this.phone_no = phone_no;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			this.Address = address;
		}

		public String getDepartment() {
			return Department;
		}

		public void setDepartment(String department) {
			this.Department = department;
		}

		@Override
		public String toString() {
			return "Employee [id=" + User_id + ", first_name=" + First_Name + ", LastName=" + Last_Name + ", PhoneNo=" + phone_no
					+ ", Address=" + Address + ", Department=" + Department + "]";
		}	
		
	}

