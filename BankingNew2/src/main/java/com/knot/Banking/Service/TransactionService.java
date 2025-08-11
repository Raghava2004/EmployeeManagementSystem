package com.knot.Banking.Service;

import java.util.List;

import com.knot.Banking.Bo.TransactionBo;
import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Dto.WithDrawDto;

public interface TransactionService {


	void withDrawCash(WithDrawDto withDrawDto);

	String depositCash(DepositCashDto depositCashDto);

	List<TransactionBo> getMiniStatementByAccountId(String id);

}
