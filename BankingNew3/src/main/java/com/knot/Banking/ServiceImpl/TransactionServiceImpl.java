package com.knot.Banking.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Banking.Bo.TransactionBo;
import com.knot.Banking.Dao.TransactionDao;
import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Dto.WithDrawDto;
import com.knot.Banking.Model.TransactionModel;
import com.knot.Banking.Service.TransactionService;

import jakarta.transaction.Transactional;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionDao transactionDao;

	@Override
	@Transactional
	public String depositCash(DepositCashDto depositCashDto) {
		String message=transactionDao.depositCash(depositCashDto);
		return message;
	
	}
	@Transactional
	@Override
	public void withDrawCash(WithDrawDto withDrawDto) {
		transactionDao.withDrawCash(withDrawDto);
	}
	@Override
	public List<TransactionBo> getMiniStatementByAccountId(String id) {
		List<TransactionModel> miniStatementById = transactionDao.getMiniStatementByAccountId(id);
		List<TransactionBo> transactionListBo=new ArrayList<>();
		 for(int i=0;i<miniStatementById.size();i++) {
			 TransactionModel singleTransaction=miniStatementById.get(i);
			 TransactionBo transactionBo = new TransactionBo(singleTransaction);
			 transactionListBo.add(transactionBo);
		 }
		return transactionListBo;
	}

}
