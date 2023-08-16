package Tutorial5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revfacebook {
	
	public static void facebooklogin(String url)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String title = driver.getTitle();
		String str [] = title.split(" ");
		String fb = str[0];
		String revfb=" ";
		for(int i=fb.length()-1;i>=0;i--)
		{
			revfb=revfb+fb.charAt(i);
			
		}
		System.out.println(revfb);
		
		//String revfb1 = revfb1+" "+str[i];
		
		//System.out.print(revfb1);
		
		for(int i=1;i<str.length;i++)
		{
			revfb =revfb + str[i] +" ";
		}
		System.out.print(revfb);
	}
	
	
	

	public static void main(String[] args) {
		
		
		Revfacebook.facebooklogin("https://www.facebook.com");
		
		
	}

}
