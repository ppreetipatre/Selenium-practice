package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// Frame practice
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//switch to the iframe with an iframe and enter the first name
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame2.click();
		
		
		//driver.switchTo().frame(1);
		WebElement wb3 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(wb3);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement wb= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		wb.click();
		wb.sendKeys("preeti");
		
		
		//switch to the iframe with an iframe and enter the first name
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		frame1.click();
		Thread.sleep(2000);
		WebElement wb4=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(wb4);
		Thread.sleep(3000);
		WebElement wb2= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		wb2.click();
		wb2.sendKeys("patre");
		
		
		//switch to the iframe with an iframe and capture the entered name and clear the name and enter the new name

		driver.switchTo().defaultContent();
		frame2.click();
		driver.switchTo().frame(wb3);
		//wb.clear();
		Thread.sleep(5000);
		//Actions act= new Actions(driver);
		//act.sendKeys("kaavya");
		//wb.sendKeys("kaavya");
		
		//switch to the single frame and capture the entered name and clear the name and enter the new name
		driver.switchTo().defaultContent();
		frame1.click();
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		//String s1 = wb2.getText();
		//System.out.println(s1);
		Thread.sleep(5000);
		wb2.clear();
		Thread.sleep(5000);
		wb2.sendKeys("waghmare");
		
		
		
		
		
		
		
		
		
		
		

	}

}
