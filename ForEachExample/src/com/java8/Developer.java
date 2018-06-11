package com.java8;

import java.math.BigDecimal;

public class Developer {
	private String Name;
	private BigDecimal salary;
	private int age;
	
	
	public Developer(String name, BigDecimal salary, int age) {
		super();
		Name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Developer [Name=" + Name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	

}
