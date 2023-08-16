package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		//Step1:Upcasting
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		
		//Step2:find username text box
		WebElement wb1 = driver.findElement(By.name("user-name"));
		
		//Step3:check displayed status
		
		boolean a = wb1.isDisplayed();
		System.out.println(a);
		
		//Step4:check enabled status
		boolean b = wb1.isEnabled();
		System.out.println(b);
		
		//Step5:enter username as
		wb1.sendKeys("standard_user");
		
		//setp6:find password text box
		
		WebElement wb2 = driver.findElement(By.name("password"));
		Thread.sleep(5000);
		
		//Stpe7: check displayed status
		boolean c = wb2.isDisplayed();
		
		//step8:check enabled status
		boolean d = wb2.isEnabled();
		
		//step9: enter password as 	secret_sauce
		wb2.sendKeys("secret_sauce");
		
		//step 10 find login button 
		WebElement wb3 = driver.findElement(By.name("login-button"));
		
		//Step 11: check displayed status
		
		boolean e = wb3.isDisplayed();		
		
		//step 12: check enabled status
		boolean f = wb3.isEnabled();
		
		//step 13: click on login button
		
		wb3.click();
		
		// step 14: capture home page title
		
		String s = driver.getTitle();
		
		//step 15: capture home page url
		String p = driver.getCurrentUrl();
		
		//step 16 : find Sauce Labs Backpack add to cart product Object/Element
			WebElement wb5 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));	
		// Step 17 :  click on add to cart
		
		wb5.click();
		// step 18 :find Sauce Labs Bike Light add to cart product
		WebElement wb6 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		
		// Step 19 :  click on add to cart

		wb6.click();
		
		// step 20 : find Sauce Labs Bolt T-Shirt add to cart product
		WebElement wb7 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		
		// step 21 : click on add to cart
		wb7.click();
		
		// step 22 : find the shopping cart container
		WebElement wb8 = driver.findElement(By.className("shopping_cart_link"));
		
		//step 23 : click on shopping cart container
		
		wb8.click();
	
		//step 24 : find the checkout button
		
		WebElement wb9 = driver.findElement(By.id("checkout"));
		
		//step 25 : click on checkout button
		
		wb9.click();
		Thread.sleep(5000);
		// step 26 : find the first name text box
		
		WebElement wb10 = driver.findElement(By.id("first-name"));
		
		//Step 27 : enter your name
		
		wb10.sendKeys("preeti");
		
		//Step 28 : find the last name text box
		WebElement wb11 = driver.findElement(By.id("last-name"));
		
		//step 29 : enter last name 
		wb11.sendKeys("patre");
		
		// step 30 : find the zip text box
		
		WebElement wb12 =  driver.findElement(By.id("postal-code"));
		
		//step 31 : enter the zip code
		
		 wb12.sendKeys("431512");
		
		// step 32 : find the continue button
		WebElement wb13 = driver.findElement(By.id("continue"));
		
		// step 33: click on continue button
		
		 wb13.click();
		 Thread.sleep(5000);
		
		// step 34 : find the finish button
		
		WebElement wb14 = driver.findElement(By.id("finish"));
		
		
		//step 35: click on finish button
		
		wb14.click();
		
		//step 36: find the back Home button
		
		WebElement wb15 = driver.findElement(By.id("back-to-products"));
		Thread.sleep(5000);
		
		//step 37: click on back home button
		
		
		wb15.click();
	
	
	
	
	
	
	
	
	
	
	
	}

}
