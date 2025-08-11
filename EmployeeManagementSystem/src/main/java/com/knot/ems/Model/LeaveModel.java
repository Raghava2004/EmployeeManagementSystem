package com.knot.ems.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leaverequests")
public class LeaveModel {
	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="reporting_status")
	private String reportingStatus;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@Column(name="reporting_manager_id")
	private Integer reportingManagerId;

	public LeaveModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveModel(Integer empId, String firstName, String reportingStatus, LocalDate startDate, LocalDate endDate,
			Integer reportingManagerId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.reportingStatus = reportingStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reportingManagerId = reportingManagerId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getReportingStatus() {
		return reportingStatus;
	}

	public void setReportingStatus(String reportingStatus) {
		this.reportingStatus = reportingStatus;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Integer getReportingManagerId() {
		return reportingManagerId;
	}

	public void setReportingManagerId(Integer reportingManagerId) {
		this.reportingManagerId = reportingManagerId;
	}
	
	

}
