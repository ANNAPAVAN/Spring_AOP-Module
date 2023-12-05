package com.pavan.service;
import com.pavan.beans.*;
public interface TransactionService {
	public void debit(Account acc,Cheque cheque);
}
