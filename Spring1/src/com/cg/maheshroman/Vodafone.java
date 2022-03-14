package com.cg.maheshroman;


public class Vodafone implements Sim 
{
	@Override
	public void calling() 
	{
		System.out.println("Calling using Vodafone sim");
		
	}

	@Override
	public void data() 
	{
		System.out.println("Browing internet using Vodafone Sim");
		
	}

}