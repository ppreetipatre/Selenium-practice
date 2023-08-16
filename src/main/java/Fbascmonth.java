import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbascmonth {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb1= driver.findElement(By.name("birthday_month"));
		Select sel = new Select(wb1);
		List<WebElement> ls= sel.getOptions();
		
		TreeSet ts= new TreeSet();
		for(WebElement a:ls)
		{
			String p = a.getText();
			ts.add(p);
			
		}
		System.out.println(ts);
		System.out.println(ts.descendingSet());
	}
	
	
	
	
	
}
