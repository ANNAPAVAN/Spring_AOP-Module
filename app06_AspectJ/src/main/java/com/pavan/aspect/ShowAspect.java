package com.pavan.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ShowAspect {
	public void before() {
		System.out.println("Get tickets for the Show ");
	}
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Show is ready to start , take chairs and turn off mobile phones");
		try {
			jp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Show completed just now, check your belongings");
	}
	public void after() {
		System.out.println("Sow is over, quit from hall");
	}
	public void afterReturning() {
		System.out.println("ThanQ for attending the Show");
	}
	public void afterThrowing() {
		System.out.println("There is an interruption, bcoz show is not mimicry show");
	}
}
