package Tutorial6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseLayer {
	 
	
	public static ThreadLocal<WebDriver> driverThreadlocal = new ThreadLocal<WebDriver>();
	public WebDriver getDriver()
	{
		WebDriver driver = driverThreadlocal.get();
		return driver;
	}
	
	

	public void intialization(String browsername)
	{
		WebDriver driver=null;
		if (browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driverThreadlocal.set(driver);
		driver.get("https://demo.guru99.com/test/newtours/register.php");;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}

}
