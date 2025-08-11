package com.knot.ems.Model;

import com.knot.ems.Dto.DepartmentDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentModel {
	public DepartmentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentModel(DepartmentDto deptDto) {
		// TODO Auto-generated constructor stub
		this.deptName=deptDto.getDeptName();
		this.Description=deptDto.getDeptDescription();
	}
	

	
	public DepartmentModel(Integer deptId, String deptName, String description) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		Description = description;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}





	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private Integer deptId;
	@Column(name = "dept_name")
	private String deptName;
	@Column(name = "description")
	private String Description;
	
}
