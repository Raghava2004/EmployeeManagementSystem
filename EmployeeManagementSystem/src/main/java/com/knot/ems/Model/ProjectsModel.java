package com.knot.ems.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class ProjectsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="proj_id")
	private Integer projId;
	@Column(name="project_name")
	private String projectName;
	@Column(name="start_date")
	private  LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	public ProjectsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectsModel(Integer projId, String projectName, LocalDate startDate, LocalDate endDate) {
		super();
		this.projId = projId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
	
	
}
