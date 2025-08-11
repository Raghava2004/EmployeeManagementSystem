package com.knot.ems.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.knot.ems.Bo.DepositCashDto;
import com.knot.ems.Dao.SalaryRepo;
import com.knot.ems.Service.BankService;

import jakarta.transaction.Transactional;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	SalaryRepo salary;

	@Transactional
	@Override
	public DepositCashDto depositEmpSalary(String id) {
		DepositCashDto salaryById = new DepositCashDto(salary.getSalaryById(id));
		return salaryById;
	}
	
	@Override
	public void depositCash(String id) {
		DepositCashDto depositEmpSalary = depositEmpSalary(id);
		@SuppressWarnings("unused")
		String token= "Authorization: Bearer";
		restTemplate.postForLocation("http://localhost:8080/depositCash", depositEmpSalary);
	}
	
}
