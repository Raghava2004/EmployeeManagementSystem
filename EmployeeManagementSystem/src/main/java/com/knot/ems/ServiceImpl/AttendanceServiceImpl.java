package com.knot.ems.ServiceImpl;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Dao.AttendanceDao;
import com.knot.ems.Dto.PunchInDto;
import com.knot.ems.Dto.PunchOutDto;
import com.knot.ems.Model.AttendanceModel;
import com.knot.ems.Service.AttendanceService;

import jakarta.transaction.Transactional;


@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	AttendanceDao attdDao;
	
	@Transactional
	@Override
	public String employeePunchIn(PunchInDto punchInDto) throws Exception {
		boolean hasActivePunchIn=attdDao.existsByEmpIdAndDateAndPunchOutIsNull(punchInDto.getEmpId());
		if(hasActivePunchIn==true) {
			throw new Exception("Already PunchedIn");
		}
		AttendanceModel attdModel1=new AttendanceModel(punchInDto);
		attdDao.employeePunchIn(attdModel1);
		return null;
	}

	@Transactional

	
	@Override
	public String employeePunchOut(PunchOutDto punchOutDto) {
		AttendanceModel attdModel2=new AttendanceModel(punchOutDto);
		Integer empId = attdModel2.getEmpId();
		LocalTime punchOut = attdModel2.getPunchOut();
		attdDao.employeePunchOut(empId,punchOut);
		return null;
	}

}
