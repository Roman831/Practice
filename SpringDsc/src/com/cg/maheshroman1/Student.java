package com.cg.maheshroman1;

public class Student 
{
	private int id;
	private String studentName;
	
	public void setId(int id) 
	{
		this.id = id;
		System.out.println("setter method called :" +" id ");
	}
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
		System.out.println("setter method called :" + "studentName");
	}
	public void displayStudentInfo()
	{
		System.out.println("Student name is:" + studentName  + " and Id is:" + id);
	}
}
