package com.knot.ems.Service;

import java.util.List;

import com.knot.ems.Bo.EmployeeBo;
import com.knot.ems.Bo.LeaveBo;

public interface ManagerService {

	List<EmployeeBo> getEmployeeByManagerId(String id);

	List<LeaveBo> getLeaveRequests(String id);

	List<LeaveBo> getLeaveRequestsByName(String name);

}