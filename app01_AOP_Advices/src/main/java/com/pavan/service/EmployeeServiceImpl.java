package com.pavan.service;
import com.pavan.beans.*;
public class EmployeeServiceImpl implements EmployeeService {

	public void getEmployeeDetails(Employee emp) {
		System.out.println("Employee Details from getEmployeeDetails() Method");
		System.out.println("-------------------------------------------");
		System.out.println("Employee No     : "+emp.getEno());
		System.out.println("Employee Name   : "+emp.getEname());
		System.out.println("Employee Sal    : "+emp.getEsal());
		System.out.println("Employee Addr   : "+emp.getEaddr());
		System.out.println("Employee email  : "+emp.getEemail());
		System.out.println("Employee mobile : "+emp.getEmobile());

	}

	public void displayEmployeeDetails(Employee emp) {
		System.out.println("Employee Details from displayEmployeeDetails() Method");
		System.out.println("-------------------------------------------");
		System.out.println("Employee No     : "+emp.getEno());
		System.out.println("Employee Name   : "+emp.getEname());
		System.out.println("Employee Sal    : "+emp.getEsal());
		System.out.println("Employee Addr   : "+emp.getEaddr());
		System.out.println("Employee email  : "+emp.getEemail());
		System.out.println("Employee mobile : "+emp.getEmobile());
	}

}
