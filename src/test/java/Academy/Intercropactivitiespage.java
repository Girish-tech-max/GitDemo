package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Intercropactivities;
import pageObjects.SignIn;
import resources.base;

public class Intercropactivitiespage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void intercropactivities() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Intercropactivities i = new Intercropactivities(driver);
		Thread.sleep(5000);
		i.getcropmastermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on crop master management");
		i.getintercropactivities().click();
		Thread.sleep(5000);
		log.info("clicked on Intercrop Activities");
		i.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		i.getactivitiesbutton().click();
		Thread.sleep(5000);
		log.info("clicked on Get Activities button");
		i.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
