package com.pavan.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;
import com.pavan.service.*;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Show show = (Show)context.getBean("showBean");
		ShowService showService = (ShowService)context.getBean("showService");

		try {
			 showService.runShow(show);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	}

}
