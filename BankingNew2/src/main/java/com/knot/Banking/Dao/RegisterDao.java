package com.knot.Banking.Dao;

import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.CardModel;
import com.knot.Banking.Model.CustomerModel;

public interface RegisterDao {

	AccountModel addAccountIfo(AccountModel accountModel);

	CustomerModel addCustomerInfo(CustomerModel customerModel);

	void addCardInfo(CardModel cards);


}
