package com.jsp.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Accountjunittest 
{
	Account a1 = new Account("831","mahesh");
	Account a2 = new Account("143","roman",100000);
	@Test
	public void testGetId() 
	{
		assertTrue(a1.getName().equals("mahesh"));
		assertEquals(a2.getBalance(),100000);
	}

}
