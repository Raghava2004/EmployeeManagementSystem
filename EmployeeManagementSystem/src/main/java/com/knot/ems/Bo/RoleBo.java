package com.knot.ems.Bo;
import com.knot.ems.Model.RolesModel;


public class RoleBo {
	private String role;
    private String roleDescription;
	public RoleBo() {
		super();
	}
	public RoleBo(String role, String roleDescription) {
		super();
		this.role = role;
		this.roleDescription = roleDescription;
	}
	public RoleBo(RolesModel roleByEmpId) {
		this.role=roleByEmpId.getRole();
		this.roleDescription=roleByEmpId.getDescription();
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
    
    
}
