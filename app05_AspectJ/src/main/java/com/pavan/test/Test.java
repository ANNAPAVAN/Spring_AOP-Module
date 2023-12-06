package com.pavan.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.beans.*;
import com.pavan.service.*;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Employee emp = (Employee)context.getBean("empBean");
		EmployeeService empService = (EmployeeService)context.getBean("empService");
		String message="";
		try {
			message=empService.createEmployee(emp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print(message);
		
/*		OUTPUT
 
		Before createEmployee method Execution
		Before createEmployee Execution from Around Advice
		Employee 111 inserted Successfully from createEmployee() method
		After createEmployee Execution from Around Advice
		After returning null from createEmployee
		After createEmployee method Execution
		null
 */
	}

}
