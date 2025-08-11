package com.knot.Banking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Service.LoginService;


@RestController
public class LoginController {
	@Autowired
	LoginService loginService;

	
	@PostMapping("/depositCcash")
	public void depositCash(@RequestBody DepositCashDto cash) {
		loginService.depositCash(cash);
		return;
	}
	
	
}
