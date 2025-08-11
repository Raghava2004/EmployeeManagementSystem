package com.knot.Banking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Service.LoginService;

@Service
public class LoginServiceImpl  implements LoginService{


	@Autowired
	AuthenticationManager auth;
	
	@Autowired
	JWTService jwtService;
	


	@Override
	public void depositCash(DepositCashDto cash) {
		
	}


}
