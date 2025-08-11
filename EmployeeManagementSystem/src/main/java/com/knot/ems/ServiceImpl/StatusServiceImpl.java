package com.knot.ems.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Bo.AttendanceBo;
import com.knot.ems.Dao.StatusDao;
import com.knot.ems.Model.AttendanceModel;
import com.knot.ems.Service.StatusService;

import jakarta.transaction.Transactional;

@Service
public class StatusServiceImpl implements StatusService{

	@Autowired
	StatusDao statusDao;
	@Transactional
	@Override
	public AttendanceBo getEmployeeStatus(String id) {
		AttendanceModel employeeStatus = statusDao.getEmployeeStatus(id);
		AttendanceBo attendance=new AttendanceBo(employeeStatus);
		return attendance;
	}
	@Override
	public AttendanceBo attendanceLogin(String id) {
		statusDao.attendanceLogin(id);
		return null;
	}

}
