

package com.knot.ems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Bo.SalaryBo;
import com.knot.ems.Service.SalaryService;

@RestController
public class SalaryController {
	
	@Autowired
	SalaryService salary;
	
	@PostMapping("/getSalaryById/{Id}")
	public SalaryBo getSalaryById(@PathVariable String Id) {
		return salary.getSalary(Id);		
	}

}
