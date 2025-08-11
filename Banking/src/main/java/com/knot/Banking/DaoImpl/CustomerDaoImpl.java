package com.knot.Banking.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.Banking.Dao.CustomerDao;
import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Model.CustomerModel;

import jakarta.persistence.EntityManager;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	EntityManager entityManager;
	@Override
	public String addCustomerInfo(CustomerDto customerDto) {
		CustomerModel customerModel=new CustomerModel(customerDto);
		entityManager.merge(customerModel);
		
		return null;
	}

}
