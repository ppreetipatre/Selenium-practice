package Tutorial4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redbus2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		//from Xpath
		WebElement wb = driver.findElement(By.xpath("//input[@id='src']"));
		wb.click();
		Thread.sleep(7000);
		wb.sendKeys("pune");
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//text[@class='placeHolderMainText'])[4]")).click();
		
		//to xpath
		Thread.sleep(7000);
		Actions act = new Actions(driver);
		
		WebElement wb5 = driver.findElement(By.xpath("//input[@id='dest']"));
		wb5.click();
		act.keyDown(Keys.SHIFT).sendKeys("mumbai").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//text[@class='placeHolderMainText'])[5]")).click();
		
		driver.findElement(By.xpath("(//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj'])[25]")).click();
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		Thread.sleep(5000);
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='fare d-block']"));
		
		int a = ls.size();
		for (int i=0; i<a; i++)
		{
			String p = ls.get(i).getText();
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
	}

}
