package Guru99;

import org.openqa.selenium.By;
//import org.openqa.selenium.getDriver();
import org.testng.Assert;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tutorial6.BaseLayer;


public class Loginpagetest extends BaseLayer

{
	
	@Test(priority = 1)

	public void Validatecredentials() throws InterruptedException
	{
		Thread.sleep(4000);
		getDriver().findElement(By.name("userName")).sendKeys("sakshi");
		getDriver().findElement(By.name("password")).sendKeys("sakshi@123");
		getDriver().findElement(By.name("submit")).click();
	}
	
	
	@Test(priority = 2)

	public void validateLoginSuccessfullpage() {
		String actualUrl = getDriver().getCurrentUrl();
		boolean b = actualUrl.contains("login_sucess");
		Assert.assertEquals(b, true);
	
	}
}
	
	
	
	
	
	
	
	
	
	
	

