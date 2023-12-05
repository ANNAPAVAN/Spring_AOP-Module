package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.beans.*;
import com.pavan.service.*;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Account acc = (Account)context.getBean("accBean");
		Cheque cheque = (Cheque)context.getBean("chequeBean");
		TransactionService tx_Service = (TransactionService)context.getBean("proxy");
		tx_Service.debit(acc, cheque);
		
/*		OUTPUT
		
		Hello Pavan! ,cheque number xyz123 is comming for clearence with an amount 10000
		************** Transaction Successs *************
		Hello Pavan!, Acount Number abc123 has debited the amount 10000 in clearence of the cheque no xyz123. The total amount in your account is 15000
*/
		
	}

}
