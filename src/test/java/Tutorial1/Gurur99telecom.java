package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gurur99telecom {
	
	 static WebDriver driver;
	@BeforeClass
	public void Startup() throws InterruptedException
	{
		Thread.sleep(10000);
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	@Test(priority=1)
	public void guru99Telecom()
	{
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}
	@Test(priority=2)
	public static void AddCustomer(String fname, String lname,String email,String Address,String mobile) throws InterruptedException
	{
		
		WebElement done = driver.findElement(By.xpath("//input[@id='done']//following::label[1]"));
		done.click();
		Thread.sleep(2000);
		WebElement fname1= driver.findElement(By.name("fname"));
		fname1.sendKeys(fname);
		Thread.sleep(2000);
		WebElement lname1= driver.findElement(By.name("lname"));
		Thread.sleep(2000);
		lname1.sendKeys(lname);
		WebElement Email= driver.findElement(By.name("emailid"));
		Email.sendKeys(email);
		WebElement address= driver.findElement(By.xpath("//textarea[@name='addr']"));
		address.sendKeys(Address);
		WebElement mobile1= driver.findElement(By.name("telephoneno"));
		mobile1.sendKeys(mobile);
		Thread.sleep(2000);
		WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	}
	@Test(priority=3)
	public void addcustomermethod() throws InterruptedException
	{
		
		Gurur99telecom.AddCustomer("preeti","patre","preeti@gmail.com","pune","12365478");
		//Gurur99telecom.Addterrifplan("200","600","300","600","410","620");
	}
	@Test(priority=4)
	public void customerID() throws InterruptedException
	{
		WebElement custid1= driver.findElement(By.xpath("//table[@class='alt access']//td[2]"));
		Thread.sleep(5000);
		String custid = custid1.getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='actions']/li/a")).click();
	}
	
	@Test(priority=5)
	public static void Addterrifplan(String local1,String month,String intermin,String sms,String minute,String intercg) throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		Thread.sleep(2000);
		WebElement local=driver.findElement(By.id("local_minutes"));
		local.sendKeys(local1);
		Thread.sleep(2000);
		WebElement monthly=driver.findElement(By.id("rental1"));
		monthly.sendKeys(month);
		WebElement inter_minutes=driver.findElement(By.id("inter_minutes"));
		inter_minutes.sendKeys(intermin);
		Thread.sleep(2000);
		WebElement sms_pack=driver.findElement(By.id("sms_pack"));
		sms_pack.sendKeys(sms);
		WebElement minutes_charges=driver.findElement(By.id("minutes_charges"));
		minutes_charges.sendKeys(minute);
		Thread.sleep(2000);
		WebElement inter_charges=driver.findElement(By.id("inter_charges"));
		inter_charges.sendKeys(intercg);
	
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

