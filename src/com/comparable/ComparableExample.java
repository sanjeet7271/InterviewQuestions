package com.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 
 	1> Comparable is Interface
 	2> Comparable interface is used to order the objects of user-defined classes
 	3>The Comparable interface has a single method called compareTo() that you need to implement in order to define how an object compares with the supplied object
 	4>Comparable interface is mainly used to sort the arrays (or lists) of custom objects.

Comparable
	A comparable object is capable of comparing itself with another object. The class itself must implements the java.lang.Comparable interface in order to be able to compare its instances.
Comparator
	A comparator object is capable of comparing two different objects. The class is not comparing its instances, but some other class’s instances. This comparator class must implement the java.util.Comparator interface.
	 
 *
 */
class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	
	public Employee(int id, String name, double salary, LocalDate joiningDate) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.joiningDate=joiningDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public LocalDate getJoinDate() {
		return joiningDate;
	}
	public void setJoinDate(LocalDate joiningDate) {
		this.joiningDate=joiningDate;
	}
	@Override
	public int compareTo(Employee anotherEmployee) {
		return this.getId()-anotherEmployee.getId();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		Employee employee=(Employee) o;
		return id==employee.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public String toString() {
		 return "Employee{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", salary=" + salary +
	                ", joiningDate=" + joiningDate +
	                '}';
	}

}
class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));

        System.out.println("Employees (Before Sorting) : " + employees);

        // This will use the `compareTo()` method of the `Employee` class to compare two employees and sort them.
        Collections.sort(employees);

        System.out.println("\nEmployees (After Sorting) : " + employees);
    }
}
