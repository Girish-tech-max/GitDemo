package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Curativenutrientdeficiencymanagement;
import pageObjects.SignIn;
import resources.base;

public class Curativenutrientdeficiencymanagementpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void curativenutrientdeficiencymanagement() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Curativenutrientdeficiencymanagement nutrient = new Curativenutrientdeficiencymanagement(driver);
		Thread.sleep(5000);
		nutrient.getcropmastermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on crop master management");
		nutrient.getcurativenutrientdeficiencymanagement().click();
		Thread.sleep(5000);
		log.info("clicked on curative nutrient deficiency management");
		nutrient.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		nutrient.getcurativenutrientdeficiency().click();
		Thread.sleep(5000);
		log.info("clicked on Get Nutrient Deficiency button");
		nutrient.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
