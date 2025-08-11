package com.knot.Banking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.knot.Banking.Dao.LoginDao;
import com.knot.Banking.Model.LoginModel;
import com.knot.Banking.Service.LoginService;

import jakarta.transaction.Transactional;

@Service
public class LoginServiceImpl  implements LoginService{

	@Autowired
	private LoginDao registerLogin;
	
	@Autowired
	AuthenticationManager auth;
	
	@Autowired
	JWTService jwtService;
	
	
	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
	

	@Transactional
	@Override
	public LoginModel register(LoginModel login) {
		String username = login.getName();
		Integer empId = login.getEmpId();
	 login.setPassword(encoder.encode(login.getPassword()));
	 String password = login.getPassword();
	 return registerLogin.register(username,password,empId);
	}
	
	
	@Transactional
	@Override
	public String verify(LoginModel login) {
		Authentication authenticate = auth.authenticate(new UsernamePasswordAuthenticationToken(login.getName(), login.getPassword()));
		
		boolean authenticated = authenticate.isAuthenticated();
		if(authenticated) return jwtService.generatedToken(login.getName());
		
		return "fail";
		
	}


}
