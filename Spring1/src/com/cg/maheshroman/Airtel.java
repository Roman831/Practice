package com.cg.maheshroman;

public class Airtel implements Sim
{

	@Override
	public void calling() 
	{
		System.out.println("Calling using Airtel sim");
		
	}

	@Override
	public void data() 
	{
		System.out.println("Browing internet using Airtel Sim");
		
	}

	
}
