package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();	
		driver.findElement(By.xpath("//span[@class='sc-12foipm-82 gKWNCi']")).click();
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		driver.findElement(By.xpath("(//span[@class='autoCompleteTitle '])[1]")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@class='sc-12foipm-44 etmZgr'])[1]")).click();
		
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[2]")).sendKeys("New Delhi");
		
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-44 etmZgr'])[1]")).click();
		
//	  driver.findElement(By.xpath("//span[@class='sc-12foipm-38 fXmuXi'][text()='To']")).click();

	}

}
