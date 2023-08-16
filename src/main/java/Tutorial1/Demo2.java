package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		// Open a wikipedia application
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.com");
		
		//capture URL
		
		String a = driver.getCurrentUrl();
		System.out.println(a);
		
		//navigate to redbus application
		
		
		driver.navigate().to("https://www.redbus.com");
		
		
		
		//capture url
		
		String b = driver.getCurrentUrl();
		System.out.println(b);
		
		Thread.sleep(10000);
		
		//navigate to amazon application
		driver.navigate().to("https://www.amazon.com");
		
		//capture URl
		
		String c = driver.getCurrentUrl();
		System.out.println(c);
		
		//navigate back 
		
		driver.navigate().back();
		
		//navigate back 
		
		driver.navigate().back();
		
		//Capture Title
		
		String d= driver.getTitle();
		System.out.println(d);
		
		//navigate forward
		
		//Thread.sleep(10000);
		
		driver.navigate().forward();
		driver.navigate().forward();
		
		// capture title
		
		String e=driver.getTitle();
		System.out.println(e);
		
		//refresh the web page
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		

	}

}
