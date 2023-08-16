package Tutorial5;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewin {

	public static void main(String[] args) {
		// Handle mumtiple windows by using Arraylist method
		
		
		//Step 1: upcasting
		WebDriver driver = new ChromeDriver();
		
		//open parent window
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		//Capture parent ID
		String parentID = driver.getWindowHandle();
		
		//click on facebook
		driver.findElement(By.linkText("Visit Facebook")).click();
		
		//capture facebook ID
		Set<String> Allwindow = driver.getWindowHandles();
		
		String facebookid = null;
		
		ArrayList<String> arr = new ArrayList<String>(Allwindow);
		
		facebookid= arr.get(1); 
		
		System.out.println(facebookid);
		
		driver.switchTo().window(facebookid);
		driver.switchTo().window(parentID);
		
		

	}

}
