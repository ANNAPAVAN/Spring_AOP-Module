package com.pavan.advice;
import com.pavan.beans.*;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ChequeClearenceAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		
		Object[] params = mi.getArguments();
		Account acc = (Account)params[0];
		Cheque cheque = (Cheque)params[1];
		System.out.println("Hello "+acc.getAccHolderName()+"! ,cheque number "+cheque.getCheque_No()+" is comming for clearence with an amount "+cheque.getAmount());
		
		mi.proceed(); //business method (debit()) will execute
		
		System.out.println("Hello "+acc.getAccHolderName()+"!, Acount Number "+acc.getAccNo()+" has debited the amount "+cheque.getAmount()+" in clearence of the cheque no "+cheque.getCheque_No()+". The total amount in your account is "+acc.getBalance());
		
		return null;
	}

}
