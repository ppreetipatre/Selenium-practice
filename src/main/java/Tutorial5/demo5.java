package Tutorial5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public String abc(String url)
	{
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		String revTitle="";
		for(int i=title.length()-1;i>=0;i--)//java//1
		{
			revTitle=revTitle+title.charAt(i);//avaj
		}
		return revTitle;
	}
	public static void main(String[] args) {
		
		demo5 obj=new demo5();
		String b=obj.abc("https://www.amazon.com");
		System.out.println(b);
		
	}

}
