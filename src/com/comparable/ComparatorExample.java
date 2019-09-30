package com.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(1000,"Rajeev",100000.0,LocalDate.of(2010, 7, 12)));
		employee.add(new Employee(1001,"JAy",101200.0,LocalDate.of(2015, 8, 13)));
		employee.add(new Employee(1010,"Rajan",1000012.0,LocalDate.of(2011, 3, 22)));
		employee.add(new Employee(1300,"Hobbs",1053400.0,LocalDate.of(2018, 11, 12)));
		employee.add(new Employee(1050,"Shaw",106300.0,LocalDate.of(2008, 7, 23)));
		employee.add(new Employee(1007,"Fast",10053420.0,LocalDate.of(2010, 7, 28)));
		
		
		System.out.println(employee);
		
		Comparator<Employee> employeeComparator=new Comparator<Employee>(){
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};

		Collections.sort(employee,employeeComparator);
		System.out.println("Employee sorted by name :"+employee);
		
		 //Using Lambda expression :
		Comparator<Employee> EmployeeComparator1=(e1,e2)->e1.getName().compareTo(e2.getName());
		Collections.sort(employee,EmployeeComparator1);
		System.out.println("Sort by name using Lambda Exp :"+employee);
		//		 
		Comparator<Employee> EmployeeComparator2=Comparator.comparing(Employee::getName);
		Collections.sort(employee,EmployeeComparator2);
		System.out.println("Default sort in Java 8 :"+employee);
		
		
		//Sort By Salary
		Comparator<Employee> employeeSalary=new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getSalary()<e2.getSalary()) {
					return -1;
				}else if(e1.getSalary()>e2.getSalary()) {
					return 1;
				}else {
					return 0;
				}
			}
		};
		Collections.sort(employee,employeeSalary);
		System.out.println("Employee sort by Salary :"+employee);
		
		//Using Lambda expression
		
		
		//Sort by Joining Date
		Comparator<Employee> employeeJoining=new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getJoinDate().compareTo(e2.getJoinDate());
			}
		};
		Collections.sort(employee,employeeJoining);
		System.out.println("sort by joining data :"+employee);
	}

}
