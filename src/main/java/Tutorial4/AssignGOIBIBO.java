package Tutorial4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignGOIBIBO {

	public static void main(String[] args) throws InterruptedException, IOException {
	//  First Assignment 
		
		//Step 1: Up casting
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open a https://www.goibibo.com/
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		Thread.sleep(3000);
		//step 3: find the ""from"" object and enter ""Pune value"
		driver.findElement(By.xpath("//span[@class='sc-12foipm-82 gKWNCi']")).click();
		driver.findElement(By.xpath("(//p[contains(@class,'12foipm')])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='autoCompleteTitle '])[1]")).click();
	
		Thread.sleep(3000);
		//Step 4: find the "TO" object and enter "New Delhi" value
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='autoCompleteTitle '])[1]")).click();
		
		//step 5: select departure date as 10-Aug-2023 value
		WebElement curdate = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div"));
			
		//curdate.click();
		while(true)
		{
			String s= curdate.getText();
			if(s.equals("August 2023"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			}
			
		}
		
		driver.findElement(By.xpath("(//p[@class='fsw__date'])[14]")).click();
		driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
		
		
		//step 7: select Travel class as "Premium Economy"
		driver.findElement(By.xpath("//li[text()='premium economy']")).click();
		
		
		//step 6: select 5 Adults 4 children
		Thread.sleep(3000);
		
		 //wb.click();
		
		while(true)
		{
			WebElement wb= driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 cIulwT'])[1]"));
			String p = wb.getText();
			if(p.equals("5"))
			{
				break;
			}
			else
			{
			
			driver.findElement(By.xpath("(//span[@class='sc-12foipm-63 ePVCFi'])[2]")).click();
			}
		}
		
		Thread.sleep(3000);
		
		
		//wb1.click();
		Thread.sleep(3000);
		while(true)
		{
			WebElement wb1 = driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 cIulwT'])[2]"));
			String p1 = wb1.getText();
			if(p1.equals("4"))
			{
				break;
			}
			driver.findElement(By.xpath("(//span[@class='sc-12foipm-63 ePVCFi'])[4]")).click();
		}
		
		
		
		//step 8: click on Done 
			driver.findElement(By.xpath("//a[@class='sc-12foipm-76 fvsOuM']")).click();	
			Thread.sleep(3000);
		//step 9: Take screenshot
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\18134\\Desktop\\abc.png"));
		
			
			//step 10: click on search flights
			driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		
		//step 11: take screenshot
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File src1 = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1,new File("C:\\Users\\18134\\Desktop\\abc1.png"));
			Thread.sleep(10000);
		
			//step 12: capture all flight price high to low and print in console.
			Thread.sleep(10000);
		List<WebElement> fair= driver.findElements(By.xpath("//div[@class='alignItemsEnd flexCol']"));
		int a = fair.size();
	
        for(int i=0;i<=a;i++)	
        {
        	String k= fair.get(i).getText();
        	System.out.println(k);
        }
		
	

	}

}
