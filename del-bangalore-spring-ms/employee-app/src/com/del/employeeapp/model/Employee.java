package com.del.employeeapp.model;

import java.time.LocalDate;
import java.util.Objects;



public class Employee {

	private int employeeId;
	private String employeeName;
	private float salary;
	private LocalDate dateJoined;
	
	
	public Employee() {
	}


	public Employee(int employeeId, String employeeName, float salary, LocalDate dateJoined) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.dateJoined = dateJoined;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public LocalDate getDateJoined() {
		return dateJoined;
	}


	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", dateJoined=" + dateJoined + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dateJoined, employeeId, employeeName, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateJoined, other.dateJoined) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
	
	
	
}
