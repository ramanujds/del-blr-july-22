package com.del.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.del.employeeapp.model.Employee;

public interface IEmployeeDao {

	public Employee addEmployee(Employee employee) throws SQLException;
	
	public Employee findEmployee(int employeeId);
	
	public boolean deleteEmployee(int employeeId);
	
	public List<Employee> getAllEmployees();
	
	
	
}
