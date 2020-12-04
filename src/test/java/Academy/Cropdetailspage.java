package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Cropdetails;
import pageObjects.SignIn;
import resources.base;

public class Cropdetailspage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void cropdetails() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Cropdetails cd = new Cropdetails(driver);
		Thread.sleep(5000);
		cd.getcropmastermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on crop master management");
		cd.getcropdetails().click();
		Thread.sleep(5000);
		log.info("clicked on Crop Details");
		cd.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		cd.getcrop().click();
		Thread.sleep(5000);
		log.info("clicked on Get Crop Details button");
		cd.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
