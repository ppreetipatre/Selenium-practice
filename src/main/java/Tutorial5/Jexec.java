package Tutorial5;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jexec {

	public static void main(String[] args) throws InterruptedException {
		//java script executor practice
		
		// upcasting
		WebDriver driver= new ChromeDriver();
		
		//start jacvascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//open URL using javascript executor
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/web/index.php/auth/login';");		
		
		//gettitle
		
		String s= (String) js.executeScript("return document.title;".toString());
		System.out.println(s);
		
		//get URL
		
		String p= (String) js.executeScript("return document.URL;".toString());
		System.out.println(p);
		Thread.sleep(3000);
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		//open facebook
		js.executeScript("window.open('https://www.facebook.com');");
		
		//alert popup
		Thread.sleep(2000);
		Set<String> allwindow = driver.getWindowHandles();
		String faceid= null;
		
		ArrayList<String> arr = new ArrayList<String>(allwindow);
		faceid =arr.get(1);
		
		js.executeScript("alert('WElcome'),");
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		
		
		
		
		
		
		
		
		
		

	}

}
