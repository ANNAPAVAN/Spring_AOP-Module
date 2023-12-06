package com.pavan.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.pavan.beans.*;
import com.pavan.exception.*;

@Component("aspect")
@Aspect
public class TransactionAspect {
	@Before("execution(* com.pavan.service.TransactionService.*(..))")
	public void before(JoinPoint jp) {
		Object[] params = jp.getArgs();	
		Account acc = (Account)params[0];
		System.out.println("Before Advice : Initial Balance :"+acc.getBalance());
	}
	
	@After("execution(* com.pavan.service.TransactionService.*(..))")
	public void after(JoinPoint jp) {
		Object[] params = jp.getArgs();	
		Account acc = (Account)params[0];
		System.out.println("After Advice : Total Balance :"+acc.getBalance());
	}
	
	@AfterReturning(pointcut="execution(* com.pavan.service.TransactionService.*(..))",returning="results") //if not single parameter provide pointcut
	public void afterReturning(JoinPoint jp,String results) {
		System.out.println("Transaction Status : "+results);
	}
	
	@Around("execution(* com.pavan.service.TransactionService.*(..))")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Around Advice : Beforee "+jp.getSignature().getName()+" Method Execution");
		String status="";
		try {
			status = (String)jp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around Advice : After"+jp.getSignature().getName()+" method execution");
		System.out.println("Around Advice : Transaction status : "+status);
	}
	
	@AfterThrowing(pointcut="execution(* com.pavan.service.TransactionService.*(..))",throwing="exception")
	public void afterThrowing(JoinPoint jp,InsufficientFundsException exception){
		System.out.println("After Throwing : "+exception.getClass().getName()+" in Transaction :"+exception.getMessage());
	}
}
