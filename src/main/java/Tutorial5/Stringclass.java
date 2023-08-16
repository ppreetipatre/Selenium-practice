package Tutorial5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stringclass {

	public static void main(String[] args) {
		
//		Ass 1:
//			Step 1: up casting
			WebDriver driver = new ChromeDriver();
		
//			Step 2: open a fb application
			driver.get("https://www.facebook.com");
			
//			Step 3: capture title
			String title = driver.getTitle();
			System.out.println(title);
			
//			Step 4: Perform Reverse String of captured String
			int a = title.length()-1;	
			for(int i=a; i>=0;i--)
			{
				System.out.print(title.charAt(i));
			}
			
//		Ass 2:;
//			Step 1: up casting
//			Step 2: open a fb application
//			Step 3: capture URL
			String p= driver.getCurrentUrl();
			System.out.println(p);
//			Step 4: Perform Reverse String of captured String
			int b = p.length()-1;
			for (int j=b; j>=0;j--)
			{
				System.out.print(p.charAt(j));
			}

//		Ass 3:
//			Step 1: up casting
//			Step 2: open a fb application
//			Step 3: find the forgot link 
			WebElement WB =driver.findElement(By.linkText("Forgotten password?"));
			
//			Step 4: Perform Reverse String of captured String
			String  str =WB.getText();

			int c= str.length()-1;
			for(int k=c;k>=0;k--)
			{
				System.out.print(str.charAt(k));
			}
		
		String first="facebook";
		String second = "instagram12";
		String thrid = "whatsup12";
		String forth="facetime";
		
		System.out.println(first.equals(forth));
		int d=second.length();
		System.out.println(d);
		
		String l = forth.toUpperCase();
		String l1 = thrid.toLowerCase();
		System.out.print(l+ "......."+ l1);
		
		boolean start = thrid.startsWith("inst");
		System.out.println(start);
		boolean cont= forth.contains("ti");
		boolean end = thrid.endsWith("12");
		String conct = first.concat(forth);
		System.out.print(cont);
		System.out.println(first+forth);
		
		System.out.print(second.equals(thrid));
		System.out.print(second.equalsIgnoreCase(first));
		System.out.print(first==forth);
		System.out.print(first.compareTo(second));
		
		
		

	}

}
