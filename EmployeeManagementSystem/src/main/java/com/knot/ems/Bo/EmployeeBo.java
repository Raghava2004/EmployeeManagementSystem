package com.knot.ems.Bo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.knot.ems.Model.EmployeeModel;

import jakarta.persistence.Transient;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeBo {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dob;
    private String joiningDate;

    @Transient
    private DepartmentBo department;

    @Transient
    private RoleBo role;

    @Transient
    private SalaryBo salary;

    @Transient
    private EmpProjBo project;
    



	// Default constructor
    public EmployeeBo() {
        super();
    }

	public EmployeeBo(String firstName, String lastName, String email, String phone, String dob, String joiningDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.joiningDate = joiningDate;
	}

	public EmployeeBo(EmployeeModel employeeModel) {
		// TODO Auto-generated constructor stub
		this.firstName=employeeModel.getFirstName();
		this.lastName=employeeModel.getLastName();
		this.email=employeeModel.getEmail();
		this.phone=employeeModel.getPhoneNo();
		this.dob=employeeModel.getDOB().toString();
		this.joiningDate=employeeModel.getJoiningDate().toString();
		
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

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public DepartmentBo getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentBo department) {
		this.department = department;
	}

	public RoleBo getRole() {
		return role;
	}

	public void setRole(RoleBo role) {
		this.role = role;
	}

	public SalaryBo getSalary() {
		return salary;
	}

	public void setSalary(SalaryBo salary) {
		this.salary = salary;
	}

	public EmpProjBo getProject() {
		return project;
	}

	public void setProject(EmpProjBo project) {
		this.project = project;
	}

    
}