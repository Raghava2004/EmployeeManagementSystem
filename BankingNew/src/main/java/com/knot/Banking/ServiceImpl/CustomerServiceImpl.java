package com.knot.Banking.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Banking.Bo.AccountBo;
import com.knot.Banking.Bo.CardsBo;
import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Dao.CustomerDao;
import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.CardModel;
import com.knot.Banking.Model.CustomerModel;
import com.knot.Banking.Service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;

	@Override
	public CustomerBo getCustomerById(String id) {
		// TODO Auto-generated method stub
		CustomerModel customer= customerDao.getCustomerById(id);
		CustomerBo customerBo= new CustomerBo(customer); 
		 return customerBo;
	}

	@Override
	public AccountBo getAccountByCustomerId(String id) {
		// TODO Auto-generated method stub
		 AccountModel accountModel=customerDao.getAccountByCustomerId(id);
		 AccountBo accountBo=new AccountBo(accountModel);
		 return accountBo;
	}

	@Override
	public CardsBo getCardByCustomerId(String id) {
		// TODO Auto-generated method stub
		AccountModel accountModel=customerDao.getAccountByCustomerId(id);
		int accountId=accountModel.getAccountId();
		 CardModel cardByCustomerId = customerDao.getCardByCustomerId(accountId);
		 CardsBo cardBo=new CardsBo(cardByCustomerId);
		return cardBo;
	}

	@Override
	public List<CustomerBo> getAllCustomers() {
	    List<CustomerModel> allCustomers = customerDao.getAllCustomers();
	    List<CustomerBo> customerBoList = new ArrayList<>();

	    if (allCustomers != null) {
	        for (CustomerModel customerModel : allCustomers) {
	            CustomerBo customerBo = new CustomerBo(customerModel);

	            String customerIdStr = customerModel.getCustomerId().toString();

	            AccountModel accountModel = customerDao.getAccountByCustomerId(customerIdStr);
	            if (accountModel != null) {
	                AccountBo accountBo = new AccountBo(accountModel);

	                // Fetch card info linked to the account
	                Integer customerIdForCard = accountModel.getCustomerId();
	                CardModel cardModel = customerDao.getCardByCustomerId(customerIdForCard);
	                if (cardModel != null) {
	                    CardsBo cardsBo = new CardsBo(cardModel);
	                    accountBo.setCardsBo(cardsBo);
	                }

	                customerBo.setAccountBo(accountBo);
	            }

	            // Add the customer with available info to the list
	            customerBoList.add(customerBo);
	        }
	    }

	    return customerBoList;
	}
}
