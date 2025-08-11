package com.knot.ems.Bo;

import com.knot.ems.Model.AttendanceModel;

public class AttendanceBo{
	private String reportingStatus;

	public AttendanceBo() {
		super();
	}

	public AttendanceBo(AttendanceModel employeeStatus) {
		this.reportingStatus=employeeStatus.getReportingStatus();
	}

	public String getReportingStatus() {
		return reportingStatus;
	}

	public void setReportingStatus(String reportingStatus) {
		this.reportingStatus = reportingStatus;
	}

}
