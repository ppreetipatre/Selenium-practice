package Failtestcases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void m1() {
		Assert.assertEquals("gmail", "gmail");
	}

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void m2() {
		Assert.assertEquals("google", "facebook");
	}

	@Test
	public void m3() {
		Assert.assertEquals("amazon", "amazon");
	}
	
	
	
	
	
}
