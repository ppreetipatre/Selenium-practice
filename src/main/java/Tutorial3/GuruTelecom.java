package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruTelecom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		driver.manage().window().maximize();
		//add new customer
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("preeti");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("patre");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("preeti@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("latur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9865321478");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement wb = driver.findElement(By.xpath("//table[@class='alt access']//td[2]"));
		String s = wb.getText();
		System.out.println(s);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		driver.navigate().to("https://demo.guru99.com/telecom/index.html");
		//add tariff plan to customer
		driver.navigate().to("https://demo.guru99.com/telecom/addtariffplans.php");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
		driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys("2500");
		driver.findElement(By.xpath("//input[@name='inter_minutes']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='minutes_charges']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='inter_charges']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys("50");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//navigate back
		
		driver.navigate().to("https://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan to Customer']")).click();
		driver.navigate().to("https://demo.guru99.com/telecom/assigntariffplantocustomer.php");
		
		
		driver.findElement(By.xpath("//input[@id='sele']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
