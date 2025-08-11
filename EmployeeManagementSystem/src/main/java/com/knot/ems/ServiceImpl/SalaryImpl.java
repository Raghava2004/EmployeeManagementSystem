package com.knot.ems.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Bo.SalaryBo;
import com.knot.ems.Dao.SalaryRepo;
import com.knot.ems.Service.SalaryService;

import jakarta.transaction.Transactional;

@Service
public class SalaryImpl implements SalaryService{

	@Autowired
	SalaryRepo salaryRepo;
	
	@Transactional
	@Override
	public SalaryBo getSalary(String id) {
		
		return salaryRepo.getSalaryById(id);
	}
	
}
