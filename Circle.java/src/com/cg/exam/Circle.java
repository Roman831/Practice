package com.cg.exam;
public class Circle 
{
	double area;
	double radius;
	double perimeter;

	public Circle(double radius,double area,double perimeter) 
	{
		this.radius=radius;
		this.area=area;
	}

	

	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	
	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimeter() {
		return  2 * Math.PI * radius;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}



	public static void main(String[] args)
	{
		Circle obj = new Circle();
		
	}
	
	
	

}
