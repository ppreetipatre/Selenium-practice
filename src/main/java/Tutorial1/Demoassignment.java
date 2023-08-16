package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoassignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement wb1 = driver.findElement(By.name("firstName"));
		wb1.sendKeys("preeti");
		 boolean a = wb1.isDisplayed();
		 boolean b= wb1.isEnabled();	
		 System.out.println(a);
		 System.out.println(b);
		WebElement wb2 = driver.findElement(By.name("lastName"));
		wb2.sendKeys("patre");
		 boolean c = wb2.isDisplayed();
		 boolean d= wb2.isEnabled();	
		 System.out.println(c);
		 System.out.println(d);
		WebElement wb3 = driver.findElement(By.name("phone"));
		wb3.sendKeys("9542368711");
		 boolean e = wb3.isDisplayed();
		 boolean f= wb3.isEnabled();	
		 System.out.println(e);
		 System.out.println(f);
		WebElement wb4 = driver.findElement(By.id("userName"));
		wb4.sendKeys("preetipatre@gmail.com");
		 boolean g = wb4.isDisplayed();
		 boolean h= wb4.isEnabled();	
		 System.out.println(g);
		 System.out.println(h);
		WebElement wb5 = driver.findElement(By.name("address1"));
		wb5.sendKeys("vaibhav nager");
		 boolean p = wb5.isDisplayed();
		 boolean x= wb5.isEnabled();	
		 System.out.println(p);
		 System.out.println(x);
		WebElement wb6 = driver.findElement(By.name("city"));
		wb6.sendKeys("latur");
		 boolean i = wb6.isDisplayed();
		 boolean j= wb6.isEnabled();	
		 System.out.println(i);
		 System.out.println(j);
		WebElement wb7 = driver.findElement(By.name("state"));
		wb7.sendKeys("MH");
		 boolean k = wb7.isDisplayed();
		 boolean l= wb7.isEnabled();	
		 System.out.println(k);
		 System.out.println(l);
		 WebElement wb8 = driver.findElement(By.name("email"));
		wb8.sendKeys("preetipatre@gmail.com");
		 boolean m = wb8.isDisplayed();
		 boolean n= wb8.isEnabled();	
		 System.out.println(m);
		 System.out.println(n);
		WebElement wb9 = driver.findElement(By.name("password"));
		wb9.sendKeys("preeti@123");
		 boolean o = wb9.isDisplayed();
		 boolean z= wb9.isEnabled();	
		 System.out.println(o);
		 System.out.println(z);
		WebElement wb10 = driver.findElement(By.name("confirmPassword"));
		wb10.sendKeys("preeti@123");
		 boolean q = wb10.isDisplayed();
		 boolean r= wb10.isEnabled();	
		 System.out.println(q);
		 System.out.println(r);
		WebElement wb11 = driver.findElement(By.name("submit"));
		
		 boolean s = wb1.isDisplayed();
		 boolean t= wb1.isEnabled();	
		 System.out.println(s);
		 System.out.println(t);
		 Thread.sleep(5000);
		 wb11.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
