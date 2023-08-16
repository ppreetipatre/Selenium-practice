package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement wb1 = driver.findElement(By.name("firstName"));
		if (wb1.isDisplayed()&&wb1.isEnabled())
		{
			wb1.sendKeys("preeti");
		}
		
		WebElement wb2 = driver.findElement(By.name("lastName"));
		if(wb2.isDisplayed()&&wb2.isEnabled())
		{
			wb2.sendKeys("patre");
		}
		
		WebElement wb3 = driver.findElement(By.name("phone"));
		
		if (wb3.isDisplayed()&&wb3.isEnabled())
		{
			wb3.sendKeys("9865231475");
		}
		
		WebElement wb4 = driver.findElement(By.id("userName"));
		if(wb4.isDisplayed()&&wb4.isEnabled())
		{
			wb4.sendKeys("preeti@gmail.com");
		}
		
		
		WebElement wb5 = driver.findElement(By.name("address1"));
		if(wb5.isDisplayed()&&wb5.isEnabled())
		{
			wb5.sendKeys("vaibhav nager");
		}
		
		WebElement wb6 = driver.findElement(By.name("city"));
		if(wb6.isDisplayed()&&wb6.isEnabled())
		{
			wb6.sendKeys("latur");
		}
		
		WebElement wb7 = driver.findElement(By.name("state"));
		if(wb7.isDisplayed()&&wb7.isEnabled())
		{
			wb7.sendKeys("MH");
		}
		
		
		WebElement wb8 = driver.findElement(By.name("postalCode"));
		if(wb8.isDisplayed()&&wb8.isEnabled())
		{
			wb8.sendKeys("431517");
		}
		
		
		WebElement wb9 = driver.findElement(By.id("email"));
		if(wb9.isDisplayed()&&wb9.isEnabled())
		{
			wb9.sendKeys("preeti@gmail.com");
		}
		
		
		WebElement wb10 = driver.findElement(By.name("password"));
		if(wb10.isDisplayed()&&wb10.isEnabled())
		{
			wb10.sendKeys("preeti123");
		}
		
		
		WebElement wb11 = driver.findElement(By.name("confirmPassword"));
		if(wb11.isDisplayed()&&wb11.isEnabled())
		{
			wb11.sendKeys("preeti123");
		}
		
		Thread.sleep(5000);
		
		WebElement wb12 = driver.findElement(By.name("submit"));
		if(wb12.isDisplayed()&&wb12.isEnabled())
		{
			wb12.click();
		}
		
		WebElement wb13 = driver.findElement(By.linkText("sign-in"));
		
			wb13.click();
			
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
