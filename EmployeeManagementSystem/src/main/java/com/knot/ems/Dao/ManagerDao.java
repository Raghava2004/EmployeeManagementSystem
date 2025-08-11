package com.knot.ems.Dao;

import java.util.List;

import com.knot.ems.Model.EmployeeModel;
import com.knot.ems.Model.LeaveModel;

public interface ManagerDao {

	List<EmployeeModel> getEmployeeByManager(String id);

	EmployeeModel getManagerDetails(String id);

	List<LeaveModel> getLeaveRequest(String id);

	Integer getIdByName(String name);

}
