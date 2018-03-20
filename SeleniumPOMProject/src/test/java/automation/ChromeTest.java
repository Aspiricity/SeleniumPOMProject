package automation;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ChromeTest {
	
	protected WebDriver driver;
	private static final Logger logger = LogManager.getLogger(ChromeTest.class);
	
	@BeforeTest
	public void beforeTest() {
		// Requires local System Environment variable to Chromedriver.exe
		driver = new ChromeDriver();
		logger.info("New Chrome browser session initiated.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Implicit Wait set to 10 seconds.");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
		logger.info("Chrome browser session ended.");
	}

}
