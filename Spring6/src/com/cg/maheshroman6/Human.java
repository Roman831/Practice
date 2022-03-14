package com.cg.maheshroman6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;
	
	public Human()
	{
		
	}
	
	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constructor is getting called which has heart as arg");
	}
	

	@Autowired
	@Qualifier("octpousheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
	
	
	public void startPumping()
	{
		if(heart!=null)
		{
			heart.pump();
			System.out.println("name of the animal is :" + heart.getNameofAnimal() + " no of heart present : " + heart.getNoofHeart());
		}
		else
		{
			System.out.println("you are dead");
		}
	}

}
