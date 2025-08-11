package com.knot.ems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Bo.AttendanceBo;
import com.knot.ems.Service.StatusService;



@RestController

public class EmployeeStatusController {
	@Autowired
	StatusService statusService;
	
	@GetMapping("/checkEmployeeAttendance/{Id}")
	public AttendanceBo getEmployeeStatus(@PathVariable("Id") String Id) {
		return statusService.getEmployeeStatus(Id);
	}
	@GetMapping("/checkAttendanceLogin/{Id}")
	public AttendanceBo attendanceLogin(@PathVariable String Id) {
		return statusService.attendanceLogin(Id);
	}

}
