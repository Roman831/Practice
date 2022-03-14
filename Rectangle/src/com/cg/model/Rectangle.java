package com.cg.model;

public class Rectangle
{
	private float length;
	private float width;
	
	public Rectangle()
	{
		length = 1.0f;
		width = 1.0f;
	}
	public Rectangle(float l,float w)
	{
		length = l;
		width = w;
	}
	public float getLength()
	{
		return length;
	}
	public void setLength(float l)
	{
		length = l;
	}
	public float getWidth()
	{
		return width;
	}
	public void setWidth(float w)
	{
		width = w;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	public String toString()
	{
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
	public static void main(String[] args) 
	{
	      // Test constructors and toString()
	      // You need to append a 'f' or 'F' to a float literal
	      Rectangle r1 = new Rectangle(1.2f, 3.4f);
	      System.out.println(r1);  // toString()
	      Rectangle r2 = new Rectangle();  // default constructor
	      System.out.println(r2);

	      // Test setters and getters
	      r1.setLength(5.6f);
	      r1.setWidth(7.8f);
	      System.out.println(r1);  // toString()
	      System.out.println("length is: " + r1.getLength());
	      System.out.println("width is: " + r1.getWidth());

	      // Test getArea() and getPerimeter()
	      System.out.printf("area is: %.2f%n", r1.getArea());
	      System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
	   }
}