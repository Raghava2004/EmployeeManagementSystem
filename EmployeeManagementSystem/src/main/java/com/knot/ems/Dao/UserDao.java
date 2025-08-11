package com.knot.ems.Dao;

import com.knot.ems.Model.LoginModel;

public interface UserDao {

	LoginModel findByUsername(String username);

}
