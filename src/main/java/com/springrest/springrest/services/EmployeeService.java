package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Assets;
import com.springrest.springrest.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee getEmployees(long employeeId);
	
	public Employee addEmployees(Employee employee);

	public Employee updateEmployees(Employee employee);

	public Employee deleteEmployee(Employee employee);

	public Assets addEmployeesAssets(Assets assets);

	public Assets updateEmployeesAssets(Assets assets);
 
}
