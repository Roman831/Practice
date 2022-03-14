package com.cg.model;

public class Account 
{
	private String id;
	private String name;
	private int balance;
	

	public Account(String i,String n) 
	{
		id = i;
		name = n;
	}
	public Account(String i,String n,int b) 
	{
		id = i;
		name = n;
		balance = b;
	}
	
	public String getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getBalance()
	{
		return balance;
	}
	public int credit(int amount)
	{	
		balance = amount+balance;
		return balance;
	}
	public int debit(int amount)
	{	
		if(amount<=balance)
		
			balance=balance-amount;
		
		else 
		
			System.out.println("Amount exceeded balance");
			return balance;
	
	}
	public int transferTo(Account another,int amount)
	{	
		if(amount<=balance)
		{	
			another.credit(amount);
			balance-= amount;
		}
		else 
		
			System.out.println("Amount exceeded balance");
			return balance;
		
	}
	
	public String toString()
	{
		return "InvoiceItem[id=" + id + ",name=" + name + ",balance=" + balance + "]";
	}
	 public static void main(String[] args) 
	 {
	      // Test constructor and toString()
	      Account a1 = new Account("A101", "Tan Ah Teck", 88);
	      System.out.println(a1);
	      Account a2 = new Account("A102", "Kumar");
	      System.out.println(a2);
	      
	      System.out.println("ID: " + a1.getID());
	      System.out.println("Name: " + a1.getName());
	      System.out.println("Balance: " + a1.getBalance());
	      
	      a1.credit(100);
	      System.out.println(a1);
	      a1.debit(50);
	      System.out.println(a1);
	      a1.debit(500);
	      System.out.println(a1);

	      a1.transferTo(a2, 100);
	      System.out.println(a1);
	      System.out.println(a2);
	   }



}
