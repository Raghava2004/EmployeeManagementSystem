package com.knot.ems.Bo;

import java.math.BigDecimal;

public class SalaryBo {
	private String EmpId;
	private String HoursWorked;
	private String PayPerHour;
	private String ComputedSalary;
	public SalaryBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalaryBo(String empId, String hoursWorked, String payPerHour, String computedSalary) {
		super();
		EmpId = empId;
		HoursWorked = hoursWorked;
		PayPerHour = payPerHour;
		ComputedSalary = computedSalary;
	}
	public SalaryBo(String id, BigDecimal salary, BigDecimal payPerHour2, BigDecimal hours) {
		// TODO Auto-generated constructor stub
		this.EmpId=id;
		this.HoursWorked=hours.toString();
		this.PayPerHour=payPerHour2.toString();
		this.ComputedSalary=salary.toString();
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getHoursWorked() {
		return HoursWorked;
	}
	public void setHoursWorked(String hoursWorked) {
		HoursWorked = hoursWorked;
	}
	public String getPayPerHour() {
		return PayPerHour;
	}
	public void setPayPerHour(String payPerHour) {
		PayPerHour = payPerHour;
	}
	public String getComputedSalary() {
		return ComputedSalary;
	}
	public void setComputedSalary(String computedSalary) {
		ComputedSalary = computedSalary;
	}

}
