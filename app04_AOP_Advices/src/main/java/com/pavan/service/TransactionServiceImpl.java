package com.pavan.service;

import com.pavan.beans.Account;
import com.pavan.beans.Cheque;

public class TransactionServiceImpl implements TransactionService {

	public void debit(Account acc, Cheque cheque) {
		
		int initial_Balance = acc.getBalance();
		int debit_Amt = cheque.getAmount();
		int total_Amount = initial_Balance - debit_Amt;
		
		acc.setBalance(total_Amount);
		System.out.println("************** Transaction Successs *************");

	}

}
