package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignsauce {

	WebDriver driver;
	String title;
	
	@BeforeClass
	public void setup()
	{
	
		driver= new ChromeDriver();
		driver.get(" https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@Test(priority=1)
	public void loginfunctionality()
	{
	
		WebElement username = driver.findElement(By.id("user-name"));
		if(username.isDisplayed()&&username.isEnabled())
		{
			username.sendKeys("standard_user");
		}
		WebElement password = driver.findElement(By.id("password"));
		if(password.isDisplayed()&&password.isEnabled())
		{
			password.sendKeys("secret_sauce");
		}
		WebElement login = driver.findElement(By.id("login-button"));
		if(login.isDisplayed()&&login.isEnabled())
		{
			login.click();
		}
	}
		@Test(priority=2)	
	   public void title() throws InterruptedException
	      {
			Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
	      }
		
		@Test(priority=3)
		public void url() 
		{
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		
		@Test(priority=4)
		public void addtocart() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		}
		@Test(priority=5)
		public void container()
		{
			
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.id("checkout")).click();
		
		}
		@Test(priority=6)
		public void checkout() throws InterruptedException
		{	
			Thread.sleep(2000);
			driver.findElement(By.id("first-name")).sendKeys("preeti");
			Thread.sleep(2000);
			driver.findElement(By.id("last-name")).sendKeys("patre");
			driver.findElement(By.id("postal-code")).sendKeys("431514");
			Thread.sleep(2000);
			driver.findElement(By.id("continue")).click();
		}
		
		@Test(priority=7)
		public void finish()
		{
			
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		driver.findElement(By.id("back-to-products")).click();
		}
		@Test(priority=8)
		public void finaltitle() throws InterruptedException
		{
			String title2= driver.getTitle();
			Thread.sleep(3000);
			if(title==title2)
			{
				System.out.println("Test case pass");
			}
				System.out.println("Test case fail");
		}

		@AfterClass
		
			public void teardown()
			{
		
			driver.quit();
			}
		
		
		
		
		
		
		
	}

