package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("pune");
		driver.findElement(By.className("gNO89b")).click();
		
	}

}
