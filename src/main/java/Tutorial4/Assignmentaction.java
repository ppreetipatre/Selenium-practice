package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentaction {

	public static void main(String[] args) throws InterruptedException {
		// flipcart 
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("(//div[text()='Electronics'])"));
		//Thread.sleep(2000);
		Actions abc = new Actions(driver);
		abc.moveToElement(wb).build().perform();
		//abc.click();
		
		
		
		
		
		
		
		

	}

}
