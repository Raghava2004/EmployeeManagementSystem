package com.knot.ems.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Bo.EmployeeBo;
import com.knot.ems.Bo.LeaveBo;
import com.knot.ems.Service.ManagerService;

@RestController
public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
	
	@GetMapping("/getEmployeesByManager/{Id}")
	public List<EmployeeBo> getEmployee(@PathVariable String Id) {
		return managerService.getEmployeeByManagerId(Id);
	}
	@GetMapping("/getLeaveRequests/{Id}")
	public List<LeaveBo> getLeaveRequests(@PathVariable String Id) {
		return managerService.getLeaveRequests(Id);
	}
	
	@GetMapping("/getLeaveRequestsByName/{name}")
	public List<LeaveBo> getLeaveRequestsByName(@PathVariable String name) {
		return managerService.getLeaveRequestsByName(name);
	}
	
	

}
