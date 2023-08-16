package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafulp1030.github.io/RegisterForm.html");
		driver.manage().window().fullscreen();
		WebElement wb1 = driver.findElement(By.id("fname"));
		wb1.sendKeys("Preeti");
		//Thread.sleep(2000);
		//wb1.clear();
		
		WebElement wb2 = driver.findElement(By.id("lname"));
		wb2.sendKeys("Patre");
		//Thread.sleep(2000);
		//wb2.clear();
		
		WebElement wb3 = driver.findElement(By.id("address"));
		wb3.sendKeys("Latur");
		//Thread.sleep(2000);
		//wb3.clear();
		
		WebElement wb4 = driver.findElement(By.id("mobileNo"));
		wb4.sendKeys("9563265478");
		//Thread.sleep(2000);
		//wb4.clear();
		
		WebElement wb5 = driver.findElement(By.id("emaildId"));
		wb5.sendKeys("preeti@gmail.com");
		//Thread.sleep(2000);
		//wb5.clear();
	
		WebElement wb6 = driver.findElement(By.xpath("//button[@type='submit']"));
		String p = wb6.getText();
		System.out.println(p);
		wb6.click();
	
	}

}
