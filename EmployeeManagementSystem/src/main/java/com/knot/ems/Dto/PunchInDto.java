package com.knot.ems.Dto;

public class PunchInDto {
	
	private String empId;
	
	public PunchInDto() {
		super();
	}
	
	public PunchInDto(String empId) {
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
