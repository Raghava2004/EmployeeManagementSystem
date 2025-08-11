package com.knot.ems.Bo;

import com.knot.ems.Model.LeaveModel;

public class LeaveBo {
	private String empId;
	
	private String firstname;
	
	private String reportingStatus;
	
	private String startDate;
	
	private String endDate;
	
	private String dateApplied;
	
	private String reporting_manager_id;

	public LeaveBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveBo(String empId, String firstname, String reportingStatus, String startDate, String endDate,
			String dateApplied, String reporting_manager_id) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.reportingStatus = reportingStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dateApplied = dateApplied;
		this.reporting_manager_id = reporting_manager_id;
	}

	public LeaveBo(LeaveModel leaveModel) {
		// TODO Auto-generated constructor stub
		this.empId=leaveModel.getEmpId().toString();
		this.firstname=leaveModel.getFirstName();
		this.startDate=leaveModel.getStartDate().toString();
		this.endDate=leaveModel.getEndDate().toString();
		this.reportingStatus=leaveModel.getReportingStatus();		
		this.reporting_manager_id=leaveModel.getReportingManagerId().toString();
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
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

	public String getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(String dateApplied) {
		this.dateApplied = dateApplied;
	}

	public String getReporting_manager_id() {
		return reporting_manager_id;
	}

	public void setReporting_manager_id(String reporting_manager_id) {
		this.reporting_manager_id = reporting_manager_id;
	}
	
	
	
}
