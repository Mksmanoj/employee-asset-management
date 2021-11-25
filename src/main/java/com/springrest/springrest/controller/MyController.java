package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Assets;
import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}

	// get employees

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return this.employeeService.getEmployees();
	}

	// single employee getting by id
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		return this.employeeService.getEmployees(Long.parseLong(employeeId));
	}

	// adding employee

	@PostMapping("/employees")
	public Employee addEmployees(@RequestBody Employee employee) {
		return this.employeeService.addEmployees(employee);
	}

	// update employee using PUT request
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployees(employee);
	}

	// delete the employee
	@DeleteMapping("/employees/{employeeId}")
	public Employee deleteEmployee(@RequestBody Employee employee) {
		return this.employeeService.deleteEmployee(employee);
	}

	// adding assets

	@PostMapping("/assets")
	public Assets addEmployeeAssets(@RequestBody Assets assets) {
		return this.employeeService.addEmployeesAssets(assets);
	}

	// update employee using PUT request
	@PutMapping("/assets")
	public Assets updateEmployeeAssets(@RequestBody Assets assets) {
		return this.employeeService.updateEmployeesAssets(assets);
	}

}
