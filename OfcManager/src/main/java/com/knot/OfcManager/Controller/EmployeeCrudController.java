package com.knot.OfcManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.OfcManager.Dto.EmployeeCrudDto;
import com.knot.OfcManager.Service.EmployeeCrudService;

@RestController
public class EmployeeCrudController {
	
	@Autowired
	EmployeeCrudService empCrudService;
	
	@PostMapping("/saveEmployeeData")
	public void saveEmData(@RequestBody EmployeeCrudDto empDto) {
		empCrudService.saveEmData(empDto);
		
	}
}
