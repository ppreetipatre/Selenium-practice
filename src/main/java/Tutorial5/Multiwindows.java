package Tutorial5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		String parentID = 	driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Visit Facebook']")).click();
		Set<String> allwindow=driver.getWindowHandles();
		String facebookid= null;
		for(String abc : allwindow)
		{
			if(!abc.equals(parentID))
			{
				facebookid=abc;
			}
		}
		
		driver.switchTo().window(facebookid);
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("preeti");
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		driver.findElement(By.name("lname")).sendKeys("patre");
		

	}

}
