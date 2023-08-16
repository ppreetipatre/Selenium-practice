package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// Assignment of orange hrm
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement a = driver.findElement(By.name("username"));
		boolean a1=a.isDisplayed();
				System.out.println(a1);
		boolean a2=a.isEnabled();
		System.out.println(a2);
		Thread.sleep(5000);
		a.sendKeys("Admin");
		
		WebElement b = driver.findElement(By.name("password"));
		boolean b1 = b.isDisplayed();
		System.out.println(b1);
		boolean b2= b.isEnabled();
		System.out.println(b2);

		Thread.sleep(5000);
		b.sendKeys("admin123");
		WebElement c = driver.findElement(By.xpath("//button[text()=' Login ']"));
		boolean c1 = c.isDisplayed();
		System.out.println(c1);
		boolean c2 = c.isEnabled();
		System.out.println(c2);

		Thread.sleep(5000);
		c.click();
	}

}
