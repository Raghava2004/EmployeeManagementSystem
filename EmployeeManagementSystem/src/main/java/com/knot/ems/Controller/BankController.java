package com.knot.ems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Service.BankService;

@RestController
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@PostMapping("/depositEmpSalary/{Id}")
	public void depositCash(@PathVariable String Id) {
		bankService.depositCash(Id);
		
	}
}
