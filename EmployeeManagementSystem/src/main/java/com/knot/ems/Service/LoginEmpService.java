package com.knot.ems.Service;

import com.knot.ems.Dto.ForgotPwDto;
import com.knot.ems.Dto.LoginEmpDto;

public interface LoginEmpService {

	String loginEmployee(LoginEmpDto loginEmpDto);

	String forgotPassword(ForgotPwDto forgotPwDto);

}
