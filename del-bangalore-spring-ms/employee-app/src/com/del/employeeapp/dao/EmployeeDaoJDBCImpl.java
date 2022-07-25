package com.del.employeeapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.del.employeeapp.model.Employee;

public class EmployeeDaoJDBCImpl implements IEmployeeDao {
	
	Connection conn;
	PreparedStatement smt;
	

	@Override
	public Employee addEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","password");
		if(conn!=null) {
			
			smt=conn.prepareStatement("insert into employee values(?,?,?,?)");
			smt.setInt(1, employee.getEmployeeId());
			smt.setString(2, employee.getEmployeeName());
			smt.setFloat(3, employee.getSalary());
			smt.setString(4, employee.getDateJoined().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
			
			smt.executeUpdate();
			return employee;
			
		}
		else {
			System.out.println("Connection Failed");
		}
		return null;
	}

	@Override
	public Employee findEmployee(int employeeId) throws SQLException{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","password");
		if(conn!=null) {
			
			smt=conn.prepareStatement("select * from employee where employee_id=?");
			smt.setInt(1, employeeId);
			
			
			ResultSet rs = smt.executeQuery();
			Employee employee = new Employee();
			employee.setEmployeeId(employeeId);
			employee.setEmployeeName(rs.getString("employee_name"));
			employee.setSalary(rs.getFloat("salary"));
			LocalDate date = LocalDate.parse(rs.getString("date_joined"));
			employee.setDateJoined(date);
			return employee;
			
		}
		else {
			System.out.println("Connection Failed");
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
