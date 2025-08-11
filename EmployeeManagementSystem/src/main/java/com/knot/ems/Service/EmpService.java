package com.knot.ems.Service;

import java.util.List;

import com.knot.ems.Bo.EmployeeBo;
import com.knot.ems.Dto.DepartmentDto;
import com.knot.ems.Dto.EmployeeDto;
import com.knot.ems.Dto.RoleDto;

public interface EmpService {

	void saveDepartments(DepartmentDto deptDto);

	void saveRoles(RoleDto roleDto);

	void saveEmployeeData(EmployeeDto empDto);

	List<EmployeeBo> getAllEmployees();


	List<EmployeeBo> getEmpByRole(String role);

	EmployeeBo getEmployeeById(String id);

}
