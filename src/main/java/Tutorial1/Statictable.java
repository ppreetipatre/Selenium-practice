package Tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {
	
	public static void main(String[]args) throws InterruptedException 
	
	{
		
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://prafpawar11.github.io/statictable.html");
	Thread.sleep(3000);
	List<WebElement> ls=driver.findElements(By.tagName("Student Id"));
	int b =ls.size();
	
	if(b==1)
	{
		System.out.println(b);

	}
	List<WebElement> ls1= driver.findElements(By.tagName("Student Name"));
	
	Thread.sleep(2000);
	int a = ls1.size();
	for(int i=0;i<a;i++)
	{
		String p=ls1.get(i).getText();
		if(p.equals("Priya"))
		{
			System.out.println(a);
		}
		
		
	}
	
	
	
	
	
	
	
	
		
		
	}

}
