package com.knot.Banking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Bo.TransactionBo;
import com.knot.Banking.Dto.DepositCashDto;
import com.knot.Banking.Dto.WithDrawDto;
import com.knot.Banking.Service.TransactionService;

@RestController
public class TransactionalController {
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/withDrawCash")
	public void withDrawCash(@RequestBody WithDrawDto withDrawDto) {
		transactionService.withDrawCash(withDrawDto);
		 
	}
	@PostMapping("/depositCash")
	public String depositCash(@RequestBody DepositCashDto depositCashDto) {
		
		return transactionService.depositCash(depositCashDto);
	}
	@GetMapping("/getMiniStatementByAccountId/{Id}")
	public List<TransactionBo> getMiniStatementByAccountId(@PathVariable String Id) {
		
		return transactionService.getMiniStatementByAccountId(Id);
	}
	
	

}
