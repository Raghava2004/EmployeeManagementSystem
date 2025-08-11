package com.knot.ems.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Bo.DepartmentBo;
import com.knot.ems.Bo.EmpProjBo;
import com.knot.ems.Bo.EmployeeBo;
import com.knot.ems.Bo.ProjectBo;
import com.knot.ems.Bo.RoleBo;
import com.knot.ems.Bo.SalaryBo;
import com.knot.ems.Dao.EmpDao;
import com.knot.ems.Dao.SalaryRepo;
import com.knot.ems.Dto.DepartmentDto;
import com.knot.ems.Dto.EmployeeDto;
import com.knot.ems.Dto.RoleDto;
import com.knot.ems.Model.DepartmentModel;
import com.knot.ems.Model.EmpProjectsModel;
import com.knot.ems.Model.EmpRolesModel;
import com.knot.ems.Model.EmployeeModel;
import com.knot.ems.Model.ProjectsModel;
import com.knot.ems.Model.RolesModel;
import com.knot.ems.Service.EmpService;

import jakarta.transaction.Transactional;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpDao empDao;
	
	@Autowired
	SalaryRepo salaryRepo;
	
	@Transactional
	@Override
	public void saveDepartments(DepartmentDto deptDto) {
		DepartmentModel departmentModel=new DepartmentModel(deptDto);
		empDao.saveDepartment(departmentModel);
	}

	@Transactional
	@Override
	public void saveRoles(RoleDto roleDto) {
		RolesModel role=new RolesModel(roleDto);	
		empDao.saveRoles(role);	
	}

	@Transactional
	@Override
	public void saveEmployeeData(EmployeeDto empDto) {
		EmployeeModel empModel=new EmployeeModel(empDto);
		empDao.saveEmployeeData(empModel);
		
	}
	
	@Transactional
	@Override
	public List<EmployeeBo> getAllEmployees() {
	    List<EmployeeModel> allEmployees = empDao.getAllEmployees();
	    List<EmployeeBo> employeeList = new ArrayList<>();
	    for (EmployeeModel employeeModel : allEmployees) {
	        String empId = employeeModel.getEmpId().toString();

	        // Fetch department
	        DepartmentModel departmentById = empDao.getDepartmentById(employeeModel.getDeptId());
	        DepartmentBo deptBo = new DepartmentBo(departmentById);

	        EmployeeBo emp = new EmployeeBo(employeeModel);

	        // Fetch role
	        EmpRolesModel empRolesByEmpId = empDao.getEmpRolesByEmpId(empId);
	        if (empRolesByEmpId == null) {
	            throw new RuntimeException("Role not found for employee ID: " + empId);
	        }
	        Integer roleId = empRolesByEmpId.getRoleId();
	        RolesModel rolesByRoleId = empDao.getRolesByRoleId(roleId);
	        if (rolesByRoleId == null) {
	            throw new RuntimeException("Role details not found for role ID: " + roleId);
	        }
	        RoleBo role = new RoleBo(rolesByRoleId);

	        // Fetch project
	        EmpProjectsModel employeeProjectsByEmpId = empDao.getEmployeeProjectsByEmpId(empId);
	        if (employeeProjectsByEmpId == null) {
	            throw new RuntimeException("Project not found for employee ID: " + empId);
	        }
	        EmpProjBo empProject = new EmpProjBo(employeeProjectsByEmpId);
	        Integer projId = employeeProjectsByEmpId.getProjId();
	        ProjectsModel projectByProjId = empDao.getProjectByProjId(projId);
	        if (projectByProjId == null) {
	            throw new RuntimeException("Project details not found for project ID: " + projId);
	        }
	        ProjectBo projectBo = new ProjectBo(projectByProjId);
	        empProject.setProjBo(projectBo);

	        // Fetch salary
	        SalaryBo salaryById = salaryRepo.getSalaryById(empId);
	        if (salaryById == null) {
	            throw new RuntimeException("Salary not found for employee ID: " + empId);
	        }

	        // Set data into employee object
	        emp.setSalary(salaryById);
	        emp.setProject(empProject);
	        emp.setDepartment(deptBo);
	        emp.setRole(role);

	        employeeList.add(emp);
	    }
	    return employeeList;
	}

	@Transactional
	@Override
	public EmployeeBo getEmployeeById(String id) {
		EmployeeModel employeeById = empDao.getEmployeeById(id);
		Integer deptId = employeeById.getDeptId();
		EmployeeBo emp=new EmployeeBo(employeeById);
		
		
		DepartmentModel departmentById = empDao.getDepartmentById(deptId);
		DepartmentBo deptBo=new DepartmentBo(departmentById);
		
		
		EmpRolesModel empRolesByEmpId = empDao.getEmpRolesByEmpId((String) id);
		Integer roleId = empRolesByEmpId.getRoleId();
		
		RolesModel rolesByRoleId = empDao.getRolesByRoleId(roleId);
		RoleBo roleBo = new RoleBo(rolesByRoleId);
		
		SalaryBo salaryById = salaryRepo.getSalaryById((String) id);
		
		
		EmpProjectsModel employeeProjectsByEmpId = empDao.getEmployeeProjectsByEmpId((String) id);
		EmpProjBo empProject=new EmpProjBo(employeeProjectsByEmpId);
		Integer projId = employeeProjectsByEmpId.getProjId();
		ProjectsModel projectByProjId = empDao.getProjectByProjId(projId);
		ProjectBo projectBo=new ProjectBo(projectByProjId);
		
		empProject.setProjBo(projectBo);
		emp.setProject(empProject);
		emp.setSalary(salaryById);
		emp.setDepartment(deptBo);
		emp.setRole(roleBo);
		
		
		return emp;
	}

	@Override
	public List<EmployeeBo> getEmpByRole(String role) {
		Integer roleIdByRole = empDao.getRoleIdByRole(role);
		List<Integer> empByRoleId = empDao.getEmpByRoleId(roleIdByRole);
		List<EmployeeBo> employeeBo= new ArrayList<>();
		for(int i=0;i<empByRoleId.size();i++) {
			Integer integer = empByRoleId.get(i);
			EmployeeModel employeeById = empDao.getEmployeeById(integer);
			EmployeeBo employeeBo2 = new EmployeeBo(employeeById); 
			employeeBo.add(employeeBo2);
		}
		return employeeBo;			
		
		
			}

}
