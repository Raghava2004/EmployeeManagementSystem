package com.knot.ems.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.ems.Dao.StatusDao;
import com.knot.ems.Model.AttendanceModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class StatusDaoImpl implements StatusDao{

	@Autowired
	EntityManager entityManager;
	@Override
	public AttendanceModel getEmployeeStatus(String id) {
		StringBuilder sb=new StringBuilder();
		sb.append("select * from attendance where emp_id=:id");
		Query nativeQuery = entityManager.createNativeQuery(sb.toString(),AttendanceModel.class);
		nativeQuery.setParameter("id", id);
		AttendanceModel singleResult = (AttendanceModel) nativeQuery.getSingleResult();
		return singleResult;
		
	}
	@Override
	public void attendanceLogin(String id) {
						
	}

}
