package com.knot.ems.Service;

import com.knot.ems.Bo.DepositCashDto;

public interface BankService {

	DepositCashDto depositEmpSalary(String id);

	void depositCash(String id);

}
