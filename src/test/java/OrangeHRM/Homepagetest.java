package OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import Tutorial6.BaseLayer;



	//@Test(groups = { "HomePage", "EndToEndTesting" }, dependsOnGroups = { "LoginPage" })
	public class Homepagetest extends Baseclass {

		@Test(priority = 1,groups={"EndToEndTesting", "LoginPage","pimpagetest"})
		public void validateHomePageTitle() {
			String actualTitle = driver.getTitle();

			Assert.assertEquals(actualTitle, "OrangeHRM");
		}

		@Test(priority = 2, groups = { "HomePage", "EndToEndTesting" })
		public void validateHomePageUrl() {
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl.contains("hrm"), true);

}
}