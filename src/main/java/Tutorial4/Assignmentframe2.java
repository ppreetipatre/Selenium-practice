package Tutorial4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentframe2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Enter topic as API Automation	
		WebElement wb = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		WebElement wb1 = driver.findElement(By.xpath("//input[0]"));
		wb1.sendKeys("API Automation");
		
		//select the avatar from drop down
		 driver.findElement(By.xpath("//iframe[@id='frame2']"));
        WebElement wb2 = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(wb2);
        List<WebElement> ls = sel.getOptions();
        int a = ls.size();
        for (int i=0; i<a;i++)
        {
        String s= ls.get(i).getText();
        if (s.equals("Avatar"))
        {
        	wb2.click();
        	
        }
        
		//select the checkbox 
        Thread.sleep(2000);
		wb2.click();
		
		//select the cat from drop down
		if(s.equals("cat"))
		{
			wb2.click();
		}
				
		//unselect the checkbox 
		Thread.sleep(2000);
		wb2.click();
		
		//clear the topic and enter UI Automation
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(wb);
		wb1.clear();
		wb1.sendKeys("UI Automation");
		
		
		
        }
		
		
		

	}

}
