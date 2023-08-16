package Tutorial5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usermethod {
	
	//create user defined method
	public void loginfunction(String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();

	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
	
		Usermethod obj = new Usermethod();
		Thread.sleep(3000);
		obj.loginfunction("Admin","admin123");
		System.out.println("username");
		System.out.println();
		System.out.println("password");
		
	}

}
