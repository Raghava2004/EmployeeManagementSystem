package com.knot.ems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Dto.EmpLeaveDto;
import com.knot.ems.Service.EmpLeaveService;

@RestController
public class EmpLeaveController {
	@Autowired
	EmpLeaveService empLeaveService;
	@PostMapping("/applyLeave")
	public void applyLeave(@RequestBody EmpLeaveDto empLeaveDto) throws Exception {
		empLeaveService.applyLeave(empLeaveDto);
	}

}
