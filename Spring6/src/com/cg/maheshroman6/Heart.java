package com.cg.maheshroman6;

public class Heart {
	
	private String nameofAnimal;
	private int noofHeart;
	
	

	public String getNameofAnimal() {
		return nameofAnimal;
	}



	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}



	public int getNoofHeart() {
		return noofHeart;
	}



	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}



	public void pump() 
	{
		System.out.println("your heart is pumping");
		System.out.println("Alive");
	}

}
