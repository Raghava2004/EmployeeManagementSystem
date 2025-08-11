package com.knot.ems.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.ems.Dao.EmpLeaveDao;
import com.knot.ems.Model.EmpLeaveModel;

import jakarta.persistence.EntityManager;

@Repository
public class EmpLeaveDaoImpl implements EmpLeaveDao{

	@Autowired
	EntityManager entityManager;
	@Override
	public void applyLeave(EmpLeaveModel empLeaveModel) {
		entityManager.merge(empLeaveModel);
		
	}

}
