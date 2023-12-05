package com.pavan.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.service.*;
import com.pavan.beans.*;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Employee emp = (Employee)context.getBean("empBean");
		
		EmployeeService empService = (EmployeeService)context.getBean("proxy");
		empService.getEmployeeDetails(emp);
		System.out.println();
		empService.displayEmployeeDetails(emp);
		
/*		//OUTPUT
 
 		Validations messages for getEmployeeDetails
		----------------------------------------
		******** Employee Number must be 3 digit Number *********
		********* Employee email id is Invalid **********
		Employee Details from getEmployeeDetails() Method
		-------------------------------------------
		Employee No     : 1
		Employee Name   : AAA
		Employee Sal    : 50000.0
		Employee Addr   : Hyd
		Employee email  : aaa@email.com
		Employee mobile : 91-9876543210

		Validations messages for displayEmployeeDetails
		----------------------------------------
		******** Employee Number must be 3 digit Number *********
		********* Employee email id is Invalid **********
		Employee Details from displayEmployeeDetails() Method
		-------------------------------------------
		Employee No     : 1
		Employee Name   : AAA
		Employee Sal    : 50000.0
		Employee Addr   : Hyd
		Employee email  : aaa@email.com
		Employee mobile : 91-9876543210
*/
	}

}
