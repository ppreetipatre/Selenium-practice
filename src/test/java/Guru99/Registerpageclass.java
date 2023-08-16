package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tutorial6.BaseLayer;

public class Registerpageclass extends BaseLayer
		
{
	@Parameters({"browsername"})
	@BeforeTest
	public void setup(String browsername)
	{
	//	BaseLayer.intialization();
		BaseLayer baseLayer = new BaseLayer();
		
		baseLayer.intialization(browsername);
	}
	
	
	@Test(priority=1)
	public void Validatecontactinfo() throws InterruptedException
	{
		Thread.sleep(7000);
		
		getDriver().findElement(By.name("firstName")).sendKeys("sakshi");
		getDriver().findElement(By.name("lastName")).sendKeys("jogdand");
		Thread.sleep(4000);
		getDriver().findElement(By.name("phone")).sendKeys("12543");
		getDriver().findElement(By.id("userName")).sendKeys("sakshi");

	
	}

	@Test(priority=2)
	public void Validatemailinfo() throws InterruptedException
	{
		Thread.sleep(4000);
		getDriver().findElement(By.name("address1")).sendKeys("pune");
		getDriver().findElement(By.name("city")).sendKeys("pune");
		Thread.sleep(4000);
		getDriver().findElement(By.name("state")).sendKeys("MH");
		getDriver().findElement(By.name("postalCode")).sendKeys("431251");
		WebElement wb1 = getDriver().findElement(By.name("country"));
		Thread.sleep(4000);
		Select sel = new Select(wb1);
		sel.selectByVisibleText("INDIA");
	
	}
	@Test(priority=3)
	public void userinfo() throws InterruptedException
	{
		getDriver().findElement(By.name("email")).sendKeys("sakshi");
		Thread.sleep(4000);
		getDriver().findElement(By.name("password")).sendKeys("sakshi@123");
		Thread.sleep(4000);
		getDriver().findElement(By.name("confirmPassword")).sendKeys("sakshi@123");
		Thread.sleep(4000);
		getDriver().findElement(By.name("submit")).click();

	
	}
//	@AfterClass
//	public void teardown()
//	{
//		getgetDriver()().close();
//	}
//	


	
}
