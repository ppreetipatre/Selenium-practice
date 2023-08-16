package Tutorial2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Step 1: Up casting
		
		WebDriver driver = new ChromeDriver();
		
		//Step 2; Open a https://demo.automationtesting.in/Register.html URL
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//step 3: Find the Skills drop down element
		
		WebElement wb1 = driver.findElement(By.id("Skills"));
		//wb1.click();
		
		//Step 4: select the value using Select by Visible Text method
		Select sel = new Select(wb1);
		//WebElement wb2 = sel.getFirstSelectedOption();
		
		//wb2.click();
		
		//step 5: capture /copy the selected value from drop down.
		 sel.selectByVisibleText("C++");
		 WebElement wb9 = sel.getFirstSelectedOption();
			
			//wb2.click();
		 String a = wb9.getText();
			
			System.out.println(a);
			Thread.sleep(2000);
			
		//step 6: count how many value present in drop down
		 List<WebElement> ls = sel.getOptions();
		int a1 = ls.size();
		System.out.println(a1);
		
		Thread.sleep(2000);
		//step 7: Find the year month drop down element
		WebElement wb3 = driver.findElement(By.id("yearbox"));
		wb3.click();
		//Step 8: select the value using Select by Visible text method
		Select sel1 = new Select(wb3);
		sel1.selectByVisibleText("1984");
		
		//step 9: capture /copy the selected value from drop down.
		
		WebElement wb4 = sel1.getFirstSelectedOption();
		String s1 = wb4.getText();
		
		//step 10: count how many value present in drop down
		List<WebElement> ls1 = sel1.getOptions();
		int b = ls1.size();
		//step 11: find the month drop down element
		WebElement wb5= driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		//step 12: select the value using select by index method
		Select sel2 = new Select (wb5);
		sel2.selectByIndex(5);
		
		//step 13: capture /copy the selected value from drop down.
		WebElement wb6 = sel2.getFirstSelectedOption();
		String s2 = wb6.getText();
		System.out.println(s2);
		
		//step 14: count how many value present in drop down
		List<WebElement> ls2 = sel2.getOptions();
		int c = ls2.size();
		Thread.sleep(3000);
		//step 15: find the date drop down element
		WebElement wb7 = driver.findElement(By.id("daybox"));
		wb7.click();
		
		//step 16: select the value using select by value method
		Select se3 = new Select(wb7);
		se3.selectByValue("12");
		
		//step 17: capture /copy the selected value from drop down.
		WebElement wb8 = se3.getFirstSelectedOption();
		String s3 = wb8.getText();
		System.out.println(s3);
		//step 18: count how many value present in drop down
		
		List<WebElement> ls3 = se3.getOptions();
		int d = ls3.size();
		
	}

}
