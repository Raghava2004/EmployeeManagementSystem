package com.knot.Banking.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.Banking.Dao.LoginDao;
import com.knot.Banking.Model.LoginModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
	@Override
    public LoginModel getByUserName(String username) {
        String sql = "select * from user where name = :username";
        Query nativeQuery = entityManager.createNativeQuery(sql, LoginModel.class);
        nativeQuery.setParameter("username", username);
        List<LoginModel> results = nativeQuery.getResultList();
        if (results.isEmpty()) {
        	System.out.println("User Doesnt Exists");
            return null; // No user found
        } else {
        	System.out.println("User Exists");
            return results.get(0);
        }
    }

    @Override
    public LoginModel register(String username, String password,Integer empId) {
        String sql = "INSERT INTO user (emp_id,name, password) VALUES (:empId,:username, :password)";
        Query nativeQuery = entityManager.createNativeQuery(sql);
        nativeQuery.setParameter("empId", empId);
        nativeQuery.setParameter("username", username);
        nativeQuery.setParameter("password", password);
        nativeQuery.executeUpdate();
        return getByUserName(username);
    }
}