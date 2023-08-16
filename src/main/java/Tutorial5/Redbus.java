package Tutorial5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// FROM xpath
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		//Alert alt = driver.switchTo().alert();
			//alt.accept();
			Thread.sleep(5000);
		driver.findElement(By.xpath("(//text[@class='placeHolderMainText'])[5]")).click();
		
		//TO xpath
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai");
		driver.findElement(By.xpath("(//text[@class='placeHolderMainText'])[7]")).click();

		Thread.sleep(3000);
		//date xpath
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		driver.findElement(By.xpath("//span[text()='25']")).click();
		
		//search xpath
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		
		//fair
		Thread.sleep(3000);

		List<WebElement> fair = driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
		
		int a = fair.size();
		
		for (int i=0; i<a; i++)
		{
			String s= fair.get(i).getText();
			System.out.println(s);
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
