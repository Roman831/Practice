package junit5;
import static org.junit.Assert.assertSame;
import org.junit.Test;
public class calculatorTest 
{
	@Test
	public void test() 
	{
		String a = "xyz";
		String b = "xyzz";
		assertSame(a,b);
	}
}
