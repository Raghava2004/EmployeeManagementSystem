package com.knot.Banking.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class LoginModel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer loginId;
	@Column(name="emp_id")
	private Integer empId;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	public LoginModel() {
		super();
	}
	public LoginModel(Integer loginId, Integer empId, String name, String password) {
		super();
		this.loginId = loginId;
		this.empId = empId;
		this.name = name;
		this.password = password;
	}
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "LoginModel [loginId=" + loginId + ", empId=" + empId + ", name=" + name + ", password=" + password
				+ "]";
	}
	public void setName(String mailId) {
		this.name = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
