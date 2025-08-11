package com.knot.ems.Model;

import com.knot.ems.Dto.RoleDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "roles")
public class RolesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roleid")
	private Integer roleId;
	@Column(name = "role")
	private String role;
	@Column(name = "description")
	private String description;
	public RolesModel() {
		super();
	}
	public RolesModel(Integer roleId, String role, String description) {
		super();
		this.roleId = roleId;
		this.role = role;
		this.description = description;
	}
	public RolesModel(RoleDto roleDto) {
		this.role=roleDto.getRole();
		this.description=roleDto.getRoleDescription();
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}