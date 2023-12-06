package com.pavan.service;
import com.pavan.beans.*;
public interface EmployeeService {
	public String createEmployee(Employee emp) throws Exception;
	public Employee searchEmployee(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployee(Employee emp);
}
