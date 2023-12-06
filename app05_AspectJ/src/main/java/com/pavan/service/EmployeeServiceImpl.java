package com.pavan.service;

import com.pavan.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public String createEmployee(Employee emp) throws Exception {
		System.out.println("Employee "+emp.getEno()+" inserted Successfully from createEmployee() method");
		return "Success";
	}

	public Employee searchEmployee(int eno) {
		System.out.println("Employee "+eno+" existed from searchEmployee() method");
		return null;
	}

	public String updateEmployee(Employee emp) {
		System.out.println("Employee "+emp.getEno()+" updated Successfully from updateEmployee() method");
		return "Success";
	}

	public String deleteEmployee(Employee emp) {
		System.out.println("Employee "+emp.getEno()+" deleted Successfully from deleteEmployee() method");
		return "Success";
	}

}
