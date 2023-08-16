package Tutorial5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pushpatherise {
	
	public void google(String url)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement Google = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		Google.sendKeys("Pushpa-The rise");
		
		driver.get("https://www.google.com/search?q=pushpa+the+rise&hl=en&sxsrf=APwXEddJw0RCq3GZ0RO9G7dO-2QAXPLGAg%3A1687932152997&source=hp&ei=-MybZKXUN57k2roP3_GzmAs&iflsig=AOEireoAAAAAZJvbCOHhNC9ZwhExTEwkDA7kTV5Fsc4H&gs_ssp=eJzj4tVP1zc0zDIpNjc3z6gyYPTiLygtzihIVCjJSFUoyixOBQCbIgom&oq=Pushpa&gs_lcp=Cgdnd3Mtd2l6EAEYADIHCC4QigUQJzIICC4QsQMQgAQyCAgAEIAEELEDMgsILhCABBCxAxCDATIKCAAQgAQQAhDLATIICAAQgAQQsQMyCAgAEIAEELEDMgoIABCABBACEMsBMgsIABCABBCxAxCDATIKCAAQgAQQAhDLAToLCC4QigUQsQMQgwE6BQgAEIAEOggILhCABBCxA1AAWPAJYKxraABwAHgBgAHpBogBiw2SAQcwLjUuNi0xmAEAoAEB&sclient=gws-wiz");
		WebElement pushpa=driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise']"));
		pushpa.click();
		String wikidate = driver.findElement(By.xpath("(//div[@class='plainlist'])[5]")).getText();
		//System.out.println(wikidate);
		String country = driver.findElement(By.xpath("(//td[@class='infobox-data'])[14]")).getText();
		//System.out.println("country");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Part 1 (2021)']")).click();
		//a[text()='December 17, 2021 (United States)']
		WebElement imdb = driver.findElement(By.xpath("//a[text()='December 17, 2021 (United States)']"));
		String imdbdate = imdb.getText();
		System.out.println(imdbdate);
		driver.navigate().back();
		boolean a = wikidate.contains("December");
		boolean b =imdbdate.contains("December");
		System.out.println(a);
		System.out.println(b);
		if(a==b)
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		}
		
		public static void main(String[] args) {
	
		Pushpatherise pushpa1 = new Pushpatherise();
		pushpa1.google("https://www.google.com");
		
	
			
		}
		
}
