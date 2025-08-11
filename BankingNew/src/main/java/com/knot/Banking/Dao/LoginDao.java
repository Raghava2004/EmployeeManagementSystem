package com.knot.Banking.Dao;

import com.knot.Banking.Model.LoginModel;

public interface LoginDao {

	LoginModel getByUserName(String username);



	LoginModel register(String username, String password,Integer empId);

	

}
