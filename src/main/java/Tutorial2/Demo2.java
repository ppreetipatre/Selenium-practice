package Tutorial2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://prafpawar11.github.io/checkbox.html");
		WebElement wb1 = driver.findElement(By.name("API Testing"));
		boolean a = wb1.isDisplayed();
		boolean b = wb1.isEnabled();
		boolean c= wb1.isSelected();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		wb1.click();
		
		WebElement wb2 = driver.findElement(By.name("Automation Testing"));
		boolean d = wb2.isDisplayed();
		boolean e = wb2.isEnabled();
		boolean f= wb2.isSelected();
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		WebElement wb3 = driver.findElement(By.name("Selenium"));
		boolean g = wb3.isDisplayed();
		boolean h = wb3.isEnabled();
		boolean i= wb3.isSelected();
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		WebElement wb4 = driver.findElement(By.name("Cucumber"));
		boolean j = wb4.isDisplayed();
		boolean k = wb4.isEnabled();
		boolean l= wb4.isSelected();
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		wb4.click();
		
		WebElement wb5 = driver.findElement(By.name("TestNG Next Generation	"));
		boolean m = wb5.isDisplayed();
		boolean n = wb5.isEnabled();
		boolean o= wb5.isSelected();
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		wb5.click();
		
		WebElement wb6 = driver.findElement(By.name("TestNG Next Generation	"));
		boolean p = wb6.isDisplayed();
		boolean q = wb6.isEnabled();
		boolean r= wb6.isSelected();
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
				
			
		WebElement wb7 = driver.findElement(By.name("TestNG Next Generation	"));
		boolean s = wb7.isDisplayed();
		boolean t = wb7.isEnabled();
		boolean u= wb7.isSelected();
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		
		
			

	}

}
