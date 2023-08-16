package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-id='auth-flow-section']/span/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='sc-12foipm-82 gKWNCi']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("(//p[contains(@class,'12foipm')])[1]")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='autoCompleteTitle '])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("new");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='autoCompleteTitle '])[1]")).click();
		//driver.findElement(By.xpath("//div[text()='June 2023']")).click();
		driver.findElement(By.xpath("(//p[@class='fsw__date'])[20]")).click();
		driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='sc-12foipm-58 fRycAH'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-63 ePVCFi'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='sc-12foipm-76 fvsOuM']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-1 jpXDbp']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-91 bwfKFn']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'uistyles__BookButton')])[1]")).click();
	}

}
