package com.cg.domain;

public class Employee 
{
	private int empid;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int i,String n,String s,double sal)
	{
		empid=i;
		name=n;
		ssn=s;
		salary=sal;
	}
	public void printEmployee()
	{
		System.out.println(e1.Employee());
	}
	
	public void setName(String n) 
	{
		name=n;
	}
	public void raiseSalary(double increase)
	{
		salary=salary*12*increase/100-100;
	}
	
	
public class Engineer extends Employee
{
	
}
public class Manager extends Employee
{
	private String deptName;
}
	public String getDeptName()
	{
		return deptName;
	}

public class Admin extends Employee
{
	
}
public class Director extends Manager
{
	private double budget;
}
	public double getBudget() 
	{
		
	}
}
}
