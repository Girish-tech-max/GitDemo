package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Curativepestmanagement;
import pageObjects.SignIn;
import resources.base;

public class Curativepestmanagementpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void curativepestmanagement() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Curativepestmanagement cpest = new Curativepestmanagement(driver);
		Thread.sleep(5000);
		cpest.getcropmastermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on crop master management");
		cpest.getcurativepestmanagement().click();
		Thread.sleep(5000);
		log.info("clicked on curative pest management");
		cpest.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		cpest.getcurativepest().click();
		Thread.sleep(5000);
		log.info("clicked on Get Curative Pest button");
		cpest.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
