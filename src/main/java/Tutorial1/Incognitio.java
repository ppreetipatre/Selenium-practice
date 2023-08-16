package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognitio {

	public static void main(String[] args) {

		//WebDriver driver = new ChromeDriver();
		
		
		//create object of chrome class
		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--incognito");
//		WebDriver driver1 =new ChromeDriver(opt);
//		driver1.get("https://www.facebook.com");
		
		
		opt.addArguments("--Headless");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
		
		
		
		
		
		
		
		
		

	}

}
