package com.knot.Banking.Dao;

import java.util.List;

import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Dto.WithDrawDto;
import com.knot.Banking.Model.TransactionModel;

public interface TransactionDao {

	String depositCash(DepositCashDto depositCashDto);

	void withDrawCash(WithDrawDto withDrawDto);

	List<TransactionModel> getMiniStatementByAccountId(String id);

}
