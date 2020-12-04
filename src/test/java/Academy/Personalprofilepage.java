package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Personalprofile;
import pageObjects.SignIn;
import resources.base;

public class Personalprofilepage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void personalprofile() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Personalprofile profile = new Personalprofile(driver);
		Thread.sleep(5000);
		profile.getpcircle().click();
		Thread.sleep(5000);
		log.info("clicked on Circle");
		profile.getprofile().click();
		Thread.sleep(5000);
		log.info("clicked on Profile");
		profile.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		profile.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
