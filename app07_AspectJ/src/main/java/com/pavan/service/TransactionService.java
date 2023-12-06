package com.pavan.service;
import com.pavan.beans.*;
import com.pavan.exception.*;
public interface TransactionService {
	public String withdraw(Account acc,int wd_Amt) throws InsufficientFundsException;
}
