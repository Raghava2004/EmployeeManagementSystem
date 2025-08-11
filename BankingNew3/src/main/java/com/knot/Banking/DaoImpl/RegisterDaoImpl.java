package com.knot.Banking.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.Banking.Dao.RegisterDao;
import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.CardModel;
import com.knot.Banking.Model.CustomerModel;

import jakarta.persistence.EntityManager;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	@Autowired
	EntityManager entityManager;

	@Override
	public AccountModel addAccountIfo(AccountModel accountModel) {
		// TODO Auto-generated method stub
		return entityManager.merge(accountModel);
	}

	@Override
	public CustomerModel addCustomerInfo(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		return entityManager.merge(customerModel);

	}

	@Override
	public void addCardInfo(CardModel cards) {
		// TODO Auto-generated method stub
		entityManager.merge(cards);
		
	}

	

}
