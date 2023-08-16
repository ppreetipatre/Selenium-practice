package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		// Action methods
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement wb= driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();
		
		act.click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
