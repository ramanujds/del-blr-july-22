package javabasics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeOperations {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "Rahul", 52000, LocalDate.of(2018, 10, 15));
		Employee emp2 = new Employee(1005, "Suraj", 46000, LocalDate.of(2019, 5, 15));
		Employee emp3 = new Employee(5004, "Priya", 38000, LocalDate.of(2021, 10, 20));
		Employee emp4 = new Employee(3002, "Sreya", 72000, LocalDate.of(2017, 5, 10));
		Employee emp5 = new Employee(1008, "Rohit", 62000, LocalDate.of(2018, 6, 20));
		Employee emp6 = new Employee(1008, "Javed", 65000, LocalDate.of(2018, 6, 20));
		Employee emp7 = new Employee(1008, "Kunal", 81000, LocalDate.of(2018, 6, 20));
		
//		List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
//		
//		Collections.sort(employeeList,(Employee e1, Employee e2)-> e1.getEmployeeId()-e2.getEmployeeId());
//		
//		employeeList.forEach(emp->System.out.println(emp));
		
		Map<Integer, Employee> employees = new HashMap<>();
		
		

	}

}
