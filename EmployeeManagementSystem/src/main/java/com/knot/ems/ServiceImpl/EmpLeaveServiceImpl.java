package com.knot.ems.ServiceImpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Dao.EmpLeaveDao;
import com.knot.ems.Dto.EmpLeaveDto;
import com.knot.ems.Model.EmpLeaveModel;
import com.knot.ems.Service.EmpLeaveService;

import jakarta.transaction.Transactional;

@Service
public class EmpLeaveServiceImpl implements EmpLeaveService{

	@Autowired
	EmpLeaveDao empLeaveDao;
	@Transactional
	@Override
	public void applyLeave(EmpLeaveDto empLeaveDto) throws Exception {
		EmpLeaveModel empLeaveModel=new EmpLeaveModel(empLeaveDto);
		if(!empLeaveModel.getDateApplied().isBefore(LocalDate.now()) && !empLeaveModel.getEndDate().isBefore(empLeaveModel.getDateApplied())) {
			empLeaveDao.applyLeave(empLeaveModel);
		}
		else {
			throw new Exception("Enter Correct Date");
		}
		
	}

}
