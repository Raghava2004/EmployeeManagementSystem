package com.knot.ems.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.ems.Dao.ManagerDao;
import com.knot.ems.Model.EmployeeModel;
import com.knot.ems.Model.LeaveModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
@Repository
public class ManagerDaoImpl implements ManagerDao{

	@Autowired
	EntityManager entityManager;
	@Override
	public List <EmployeeModel> getEmployeeByManager(String id) {
		String sql="select * from employees where reporting_manager_id=:id";
		Query nativeQuery = entityManager.createNativeQuery(sql,EmployeeModel.class);
		nativeQuery.setParameter("id", id);
		@SuppressWarnings("unchecked")
		List <EmployeeModel> empDet = nativeQuery.getResultList();
		return empDet;
	}
	@Override
	public EmployeeModel getManagerDetails(String id) {
		String sql="select * from employees where emp_id=:id";
		Query nativeQuery = entityManager.createNativeQuery(sql,EmployeeModel.class);
		nativeQuery.setParameter("id", id);
		@SuppressWarnings("unchecked")
		List <EmployeeModel> empDet = nativeQuery.getResultList();
		return  empDet.get(0);
	}
	@Override
	public List<LeaveModel> getLeaveRequest(String reportingManagerId) {
	    String sql = "SELECT * FROM leaverequests WHERE reporting_manager_id = :id";

	    Query nativeQuery = entityManager.createNativeQuery(sql,LeaveModel.class);
	    nativeQuery.setParameter("id", reportingManagerId);
	    @SuppressWarnings("unchecked")
	    List<LeaveModel> results = nativeQuery.getResultList();
	    return results;
	}
	@Override
	public Integer getIdByName(String name) {
		String sql = "SELECT emp_id FROM employees WHERE firstname= :name";

	    Query nativeQuery = entityManager.createNativeQuery(sql);
	    nativeQuery.setParameter("name", name);
	  
	     Integer singleResult = (Integer) nativeQuery.getSingleResult();
	    return singleResult;
		
		

	   // TODO Auto-generated method stub
		
	}

}
