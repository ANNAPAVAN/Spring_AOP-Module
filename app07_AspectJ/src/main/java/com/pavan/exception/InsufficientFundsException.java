package com.pavan.exception;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String err_Msg)
	{
		super(err_Msg);
	}
}
