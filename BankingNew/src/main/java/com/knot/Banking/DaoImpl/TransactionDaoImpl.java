package com.knot.Banking.DaoImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.Banking.Dao.TransactionDao;
import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Dto.WithDrawDto;
import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.TransactionModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	EntityManager entityManager;
	@Override
	public String depositCash(DepositCashDto depositCashDto) {
	    String customerId = depositCashDto.getCustomerId();

	    // Correct BigDecimal instantiation
	    BigDecimal depositAmount = new BigDecimal(depositCashDto.getDepositAmount());

	    // Fetch account
	    String selectSql = "SELECT * FROM accounts WHERE customer_id = :id";
	    Query selectQuery = entityManager.createNativeQuery(selectSql, AccountModel.class);
	    selectQuery.setParameter("id", customerId);
	    AccountModel account = (AccountModel) selectQuery.getSingleResult();

	    // Convert account balance to BigDecimal for addition
	    BigDecimal accountBalance = BigDecimal.valueOf(account.getAccountBalance());

	    // Add deposit amount
	    accountBalance = accountBalance.add(depositAmount);

	    // Update account balance in database
	    String updateSql = "UPDATE accounts SET account_balance = :balance WHERE customer_id = :id";
	    Query updateQuery = entityManager.createNativeQuery(updateSql);
	    updateQuery.setParameter("balance", accountBalance);
	    updateQuery.setParameter("id", customerId);
	    updateQuery.executeUpdate();

	    // Save transaction
		/*
		 * TransactionModel depositTransactions = new TransactionModel( depositAmount,
		 * accountBalance, accountId, "Credit" );
		 */
	    //entityManager.merge(depositTransactions);
	    return "Success";
	}
	@Override
	public void withDrawCash(WithDrawDto withDrawDto) {
		String customerId = withDrawDto.getCustomerId();
	    Integer withDrawalAmount = Integer.parseInt(withDrawDto.getWithDrawalAmount());
	    
	    String selectSql = "SELECT * FROM accounts WHERE customer_id = :id";
	    Query selectQuery = entityManager.createNativeQuery(selectSql, AccountModel.class);
	    selectQuery.setParameter("id", customerId);
	    AccountModel account = (AccountModel) selectQuery.getSingleResult();
	    Integer accountId = account.getAccountId();
	    
	    Integer accountBalance = account.getAccountBalance();
	    accountBalance -=  withDrawalAmount;
	    
	    String updateSql = "UPDATE accounts SET account_balance = :balance WHERE customer_id = :id";
	    Query updateQuery = entityManager.createNativeQuery(updateSql);
	    updateQuery.setParameter("balance", accountBalance);
	    updateQuery.setParameter("id", customerId);
	    updateQuery.executeUpdate();
	    
	    TransactionModel withDrawTransactions=new TransactionModel(withDrawalAmount,accountBalance,accountId,"Debit");
	    entityManager.merge(withDrawTransactions);
	    
	}
	@Override
	public List<TransactionModel> getMiniStatementByAccountId(String id) {
		 String selectSql = "SELECT * FROM transactions WHERE account_id = :id order by transaction_id desc limit 5";
		 Query selectQuery = entityManager.createNativeQuery(selectSql, TransactionModel.class);
		 selectQuery.setParameter("id", id);
		 @SuppressWarnings("unchecked")
		 List<TransactionModel> transactionsList = selectQuery.getResultList();
		 
		 
		
		return transactionsList;
	}
}
