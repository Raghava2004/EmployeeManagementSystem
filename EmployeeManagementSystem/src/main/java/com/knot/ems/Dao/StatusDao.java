package com.knot.ems.Dao;

import com.knot.ems.Model.AttendanceModel;

public interface StatusDao {

	AttendanceModel getEmployeeStatus(String id);

	void attendanceLogin(String id);

}
