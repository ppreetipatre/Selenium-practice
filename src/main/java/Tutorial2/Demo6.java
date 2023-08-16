package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement wb1 = driver.findElement(By.id("name"));
		Thread.sleep(3000);
		if (wb1.isDisplayed()&&wb1.isEnabled())
		{
			wb1.sendKeys("rekha");
			System.out.println("test case for name is pass");
			
		}
		Thread.sleep(3000);
		WebElement wb2 = driver.findElement(By.id("email"));
		if (wb2.isDisplayed()&&wb2.isEnabled())
		{
			wb2.sendKeys("rekha@gmail.com");
			System.out.println("test case for emailid is pass");
			
		}
	
		Thread.sleep(3000);
		WebElement wb3 = driver.findElement(By.id("phone"));
		if (wb3.isDisplayed()&&wb3.isEnabled())
		{
			wb3.sendKeys("9536847123");
			System.out.println("test case for phone-number is pass");
			
		}
		Thread.sleep(3000);
		WebElement wb4 = driver.findElement(By.id("textarea"));
		if (wb4.isDisplayed()&&wb4.isEnabled())
		{
			wb4.sendKeys("pune");
			System.out.println("test case for Address is pass");
			
		}
	
		Thread.sleep(3000);
		WebElement wb5 = driver.findElement(By.id("male"));
		if (wb5.isDisplayed()&&wb5.isEnabled())
		{
			System.out.println("test case for male Gender  is pass");
			
		}
		Thread.sleep(3000);
		WebElement wb6 = driver.findElement(By.id("female"));
		if (wb6.isDisplayed()&&wb6.isEnabled())
		{
			wb6.click();
			boolean a = wb6.isSelected();
			System.out.println("test case for Female gender is pass");
			System.out.println(a);
		}
		Thread.sleep(3000);
		WebElement wb7 = driver.findElement(By.id("sunday"));
		wb7.click();
		if (wb7.isDisplayed()&&wb7.isEnabled())
		{
			
			boolean b = wb7.isSelected();
			System.out.println("test case for sunday is pass");
			System.out.println(b);
		}
		Thread.sleep(3000);
		WebElement wb8 = driver.findElement(By.id("monday"));
		wb8.click();
		if (wb8.isDisplayed()&&wb8.isEnabled())
		{
			
			boolean c = wb8.isSelected();
			System.out.println("test case for monday is pass");
			System.out.println(c);
		}
		Thread.sleep(3000);
		WebElement wb9 = driver.findElement(By.id("tuesday"));
		if (wb9.isDisplayed()&&wb9.isEnabled())
		{
			//wb7.click();
			boolean d = wb9.isSelected();
			System.out.println("test case for tuesday is pass");
			System.out.println(d);
		}
		Thread.sleep(3000);
		WebElement wb10 = driver.findElement(By.id("wednesday"));
		if (wb10.isDisplayed()&&wb10.isEnabled())
		{
			//wb7.click();
			boolean e = wb10.isSelected();
			System.out.println("test case for wednesday is pass");
			System.out.println(e);
		}
		Thread.sleep(3000);
		WebElement wb11 = driver.findElement(By.id("thursday"));
		if (wb11.isDisplayed()&&wb11.isEnabled())
		{
			//wb7.click();
			boolean f = wb11.isSelected();
			System.out.println("test case for thursday is pass");
			System.out.println(f);
		}
		Thread.sleep(3000);
		WebElement wb12 = driver.findElement(By.id("friday"));
		if (wb12.isDisplayed()&&wb12.isEnabled())
		{
			//wb7.click();
			boolean g = wb12.isSelected();
			System.out.println("test case for friday is pass");
			System.out.println(g);
		}
		Thread.sleep(3000);
		
		WebElement wb13 = driver.findElement(By.id("saturday"));
		wb13.click();
		if (wb13.isDisplayed()&&wb13.isEnabled())
		{
			
			boolean h = wb13.isSelected();
			System.out.println("test case for saturday is pass");
			System.out.println(h);
		}
		
		
		WebElement wb14 = driver.findElement(By.id("datepicker"));
		Thread.sleep(3000);
		wb14.click();
		if (wb14.isDisplayed()&&wb14.isEnabled())
		{
			
			boolean i = wb14.isSelected();
			System.out.println("test case for date is pass");
			System.out.println(i);
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}

}
