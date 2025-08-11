package com.knot.ems.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee_roles")
public class EmpRolesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer EmployeeId;
	@Column(name = "roleid")
	private Integer RoleId;
	public EmpRolesModel() {
		super();
}
	public EmpRolesModel(Integer employeeId, Integer roleId) {
		super();
		EmployeeId = employeeId;
		RoleId = roleId;
	}
	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}
	public Integer getRoleId() {
		return RoleId;
	}
	public void setRoleId(Integer roleId) {
		RoleId = roleId;
	}
	
}
