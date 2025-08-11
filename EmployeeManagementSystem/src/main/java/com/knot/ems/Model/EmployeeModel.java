package com.knot.ems.Model;

import java.time.LocalDate;

import com.knot.ems.Dto.EmployeeDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer EmpId;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phoneNo;
	@Column(name = "dob")
	private LocalDate DOB;
	@Column(name = "joining_date")
	private LocalDate joiningDate;
	@Column(name = "dept_id")
	private Integer deptId;
	
	
	
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public EmployeeModel(Integer empId, String firstName, String lastName, String email, String phoneNo, LocalDate dOB,
			LocalDate joiningDate, Integer deptId) {
		super();
		EmpId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		DOB = dOB;
		this.joiningDate = joiningDate;
		this.deptId = deptId;
	}
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeModel(EmployeeDto empDto) {
		// TODO Auto-generated constructor stub
		this.firstName=empDto.getFirstName();
		this.lastName=empDto.getLastName();
		this.email=empDto.getEmail();
		this.phoneNo=empDto.getPhone();
		this.DOB=LocalDate.parse(empDto.getDob());
		this.joiningDate=LocalDate.parse(empDto.getJoining_date());
	}
	
}
