package Tutorial2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecuter {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(4000);
		//click on element
		//WebElement wb = driver.findElement(By.name("websubmit"));//
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",wb);
		js.executeScript("document.getElementById('websubmit').click();");
		
//		
//		driver.get("https://prafpawar11.github.io/basicdemo.html");
//		enter text in text box
		
//		js.executeScript("document.getElementByname('name').value='selenium';");		
		
		//WebElement wb = driver.findElement(By.name("firstname"));
		//js.executeScript("arguments[0].value='preeti';", wb);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('firstname').value='priti';");
		
		//open a browser
		

		//Thread.sleep(3000);
		
		//js.executeScript("window.location='https://www.google.com';");
		Thread.sleep(5000);
	//	js.executeScript("window.open=('https://www.amazon.com');");
		//js.executeScript("history.go(0);");
		
		//String a = js.executeScript("return document.title;").toString();
	    //System.out.println(a);
	
	//   String b =  js.executeScript("return document.URL;").toString();
	  // System.out.println(b);
	
	
	//	js.executeScript("alert('this is google page');");
	//	js.executeScript("confirm('facebook');");
	//	js.executeScript("prompt('fb');");
		
		
		
		
		
	
	}

}
