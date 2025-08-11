package com.knot.ems.Bo;

import com.knot.ems.Model.EmpProjectsModel;

import jakarta.persistence.Transient;

public class EmpProjBo {
	private String projectRole;
	@Transient
	ProjectBo projBo;
	public EmpProjBo(String projectRole) {
		super();
		this.projectRole = projectRole;
	}
	public EmpProjBo() {
		super();
	}
	public EmpProjBo(EmpProjectsModel employeeProjectsByEmpId) {
		this.projectRole=employeeProjectsByEmpId.getProjectRole();
		
	}

	public String getProjectRole() {
		return projectRole;
	}
	public void setProjectRole(String projectRole) {
		this.projectRole = projectRole;
	}
	public ProjectBo getProjBo() {
		return projBo;
	}
	public void setProjBo(ProjectBo projBo) {
		this.projBo = projBo;
	}
	
}
