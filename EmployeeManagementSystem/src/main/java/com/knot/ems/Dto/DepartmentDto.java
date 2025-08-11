package com.knot.ems.Dto;

public class DepartmentDto {
	private String deptName;
	private String deptDescription;
	
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDescription() {
		return deptDescription;
	}
	public void setDeptDescription(String deptDescription) {
		this.deptDescription = deptDescription;
	}
	public DepartmentDto(String deptName, String deptDescription) {
		super();
		this.deptName = deptName;
		this.deptDescription = deptDescription;
	}
	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
