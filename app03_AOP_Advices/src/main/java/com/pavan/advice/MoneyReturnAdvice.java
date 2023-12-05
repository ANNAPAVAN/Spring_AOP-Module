package com.pavan.advice;

import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;

public class MoneyReturnAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method,Object[] params,Object target, Exception e) {
		System.out.println("**********************************");
		System.out.println("Power Failure ( Money Stopped ) --> Collect Your Money");
		System.out.println("**********************************");

	}
}
