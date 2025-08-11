package com.knot.ems.Service;

import com.knot.ems.Dto.PunchInDto;
import com.knot.ems.Dto.PunchOutDto;

public interface AttendanceService {

	String employeePunchIn(PunchInDto punchInDto) throws Exception;

	String employeePunchOut(PunchOutDto punchOutDto);

}
