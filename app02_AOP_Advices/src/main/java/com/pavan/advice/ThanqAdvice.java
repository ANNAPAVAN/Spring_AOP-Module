package com.pavan.advice;
import com.pavan.beans.*;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ThanqAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] params, Object target) throws Throwable {
		Student std = (Student)params[0];
		String courseName = (String)params[1];
		System.out.println("***********************************************************************************");
		System.out.println("Thank You "+std.getSname()+" for your course "+method.getName()+" on "+courseName);
		System.out.println("ANNA's team will contct you soon");
		System.out.println("***********************************************************************************");
		System.out.println();

	}

}
