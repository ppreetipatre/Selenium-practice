package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement wb = driver.findElement(By.id("searchInput"));
		Thread.sleep(3000);
		wb.sendKeys("pushpa the rise");
		wb.click();
		//WebElement wb1 = driver.findElement(By.className("REySof"));
		//wb1.click();
		Thread.sleep(3000);
		WebElement wb2 = driver.findElement(By.xpath("//th[@class='headerSort']"));
				wb2.click();
		
		
		
		
		
	}

}
