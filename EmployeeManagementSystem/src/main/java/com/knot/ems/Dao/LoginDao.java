package com.knot.ems.Dao;

import com.knot.ems.Model.LoginModel;

public interface LoginDao {

	LoginModel getByUserName(String username);



	LoginModel register(String username, String password,Integer empId);

	

}
