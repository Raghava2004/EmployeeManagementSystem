package com.knot.Banking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Banking.Dao.CustomerDao;
import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;

	@Override
	public String addCustomerInfo(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return customerDao.addCustomerInfo(customerDto);
	}

}
