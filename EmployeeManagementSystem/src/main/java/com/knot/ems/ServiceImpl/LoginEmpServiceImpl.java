package com.knot.ems.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Dao.LoginEmpDao;
import com.knot.ems.Dto.ForgotPwDto;
import com.knot.ems.Dto.LoginEmpDto;
import com.knot.ems.Model.EmpDetailsModel;
import com.knot.ems.Service.LoginEmpService;

import jakarta.transaction.Transactional;

@Service

public class LoginEmpServiceImpl implements LoginEmpService{
	@Autowired
	LoginEmpDao loginEmpDao;
	@Transactional
	public String loginEmployee(LoginEmpDto loginEmpDto) {
		String mail = loginEmpDto.getMail();
		String password = loginEmpDto.getPassword();
		EmpDetailsModel loginEmp = loginEmpDao.loginEmp(mail,password);
		if(loginEmp==null) {
			return "Not a user";
		}
		else {
			return "Login Successful";
		}
		
	}
	@Transactional
	public String forgotPassword(ForgotPwDto forgotPwDto) {
		String mail = forgotPwDto.getMail();
		String newPW=forgotPwDto.getNewPw();
		Integer Id=loginEmpDao.getIdByMailId(mail).getEmployee_id();
		loginEmpDao.forgotPW(Id,newPW);
		return null;
	}

}
