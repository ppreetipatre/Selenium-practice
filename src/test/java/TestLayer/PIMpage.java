package TestLayer;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import org.testng.annotations.Test;

import Tutorial6.OrangeHRM;


	public class PIMpage extends OrangeHRM
	{
	//WebDriver driver;
	@Test(priority=1)
	public void pim1() 
	{
		//Thread.sleep(4000);
		
		PIMpage.Login();
		//OrangeHRM or = new OrangeHRM(); 
//		or.Login();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}
	
	@Test(priority=2)
	public void PIM() 
	{
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		driver.findElement(By.name("firstName")).sendKeys("kaavya");
		driver.findElement(By.name("middleName")).sendKeys("yashpal");
		driver.findElement(By.name("lastName")).sendKeys("waghmare");
		
		WebElement Custid = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		String CustmerID = Custid.getAttribute("value");
		System.out.println(CustmerID);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
		
	@Test(priority=3)
		public void personalDetail()
		{
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("pihu");
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("MH-24-1228");
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]")).sendKeys("123456789");
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]")).sendKeys("p3256");
			WebElement wb = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]"));
			Select sel = new Select(wb);
				sel.selectByVisibleText("Indian");	
				
			WebElement wb1 = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]"));
			Select sel1 = new Select(wb1);
					sel1.selectByIndex(1);
			driver.findElement(By.xpath("(//div[@class='oxd-date-input'])[2]")).sendKeys("2021-12-25");
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]")).sendKeys("NO");
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
		}
	@Test(priority=4)	
	public void contactDetails()
	{
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Kesnand road");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("pune");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("MH");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]")).sendKeys("431512");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]")).sendKeys("9546454847");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]")).sendKeys("Kaavya@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}	
	@Test(priority=6)
		public void emergencyDetails()
		{
			driver.findElement(By.xpath("//button[@type='button'][3]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("yashpal waghmare");
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Husband");
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("63251458");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		}
	@Test(priority=7)
		public void Dependent()
		{
		
			driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[4]")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Aarav");
			WebElement wb3= driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[1]"));
			Select sel = new Select(wb3);
			sel.selectByIndex(0);
			
			
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
}
