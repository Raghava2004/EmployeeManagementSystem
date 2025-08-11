package com.knot.ems.Service;

import com.knot.ems.Model.LoginModel;

public interface registerUser {

	LoginModel register(LoginModel login);

	String verify(LoginModel login);

}
