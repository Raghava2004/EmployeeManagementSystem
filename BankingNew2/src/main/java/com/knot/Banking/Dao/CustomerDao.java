package com.knot.Banking.Dao;

import java.util.List;

import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.CardModel;
import com.knot.Banking.Model.CustomerModel;

public interface CustomerDao {

	CustomerModel getCustomerById(String id);

	AccountModel getAccountByCustomerId(String id);

	CardModel getCardByCustomerId(Integer id);

	List<CustomerModel> getAllCustomers();



}
