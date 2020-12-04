package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Dashboard;
import pageObjects.SignIn;
import resources.base;

public class Dashboardpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void dashboard() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		log.info("Tenant name is entered");
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		log.info("Mobile number is entered");
		lp.getpin().sendKeys("9999");
		Thread.sleep(5000);
		log.info("Password is entered");
		lp.getsignin().click();
		Thread.sleep(5000);
		log.info("Clicked on Sign In button");
		Dashboard d = new Dashboard(driver);
		d.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburgericon");
		d.getlogo().click();
		Thread.sleep(5000);
		log.info("clicked on logo");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
