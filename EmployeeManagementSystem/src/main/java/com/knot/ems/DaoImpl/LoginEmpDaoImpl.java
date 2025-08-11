package com.knot.ems.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.ems.Dao.LoginEmpDao;
import com.knot.ems.Model.EmpDetailsModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class LoginEmpDaoImpl implements LoginEmpDao{
	@Autowired
	EntityManager entityManager;

	@Override
	public EmpDetailsModel loginEmp(String mail, String password) {
			StringBuilder sb=new StringBuilder();
			sb.append("Select * from Login where mail=:mail and password=:password");
			Query qry= entityManager.createNativeQuery(sb.toString(),EmpDetailsModel.class);
			qry.setParameter("mail", mail);
			qry.setParameter("password", password);
			@SuppressWarnings("unchecked")
			List<EmpDetailsModel> singleResult = qry.getResultList();
			if(singleResult.isEmpty()) {
				return null;
			}
			else {
				return singleResult.get(0);				
			}
			
			}

	@Override
	public void forgotPW(Integer id, String newPW) {
		StringBuilder sb=new StringBuilder();
		sb.append("Update employee_details set mail_password=:new_pw where id=:id");
		Query qry= entityManager.createNativeQuery(sb.toString(),EmpDetailsModel.class);
		qry.setParameter("new_pw", newPW);
		qry.setParameter("id", id);
		qry.executeUpdate();
	}

	@Override
	public EmpDetailsModel getIdByMailId(String mail) {
		StringBuilder sb=new StringBuilder();
		sb.append("Select * from  employee_details where mail=:mail");
		Query qry= entityManager.createNativeQuery(sb.toString(),EmpDetailsModel.class);
		qry.setParameter("mail", mail);
		@SuppressWarnings("unchecked")
		List<EmpDetailsModel> resultList = qry.getResultList();
		return resultList.get(0);
	}

}
