package com.knot.ems.Dto;

import jakarta.persistence.Transient;

public class EmployeeDto {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String dob;
	private String joining_date;
	@Transient
	private DepartmentDto deptDto;
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(String firstName, String lastName, String email, String phone, String dob, String joining_date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.joining_date = joining_date;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	
	
	
}
