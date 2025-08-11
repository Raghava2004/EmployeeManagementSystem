package com.knot.Banking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Model.LoginModel;
import com.knot.Banking.Service.LoginService;


@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
	
	@PostMapping("/register")
	public LoginModel register(@RequestBody LoginModel login) {
		return loginService.register(login);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody LoginModel login) {
		
		return loginService.verify(login);
	}
	
	
	
	
}
