package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\18134\\Desktop\\selenium\\chromedriver_win32.zip");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			}

}
