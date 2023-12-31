package com.pavan.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
public class LoggingAspectBean {
	public void before(JoinPoint jp) {
		System.out.println("Before "+jp.getSignature().getName()+" method Execution");
	}
	public void after(JoinPoint jp) {
		System.out.println("After "+jp.getSignature().getName()+" method Execution");
	}
	public void afterReturning(JoinPoint jp,Object results) {
		System.out.println("After returning "+results+" from "+jp.getSignature().getName());
	}
	public void around(ProceedingJoinPoint pjp) {
		System.out.println("Before "+pjp.getSignature().getName()+" Execution from Around Advice");
		try {
			pjp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After "+pjp.getSignature().getName()+" Execution from Around Advice");
	}
	public void afterThrowing(JoinPoint jp,Throwable exception) {
		System.out.println("After throwing "+exception+" from "+jp.getSignature().getName()+" method");
	}
}
