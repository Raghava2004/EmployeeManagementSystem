package com.knot.ems.Dto;

public class RoleDto {

    private String role;
    private String roleDescription;

    public RoleDto() {
        super();
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

    public RoleDto(String role, String roleDescription) {
        super();
        this.role = role;
        this.roleDescription = roleDescription;
    }
}