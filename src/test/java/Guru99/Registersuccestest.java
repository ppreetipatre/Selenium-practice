package Guru99;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Tutorial6.BaseLayer;

public class Registersuccestest extends BaseLayer

{
	@Test(priority=1)
	public void Succespageurl()
	{
		String currurl = getDriver().getCurrentUrl();
		
		boolean b=currurl.contains("sucess");
		Assert.assertEquals(b,true);
	}
	@Test(priority=2)
	public void validatename()
	{
		
		getDriver().findElement(By.xpath("//a[text() = ' sign-in ']")).click();
		//String p= wb.getText();
		//System.out.println(p);
		//getDriver().findElement(By.xpath("//a[@href='login.php']")).click();
	}
	@Test(priority=3)
	public void validateusername()
	{
		String actualuname = getDriver().findElement(By.name("userName")).getAttribute("value");
		boolean c = actualuname.contains("sakshi");
		Assert.assertEquals(c, true);
	}
	
	
	
	
	
	
	
	
	
	
}
