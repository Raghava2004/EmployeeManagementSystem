package com.knot.ems.Model;

import java.time.LocalDate;

import com.knot.ems.Dto.EmpLeaveDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leaves")
public class EmpLeaveModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="leave_id ")
	private Integer leaveId;
	@Column(name="emp_id")
	private Integer empId;
	@Column(name="reporting_status")
	private String reportingStatus;
	@Column(name="date_applied")
	private LocalDate dateApplied;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	@Column(name="leave_status")
	private String leaveStatus;
	public EmpLeaveModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpLeaveModel(Integer leaveId, Integer empId, String reportingStatus, LocalDate dateApplied,
			LocalDate startDate, LocalDate endDate, String leaveStatus) {
		super();
		this.leaveId = leaveId;
		this.empId = empId;
		this.reportingStatus = reportingStatus;
		this.dateApplied = dateApplied;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveStatus = leaveStatus;
	}
	public EmpLeaveModel(EmpLeaveDto empLeaveDto) {
		// TODO Auto-generated constructor stub
		this.empId=Integer.parseInt(empLeaveDto.getEmpId());
		this.dateApplied=LocalDate.now();
		this.startDate=LocalDate.parse(empLeaveDto.getStartDate());
		this.endDate=LocalDate.parse(empLeaveDto.getEndDate());
		this.reportingStatus=empLeaveDto.getReportingStatus();
		
	}
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getReportingStatus() {
		return reportingStatus;
	}
	public void setReportingStatus(String reportingStatus) {
		this.reportingStatus = reportingStatus;
	}
	public LocalDate getDateApplied() {
		return dateApplied;
	}
	public void setDateApplied(LocalDate dateApplied) {
		this.dateApplied = dateApplied;
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
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

}
