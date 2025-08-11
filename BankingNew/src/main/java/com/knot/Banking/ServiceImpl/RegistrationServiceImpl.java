package com.knot.Banking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Banking.Dao.RegisterDao;
import com.knot.Banking.Dto.AccountDto;
import com.knot.Banking.Dto.CardsDto;
import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.CardModel;
import com.knot.Banking.Model.CustomerModel;
import com.knot.Banking.Service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	@Autowired
	RegisterDao registerDao;

	@Override
	public String addCustomerInfo(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		CustomerModel customerModel= new CustomerModel(customerDto);
		CustomerModel customer=registerDao.addCustomerInfo(customerModel);
		Integer customerId = customer.getCustomerId();
		AccountDto accountDto=customerDto.getAccounts();
		AccountModel account=new AccountModel(accountDto,customerId);
		AccountModel singleAccount=registerDao.addAccountIfo(account);
		Integer accountId = singleAccount.getAccountId();
		CardsDto cardsDto = accountDto.getCards();
		CardModel cards=new CardModel(accountId,cardsDto);
		registerDao.addCardInfo(cards);
		
		return "Done";
	}


}
