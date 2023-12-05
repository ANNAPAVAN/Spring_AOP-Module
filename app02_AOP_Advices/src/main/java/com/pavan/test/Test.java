package com.pavan.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pavan.service.*;
import com.pavan.beans.*;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		InstituteService inst_Service = (InstituteService)context.getBean("proxy");
		Student std = (Student)context.getBean("student");
		
		inst_Service.enquiry(std, "JAVA");
		inst_Service.registration(std, "JAVA");

/*		OUTPUT
		
		Student Enquiry Details
		------------------------
		Student Name  : Pavan
		Student Qual  : Btech
		Student Email : pavan@gmail.com
		Student Mobile: 9876543210
		Student Course: JAVA
		***********************************************************************************
		Thank You Pavan for your course enquiry on JAVA
		ANNA's team will contct you soon
		***********************************************************************************

		Student Registration Details
		------------------------
		Student Name  : Pavan
		Student Qual  : Btech
		Student Email : pavan@gmail.com
		Student Mobile: 9876543210
		Student Course: JAVA
		***********************************************************************************
		Thank You Pavan for your course registration on JAVA
		ANNA's team will contct you soon
		***********************************************************************************
*/
		

	}

}
