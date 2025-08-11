package com.knot.ems.Dao;

import java.time.LocalTime;

import com.knot.ems.Model.AttendanceModel;

public interface AttendanceDao {

	void employeePunchIn(AttendanceModel attdModel);


	void employeePunchOut(Integer empId, LocalTime punchOut);


	boolean existsByEmpIdAndDateAndPunchOutIsNull(String empId);

}
