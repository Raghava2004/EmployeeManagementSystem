package com.knot.ems.Service;

import com.knot.ems.Bo.AttendanceBo;

public interface StatusService {

	AttendanceBo getEmployeeStatus(String id);

	AttendanceBo attendanceLogin(String id);

}
