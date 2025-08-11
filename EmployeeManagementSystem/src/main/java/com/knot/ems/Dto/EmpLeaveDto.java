package com.knot.ems.Dto;

public class EmpLeaveDto {
	private String empId;
	private String reportingStatus;
	private String startDate;
	private String endDate;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getReportingStatus() {
		return reportingStatus;
	}
	public void setReportingStatus(String reportingStatus) {
		this.reportingStatus = reportingStatus;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public EmpLeaveDto(String empId, String reportingStatus, String startDate, String endDate) {
		super();
		this.empId = empId;
		this.reportingStatus = reportingStatus;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public EmpLeaveDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
