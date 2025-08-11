package com.knot.ems.Bo;

import com.knot.ems.Model.DepartmentModel;

public class DepartmentBo {
	private String deptName;
	private String deptDescription;
	public DepartmentBo() {
		super();
	}
	public DepartmentBo(String deptName, String deptDescription) {
		super();
		this.deptName = deptName;
		this.deptDescription = deptDescription;
	}
	public DepartmentBo(DepartmentModel departmentById) {
		this.deptName=departmentById.getDeptName();
		this.deptDescription=departmentById.getDescription();
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDescription() {
		return deptDescription;
	}
	public void setDeptDescription(String deptDescription) {
		this.deptDescription = deptDescription;
	}
	
}
