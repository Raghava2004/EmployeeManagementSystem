package com.knot.ems.Bo;

import com.knot.ems.Model.ProjectsModel;

public class ProjectBo {
	private String projName;
	private String startDate;
	private String endDate;
	public ProjectBo() {
		super();
	}
	public ProjectBo(String projName, String startDate, String endDate) {
		super();
		this.projName = projName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public ProjectBo(ProjectsModel projectByProjId) {
		this.projName=projectByProjId.getProjectName();
		this.startDate=projectByProjId.getStartDate().toString();
		this.endDate=projectByProjId.getEndDate().toString();
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
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
	
	
	
}
