package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends PageObject{
	
	private final static String ASPIRICITYSUT_URL = "https://damp-garden-55551.herokuapp.com/";

	private static final Logger logger = LogManager.getLogger(HomePage.class);
	
	@FindBy(linkText = "Admin")
	private WebElement adminLink;

	public HomePage(WebDriver driver) {
		super(driver);
		logger.info("New HomePage Object created.");
	}
	
	public void loadHomePage () {
		driver.get(ASPIRICITYSUT_URL);
		Reporter.log("Website at " + ASPIRICITYSUT_URL + " loaded successfully.");
		logger.info("Website loaded with URL: " + ASPIRICITYSUT_URL);
	}

	public AdminLoginPage clickAdminLink () {
		adminLink.click();
		logger.info("Home page sidebar Admin link clicked.");
		return new AdminLoginPage(driver);
	}
}
