package com.knot.ems.DaoImpl;

import java.time.Duration;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.ems.Dao.AttendanceDao;
import com.knot.ems.Model.AttendanceModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


@Repository

public class AttendanceDaoImpl implements AttendanceDao {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void employeePunchIn(AttendanceModel attdModel) {
		entityManager.persist(attdModel);
	}

	@Override
	public void employeePunchOut(Integer empId, LocalTime punchOut) {
		
		AttendanceModel openRecord=findLatestOpenRecord(empId);
		if(openRecord!=null) {
			openRecord.setPunchOut(punchOut);
			entityManager.merge(openRecord);
			Double totalHours=calculateTotalHours(openRecord);
			openRecord.setTotalHours(totalHours);		
			entityManager.merge(openRecord);
		}
		
	}

	private Double calculateTotalHours(AttendanceModel openRecord) {
		// TODO Auto-generated method stub
		if(openRecord.getPunchIn()!=null && openRecord.getPunchOut()!=null) {
			Duration duration=Duration.between(openRecord.getPunchIn()	,openRecord.getPunchOut());
			return duration.toMinutes()/60.0;
			
		}
		
		return 0.0;
	}

	private AttendanceModel findLatestOpenRecord(Integer empId) {
	    String sql = "SELECT * FROM attendance WHERE emp_id = :empId AND punch_out IS NULL ORDER BY punch_in DESC LIMIT 1";
	    Query nativeQuery = entityManager.createNativeQuery(sql, AttendanceModel.class);
	    nativeQuery.setParameter("empId", empId);
	    try {
	        return (AttendanceModel) nativeQuery.getSingleResult();
	    } catch (Exception e) {
	        return null; // No open record found
	    }
	}

	@Override
	public boolean existsByEmpIdAndDateAndPunchOutIsNull(String empId) {
		String sql = "SELECT * FROM attendance WHERE emp_id = :empId AND punch_out IS NULL and punch_in is not null";
	    Query nativeQuery = entityManager.createNativeQuery(sql, AttendanceModel.class);
	    nativeQuery.setParameter("empId", empId);
	    try {
	         if((AttendanceModel) nativeQuery.getSingleResult()!=null) {
	        	 return true;
	         };
	    } catch (Exception e) {
	        return false; // No open record found
	    }

		return false;
	}
}
