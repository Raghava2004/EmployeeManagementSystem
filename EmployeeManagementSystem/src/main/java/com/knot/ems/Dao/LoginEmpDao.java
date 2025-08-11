package com.knot.ems.Dao;

import com.knot.ems.Model.EmpDetailsModel;

public interface LoginEmpDao {

	EmpDetailsModel loginEmp(String mail, String password);


	void forgotPW(Integer id, String newPW);


	EmpDetailsModel getIdByMailId(String mail);

}
