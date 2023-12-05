package com.pavan.advice.validator;
import com.pavan.beans.*;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] params, Object target) throws Throwable {
		Employee emp = (Employee)params[0];
		System.out.println("Validations messages for "+method.getName());
		System.out.println("----------------------------------------");
		if(emp.getEno() < 100 || emp.getEno() > 999) {
			System.out.println("******** Employee Number must be 3 digit Number *********");
		}
		if(!emp.getEmobile().startsWith("91-")) {
			System.out.println("******** Employee Mobile Number is InValid *********");
		}
		if(!emp.getEemail().endsWith("@pavan.com")) {
			System.out.println("********* Employee email id is Invalid **********");
		}
	}

}
