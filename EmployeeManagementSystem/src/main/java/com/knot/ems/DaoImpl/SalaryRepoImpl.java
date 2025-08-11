package com.knot.ems.DaoImpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.ems.Bo.SalaryBo;
import com.knot.ems.Dao.SalaryRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class SalaryRepoImpl implements SalaryRepo{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public SalaryBo getSalaryById(String id) {
	    BigDecimal hours = BigDecimal.ZERO;
	    BigDecimal payPerHour = BigDecimal.ZERO;
	    BigDecimal salary = BigDecimal.ZERO;

	    try {
	        // Query for total_hours
	        String sql = "SELECT SUM(total_hours) AS total_hours FROM attendance WHERE emp_id=:id";
	        Query nativeQuery = entityManager.createNativeQuery(sql);
	        nativeQuery.setParameter("id", id);
	        Object hoursResult = nativeQuery.getSingleResult();

	        if (hoursResult != null) {
	            hours = (BigDecimal) hoursResult;
	        } else {
	            // Handle null, e.g., no attendance records
	            hours = BigDecimal.ZERO;
	        }
	    } catch (Exception e) {
	        // Log error and handle exception
	        System.err.println("Error fetching total_hours for employee ID: " + id);
	        e.printStackTrace();
	        // Optionally, throw a custom exception or return null/empty object
	        throw new RuntimeException("Failed to fetch total hours", e);
	    }

	    try {
	        // Query for salary per hour
	        String sql2 = "SELECT salary FROM emp_salary WHERE emp_id=:id";
	        Query nativeQuery2 = entityManager.createNativeQuery(sql2);
	        nativeQuery2.setParameter("id", id);
	        Object payPerHourResult = nativeQuery2.getSingleResult();

	        if (payPerHourResult != null) {
	            payPerHour = (BigDecimal) payPerHourResult;
	        } else {
	            // Handle null, e.g., salary not found
	            payPerHour = BigDecimal.ZERO;
	        }
	    } catch (Exception e) {
	        // Log error and handle exception
	        System.err.println("Error fetching salary for employee ID: " + id);
	        e.printStackTrace();
	        throw new RuntimeException("Failed to fetch salary per hour", e);
	    }

	    // Calculate total salary
	    try {
	        salary = hours.multiply(payPerHour);
	    } catch (NullPointerException e) {
	        System.err.println("Null value encountered during salary calculation for employee ID: " + id);
	        e.printStackTrace();
	        throw new RuntimeException("Salary calculation failed due to null values", e);
	    }

	    // Create and return SalaryBo object
	    return new SalaryBo(id, salary, payPerHour, hours);
	}

}
