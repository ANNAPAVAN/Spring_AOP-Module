package com.pavan.service;

import org.springframework.stereotype.Component;

import com.pavan.beans.Account;
import com.pavan.exception.InsufficientFundsException;

@Component("transaction")
public class TransactionServiceImpl implements TransactionService {

	public String withdraw(Account acc, int wd_Amt) throws InsufficientFundsException {
		String status="";
		if(acc.getBalance() > wd_Amt) {
			int total_Bal = acc.getBalance() - wd_Amt;
			acc.setBalance(total_Bal);
			System.out.println("From withdraw() : Transaction Withdraw completed");
			status="Success";
		}
		else {
			status="Failure";
			throw new InsufficientFundsException("Funds are not sufficient in your account");			
		}
		return status;
	}

}
