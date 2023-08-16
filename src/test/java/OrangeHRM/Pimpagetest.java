package OrangeHRM;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import Utilitylayer.Excelreader;

		public class Pimpagetest extends Baseclass
		{
			@Test(priority=1,groups={"EndToEndTesting", "LoginPage"})
			
			public void validateuserpimpage() throws InterruptedException
			{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='PIM']")).click();
				String actualurl= driver.getCurrentUrl();
				Assert.assertEquals(actualurl.contains("pim"),true);
				//assert.assertEquals(actualurl.contains("pim"), true);
			}
			@Parameters({"fname","middlen","lname"})
			@Test(priority=2,groups={"EndToEndTesting", "LoginPage"})
			public void validatenewuser(String fname,String mname, String lname) throws InterruptedException
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[text()=' Add ']")).click();
				driver.findElement(By.name("firstName")).sendKeys(fname);
				driver.findElement(By.name("middleName")).sendKeys(mname);
				driver.findElement(By.name("lastName")).sendKeys(lname);

				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			}
			@DataProvider
			public Object [][] addEmployeedata() throws IOException, URISyntaxException
			{
				Excelreader obj = new Excelreader(System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\Testdata.xlsx");
				return obj.getallsheetdata(0);
			}
			
		@Parameters({"country"})
		@Test(priority=3)
		public void addmoredetails(String country) throws InterruptedException
		{
			
			driver.findElement(By.xpath("//label[text()='Nationality']/following::div[5]")).click();
			Thread.sleep(10000);
			List<WebElement> ls = driver.findElements(By.xpath("//div[@role='listbox']//div/span"));

			for (WebElement abc : ls) {
				String countrylist = abc.getText();

				if (countrylist.equals(country)) 
				{
					abc.click();
					break;
					}
			}
		}
			}
