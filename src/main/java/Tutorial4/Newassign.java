package Tutorial4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newassign {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Enter value in Frame1 text Box
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		WebElement text1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
		text1.click();
		text1.sendKeys("Automation");

		Thread.sleep(3000);
		//Switch to iframe and ("Did you know that the IDE has a LOOP button") drop down print all in console and select yes
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		//WebElement f3c3 = driver.findElement(By.xpath("//div[@class='vQES8d']")); 
		driver.switchTo().frame(frame3);
		driver.switchTo().frame(0);
		WebElement chk = driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']"));
		Select sel = new Select(chk);
		List<WebElement> ls = sel.getOptions();
				int a = ls.size();
				System.out.println(a);
				for (int i=1;i<a;i++) {
				if (sel.equals("yes"))
				{
					chk.click();
				}
	}

				Thread.sleep(3000);
		//Enter value in Frame4 text Box	
					
			driver.switchTo().defaultContent();
			WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
			WebElement text4 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			text4.sendKeys("testing");
			

			Thread.sleep(3000);
			
		//Step6: Switch to iframe and ("How do you plan to use the software?") click all check box	
			driver.switchTo().defaultContent();
			driver.switchTo().frame(frame3);
			WebElement f3c31 = driver.findElement(By.xpath("//div[@class='geS5n']"));
			WebElement f3c3c1 = driver.findElement(By.xpath("//div[@class='uHMk6b fsHoPb']"));
			f3c3c1.click();
			WebElement f3c3c2 = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]']"));
			f3c3c2.click();
			WebElement f3c3c3 = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[3]"));
			f3c3c3.click();
			
			

			Thread.sleep(3000);
		//: Enter value in Frame2 text Box
			
			WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']")); 
			WebElement text2 = driver.findElement(By.xpath("//input[@name='mytext2']")); 
			text2.sendKeys("Selenium");
			
			
			//Step8: Switch to iframe and select "Other" radio button and send "Auutomation"

			driver.switchTo().defaultContent();
			driver.switchTo().frame(frame3);
			WebElement f3c2 = driver.findElement(By.xpath("(//div[@class='Qr7Oae'])[2]"));
			WebElement f3c2c1 = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[3]"));
			WebElement f3c2c1t1 = driver.findElement(By.xpath("//input[@class='Hvn9fb zHQkBf']"));
			f3c2c1t1.sendKeys("Automate");

			Thread.sleep(3000);
			//step9:Enter value in Frame5 text Box
			driver.switchTo().defaultContent();
			WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
			WebElement text5 = driver.findElement(By.xpath("//input[@name=mytext5l'"));
			text5.sendKeys("Alldone");
			
			
					
					
					
					
					
					
					
					
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
