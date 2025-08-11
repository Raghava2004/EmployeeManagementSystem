package com.knot.ems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Model.LoginModel;
import com.knot.ems.Service.registerUser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@RestController
public class LoginController {
	
	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@Autowired
	registerUser loginService;
	
	
	@PostMapping("/register")
	public LoginModel register(@RequestBody LoginModel login) {
		return loginService.register(login);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody LoginModel login) {
		logger.info("The Tap Out File Generation is Started....{}");
		return loginService.verify(login);
	}
	
	
	
	
}
