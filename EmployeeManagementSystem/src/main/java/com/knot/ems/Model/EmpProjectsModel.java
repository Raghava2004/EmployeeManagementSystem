package com.knot.ems.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee_projects")
public class EmpProjectsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer EmpId;
	@Column(name = "proj_id")
	private Integer projId;
	@Column(name = "role_inproj")
	private String ProjectRole;
	public EmpProjectsModel() {
		super();
	}
	public EmpProjectsModel(Integer empId, Integer projId, String projectRole) {
		super();
		EmpId = empId;
		this.projId = projId;
		ProjectRole = projectRole;
	}
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjectRole() {
		return ProjectRole;
	}
	public void setProjectRole(String projectRole) {
		ProjectRole = projectRole;
	}
	
	
	
	
}
