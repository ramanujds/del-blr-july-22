package com.del.employeeapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.del.employeeapp.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	
	Map<Integer, Employee> employeeDb = new HashMap<>();

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;
	}

	@Override
	public Employee findEmployee(int employeeId) {
		
		return employeeDb.get(employeeId);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		employeeDb.remove(employeeId);
		return !employeeDb.containsKey(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> emps = new ArrayList<>(employeeDb.values());
		return emps;
		
	}
	
	

}
