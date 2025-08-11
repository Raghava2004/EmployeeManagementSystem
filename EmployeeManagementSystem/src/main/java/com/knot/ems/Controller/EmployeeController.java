package com.knot.ems.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Bo.EmployeeBo;
import com.knot.ems.Dto.DepartmentDto;
import com.knot.ems.Dto.EmployeeDto;
import com.knot.ems.Dto.RoleDto;
import com.knot.ems.Service.EmpService;

@RestController
public class EmployeeController {
	@Autowired
	
	EmpService empService;
	
	@PostMapping("/saveDepartments")
	public void saveDepartments(@RequestBody DepartmentDto deptDto) {
		
		empService.saveDepartments(deptDto);
	}
	
	@PostMapping("/saveRoles")
	public void saveRoles(@RequestBody RoleDto roleDto) {
		
		empService.saveRoles(roleDto);
	}
	
	@PostMapping("/saveEmployeeData")
	public void saveEmployeeData(@RequestBody EmployeeDto empDto) {
		empService.saveEmployeeData(empDto);
	}
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeBo> getAllEmployees() {
		return empService.getAllEmployees();
		
	}
	@GetMapping("/getEmployeeById/{Id}")
	public EmployeeBo getEmployeeById(@PathVariable String Id) {
		return empService.getEmployeeById(Id);
	}
	
	@GetMapping("getEmpByRole/{role}")
	public List<EmployeeBo> getEmpByRole(@PathVariable String role) {
		return empService.getEmpByRole(role);
	}

}
