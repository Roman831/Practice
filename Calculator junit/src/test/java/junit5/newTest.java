package junit5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class newTest 
{

	/*@Test
	public void test() {
		System.out.println("This is my test case");
	}*/
	@Test
	public void assertMethodsValidation()
	{
		String expected = "junit";
		String actual = "junit";
		assertEquals(expected,actual);
	}

}