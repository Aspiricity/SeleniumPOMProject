package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage extends PageObject {
	
	private static final Logger logger = LogManager.getLogger(AdminLoginPage.class);
	
	private String title = driver.getTitle();

	public AdminLoginPage(WebDriver driver) {
		super(driver);
		logger.info("New AdminLoginPage Object created.");
	}

	public String getTitle() {
		logger.info("Returning Admin Login page title");
		return title;
	}
	
}
