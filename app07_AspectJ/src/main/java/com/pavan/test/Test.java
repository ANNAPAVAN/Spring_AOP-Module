package com.pavan.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.beans.*;
import com.pavan.service.*;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Account acc=(Account)context.getBean("accBean");
		TransactionService txService = (TransactionService)context.getBean("transaction");
		try {
			txService.withdraw(acc,10000);
		}catch(Exception e){
//			e.printStackTrace();
		}
	}

}
