package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SignIn;
import resources.base;

public class Withoutsigninpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Sign In page");

	}

	@Test

	public void withoutsignin() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.getsignin().click();
		log.info("Clicked on Sign In button");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
