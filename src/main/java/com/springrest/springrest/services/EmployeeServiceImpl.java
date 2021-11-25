package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Assets;
import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list;
	List<Assets> assetList;

	public EmployeeServiceImpl() {

		list = new ArrayList<>();
		assetList = new ArrayList<>();
		list.add(new Employee(123, "employeeName1", "Designation1"));
		list.add(new Employee(1234, "employeeName2", "Designation2"));
		assetList.add(new Assets("name1", "date1", "conditionNote1", "category1", "assignmentStatus1"));
		assetList.add(new Assets("name2", "date2", "conditionNote2", "category2", "assignmentStatus2"));

	}

	@Override
	public List<Employee> getEmployees() {
		return list;
	}

	@Override
	public Employee getEmployees(long employeeId) {

		Employee e = null;
		for (Employee employee : list) {
			if (employee.getId() == employeeId) {
				e = employee;
				break;
			}
		}

		return e;
	}

	// adding employee
	@Override
	public Employee addEmployees(Employee employee) {
		list.add(employee);
		return employee;
	}

	// update employee
	@Override
	public Employee updateEmployees(Employee employee) {

		list.forEach(e -> {
			if (e.getId() == employee.getId()) {
				e.setFullName(employee.getFullName());
				e.setDesignation(employee.getDesignation());
			}
		});

		return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		list.remove(employee);
		return employee;
	}

	@Override
	public Assets addEmployeesAssets(Assets assets) {
		assetList.add(assets);
		return assets;
	}

	@Override
	public Assets updateEmployeesAssets(Assets assets) {
		assetList.forEach(a -> {
			if (a.getName() == assets.getName()) {
				a.setAssignmentStatus(assets.getAssignmentStatus());
				a.setPurchaseDate(assets.getPurchaseDate());
				a.setConditionNote(assets.getConditionNote());
				a.setCategory(assets.getCategory());
			}
		});
		return assets;
	}

}
