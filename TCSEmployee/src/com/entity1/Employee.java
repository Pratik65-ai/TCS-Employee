package com.entity1;

public class Employee {
	private int id;
	private String name;
	private String roll;
	private int salary;
	Employee(){
		
	}
	
	public Employee(int id, String name, String roll, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", roll=" + roll + ", salary=" + salary + "]";
	}

}
