package com.knot.ems.Dto;

public class PunchOutDto {
	
	private String empId;
	
	public PunchOutDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PunchOutDto(String empId) {
		super();
		this.empId = empId;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	
}
