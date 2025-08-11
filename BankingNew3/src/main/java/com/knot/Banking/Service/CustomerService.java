package com.knot.Banking.Service;

import java.util.List;

import com.knot.Banking.Bo.AccountBo;
import com.knot.Banking.Bo.CardsBo;
import com.knot.Banking.Bo.CustomerBo;

public interface CustomerService {

	CustomerBo getCustomerById(String id);

	AccountBo getAccountByCustomerId(String id);

	CardsBo getCardByCustomerId(String id);

	List<CustomerBo> getAllCustomers();

}
