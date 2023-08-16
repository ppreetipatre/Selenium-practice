package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.agoda.com/?cid=1753807");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ab-close-button']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//FIND CALENDER
		WebElement wb = driver.findElement(By.xpath("(//div[@class='SearchBoxTextDescription__title'])[2]"));
		wb.click();
				
		WebElement wb2= driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		wb2.click();
		
		//ITERATE LOOP
		while(true)
		{
			//current date
			WebElement wb1=driver.findElement(By.xpath("(//span[@class='DayPicker-Day__label'])[33]"));
			String s= wb1.getText();
			Thread.sleep(3000);
			if(s.contains("May 2024"))
					{
				      break;
					}
			
				//Thread.sleep(3000);
				wb2.click();
		}
		Thread.sleep(3000);
		//SELECT EXPECTED DATE
		WebElement expdate = driver.findElement(By.xpath("(//span[text()='14'])[1]"));
		expdate.click();
	
	}

}
