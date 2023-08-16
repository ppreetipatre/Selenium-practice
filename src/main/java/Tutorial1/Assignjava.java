package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignjava {
	 
			// static method without return type and 0 args
	public static void browfb() 
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String chrometitle = driver.getTitle();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String edgeftitle = driver.getTitle();
		if (chrometitle.equals(edgeftitle))
		{
			System.out.println("Test case pass");
		}
	}
		// static method without return type and 1 String arguments
		
		public static void  panidrn (String pan)
		{
			
			//String pan1 =pan;
			String revstr = "";
			for(int i=pan.length()-1;i>=0;i--)
			{
				revstr=revstr+pan.charAt(i);
			}
			if(pan.equals(revstr))
			{
				System.out.println("String is palindrome");
			}
			else
			{
			System.out.println("String is not palindrome");
		}
		}
		
		
		//static method with return type and int array args
		
		public static int arrpract(int a[],int b[],int c[])
		{
			int min=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<min)
				{
				min=a[i];
				}
			}
			System.out.println("min no is"+min);
			//return min;
			
		int max=b[0];
		{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max )
			{
				max=b[i];
			}
			
			}
		System.out.println("max number is " +max);
		}
		
		//int c=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println("duplicate number is"+c[i]);
				}
				
			}
			
		}
		return min;
	//return max; 
		}
		//static method with return type and  String argument
		public static void revstring(String s)
		{
			String st="";
			for(int i=s.length()-1;i>=0;i--)
			{
				st=st+s.charAt(i);
			}
			
			System.out.println("reverse string is"+st);
			
		}
		
		//non static method without return type and 0 args
		public  void brow2()
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			String firefb = driver.getTitle();
			WebDriver driver1 =new ChromeDriver();
			driver1.get("https://www.facebook.com/");	
			String operafb = driver1.getTitle();
			System.out.println(operafb);
			if(firefb.equals(operafb))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("Test case fail");
			}
			
		}
		
		// non static method with String return type and String array
		public String palindrom(String p) 
		{
			String sr = "";
			String pune="pune";
			String mumbai = "mumbai";
			for(int i=p.length()-1;i>=0;i--)
			{
				sr=sr+p.charAt(i);
			}
			if(p.equals(sr))
			{
				System.out.println("pune");
				return pune;
			}
			return mumbai;
			
		}
		
		//non static method with return type and  String argument
		//find number in string
		
		public static void number(String p1)
		{
			String let ="";
			
			char [] a1= p1.toCharArray();
			int c =a1.length;
			//System.out.println(a1.length);
			for(int i=0;i<c;i++)
			{
				if(Character.isLetter(a1[i]))
						{
					let=let + a1[i];
						}
				
			}
			
				System.out.println(let);	
				String fin ="";
				for(int i=let.length()-1;i>=0;i--)
				{
					fin=fin+let.charAt(i);
				}
				
					System.out.println(fin);
				}
			
		
		public static void main(String[] args) {
			Assignjava.browfb();
			Assignjava.panidrn("Testing");
			int a[]= {10,20,20,30,40,50};
			int b[]= {20,20,30,40,50};
			int c[]= {20,20,30,50,40};
			Assignjava.arrpract(a,b,c);
			Assignjava.revstring("madam");
			Assignjava obj = new Assignjava();
			obj.brow2();
			Assignjava.panidrn("selenium");
			String p1 = "10sele10nium";
			Assignjava.number(p1);
		}

}
