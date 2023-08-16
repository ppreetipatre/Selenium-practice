package OrangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;

public class Loginpagetest extends Baseclass
{
	
	@BeforeTest( groups= {"LoginPage","EndToEndTesting"})
	public void setup()
	{
		Baseclass b1 = new Baseclass();
		b1.initialization();
	}
	@Parameters({"username","password"})
	@Test(priority = 1, groups= {"LoginPage","EndToEndTesting"})
	public void loginfunctionality(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
}
