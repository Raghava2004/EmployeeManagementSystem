package com.knot.Banking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("/addCustomerInfo")
	public String addCustomerInfo(@RequestBody CustomerDto customerDto) {
		return registrationService.addCustomerInfo(customerDto);
	}
	

}

