package com.cg.maheshroman4;

public class Student {
	private int id;
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	public void cheating()
	{
		mathCheat.mathCheat();
		System.out.println("Hey my id is " + id + " take nd do whatever u want to do...");
		
	}
}
