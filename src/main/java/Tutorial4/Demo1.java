package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb = driver.findElement(By.name("firstname"));
		wb.click();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.sendKeys(wb, "preeti").keyDown(Keys.TAB).sendKeys("patre").keyUp(Keys.TAB)
		.keyDown(Keys.TAB).sendKeys("9548451225").keyUp(Keys.TAB).keyDown(Keys.TAB)
		.sendKeys("preeti123") .build().perform();
		
		
		
		
		
		
		

	}

}
