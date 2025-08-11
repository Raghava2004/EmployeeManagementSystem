package com.knot.Banking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addCustomerInfo")
	public CustomerDto addCustomerInfo(@RequestBody CustomerDto customerDto) {
		return customerDto;
		//return customerService.addCustomerInfo(customerDto);
	}
}
