package com.knot.ems.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.ems.Dto.PunchInDto;
import com.knot.ems.Dto.PunchOutDto;
import com.knot.ems.Service.AttendanceService;

@RestController
public class PunchController {
	@Autowired
	AttendanceService attdService;

	@PostMapping("/EmployeePunchIn")
	public String employeePunchIn(@RequestBody PunchInDto punchInDto) throws Exception {
		return attdService.employeePunchIn(punchInDto);		
	}
	
	@PostMapping("/EmployeePunchOut")
	public String employeePunchOut(@RequestBody PunchOutDto punchOutDto) {
		return attdService.employeePunchOut(punchOutDto);		
	}

}
