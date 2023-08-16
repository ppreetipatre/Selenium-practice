package Tutorial4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
	//	Step 1: Up casting
		WebDriver driver = new ChromeDriver();
		
	//	Step 2: Open a https://www.makemytrip.com/
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		
	//	step 3: find the ""from"" object and enter Pune value
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[1]"));
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("pune");
		driver.findElement(By.xpath("(//div[@class='calc60'])[1]")).click();
		
	//	Step 4: find the "To" object and enter "New Delhi" value
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		
	//	step 5: select departure date as 10-Aug-2023 value
		Thread.sleep(5000);
		
		WebElement currmonth= driver.findElement(By.xpath("//div[@class='DayPicker-Caption'][1]"));
			while(true)
				{
				
				String s= currmonth.getText();
				//System.out.println(s);
				//currmonth.click();
			if(s.equals("August 2023"))
			{
				break;
			}
			else {
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
				}
		driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[10]")).click();
				
		
	//	step 6: select 5 Adults 4 children
			Thread.sleep(3000);
		WebElement ar = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox ')][5]"));
		ar.click();
		driver.findElement(By.xpath("//li[@data-cy='adults-5']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-4']")).click();
	
		//	step 7: select Travel class as "Premium Economy"
	
		driver.findElement(By.xpath("//li[text()='Premium Economy']")).click();
		
		
		//	step 8: click on Apply
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();

	//	step 9: Take screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);

	//	step 10: click on search flights
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
	//	step 11: take screenshot
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
	//	step 12: capture all flight price from low to high and print in console.		


		
















		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
