package Tutorial1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeBrowser {

	public static void main(String[] args) {
		// Change browser size
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//create object of daimention class
		//org.openqa.selenium.Dimension d= new Dimension(1000,2000);
		driver.manage().window().setSize(new Dimension(200,3000));
		
		
		
		
		
		
		

	}

}
