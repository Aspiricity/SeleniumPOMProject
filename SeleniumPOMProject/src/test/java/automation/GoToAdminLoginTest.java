package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AdminLoginPage;
import pageobjects.HomePage;

public class GoToAdminLoginTest extends ChromeTest{
	
	private final static String ADMINLOGINPAGE_TITLE = "AspiricitySUT - Log in";
		
	@Test
	public void GoToAdminLogin() {
		HomePage homePage = new HomePage(driver);
		homePage.loadHomePage();
		AdminLoginPage adminLoginPage = homePage.clickAdminLink();
		Assert.assertEquals(adminLoginPage.getTitle(), ADMINLOGINPAGE_TITLE);
	}
}
