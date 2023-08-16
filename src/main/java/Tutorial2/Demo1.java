package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		
		WebElement wb1 = driver.findElement(By.name("firstname"));
		wb1.sendKeys("preeti");
		WebElement wb2 = driver.findElement(By.name("lastname"));
		wb2.sendKeys("patre");
		WebElement wb3 = driver.findElement(By.name("reg_email__"));
		wb3.sendKeys("125364789");
		WebElement wb4 = driver.findElement(By.name("websubmit"));
		wb4.sendKeys("125364789");
		wb4.click();
		Thread.sleep(5000);
		WebElement wb5 = driver.findElement(By.linkText("Already have an account?"));
				wb5.click();		
		
		
		
		
	}

}
