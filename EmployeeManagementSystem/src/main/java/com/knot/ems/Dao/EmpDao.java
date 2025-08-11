package com.knot.ems.Dao;

import java.util.List;

import com.knot.ems.Model.DepartmentModel;
import com.knot.ems.Model.EmpProjectsModel;
import com.knot.ems.Model.EmpRolesModel;
import com.knot.ems.Model.EmployeeModel;
import com.knot.ems.Model.ProjectsModel;
import com.knot.ems.Model.RolesModel;

public interface EmpDao {


	void saveDepartment(DepartmentModel departmentModel);

	void saveRoles(RolesModel roles);

	void saveEmployeeData(EmployeeModel empModel);

	List<EmployeeModel> getAllEmployees();

	DepartmentModel getDepartmentById(Integer deptId);

	EmpRolesModel getEmpRolesByEmpId(String id);

	RolesModel getRolesByRoleId(Integer roleId);
	
	<T> EmployeeModel getEmployeeById(T id);

	EmpProjectsModel getEmployeeProjectsByEmpId(String id);

	ProjectsModel getProjectByProjId(Integer projId);

	Integer getRoleIdByRole(String role);

	List<Integer> getEmpByRoleId(Integer roleIdByRole);

	

}
