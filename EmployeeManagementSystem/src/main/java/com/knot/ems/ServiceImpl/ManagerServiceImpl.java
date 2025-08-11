package com.knot.ems.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.ems.Bo.EmployeeBo;
import com.knot.ems.Bo.LeaveBo;
import com.knot.ems.Dao.ManagerDao;
import com.knot.ems.Model.EmployeeModel;
import com.knot.ems.Model.LeaveModel;
import com.knot.ems.Service.ManagerService;

import jakarta.transaction.Transactional;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerDao managerDao;
	@Transactional
	@Override
	public List<EmployeeBo> getEmployeeByManagerId(String id) {
		// TODO Auto-generated method stub
		List<EmployeeModel> employeeByManager = managerDao.getEmployeeByManager(id);
		List<EmployeeBo> list = new ArrayList<>();
		for(int i=0;i<employeeByManager.size();i++) {
			EmployeeModel employeeModel = employeeByManager.get(i);
			EmployeeBo employeeBo = new EmployeeBo(employeeModel);
		
			list.add(employeeBo);
		}
		return list;		
		
	}
	@Override
	public List<LeaveBo> getLeaveRequests(String id) {
		// TODO Auto-generated method stub
		 List<LeaveModel> leaveRequest = managerDao.getLeaveRequest(id);
		 List<LeaveBo> leaves=new ArrayList<>();
		 for (int i=0;i<leaveRequest.size();i++) {
			 LeaveModel leaveModel = leaveRequest.get(i);
			 LeaveBo leave=new LeaveBo(leaveModel);
			leaves.add(leave);
		}
 		return leaves;
	}
	@Override
	public List<LeaveBo> getLeaveRequestsByName(String name) {
		Integer idByName = managerDao.getIdByName(name);
		String id = idByName.toString();
		List<LeaveModel> leaveRequest = managerDao.getLeaveRequest(id);
		List<LeaveBo> leaves=new ArrayList<>();
		 for (int i=0;i<leaveRequest.size();i++) {
			 LeaveModel leaveModel = leaveRequest.get(i);
			 LeaveBo leave=new LeaveBo(leaveModel);
			leaves.add(leave);
		}
		return leaves;
		
	}

}
