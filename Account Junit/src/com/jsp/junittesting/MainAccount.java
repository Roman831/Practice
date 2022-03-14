package com.jsp.junittesting;

public class MainAccount {
	public static void main(String[] args) 
	{
		Account a1 = new Account("831","mahesh");
		Account a2 = new Account("143","roman",100000);
		System.out.println(a1);
		System.out.println(a2);
	}

}
