package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Reuninstalledusers;
import pageObjects.SignIn;
import resources.base;

public class Reuninstalleduserspage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void reuninstalledusers() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Reuninstalledusers schedule = new Reuninstalledusers(driver);
		Thread.sleep(5000);
		schedule.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		schedule.getreuninstalled().click();
		Thread.sleep(5000);
		log.info("clicked on Reuninstalled users");
		schedule.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		schedule.getwithoutsearch().click();
		Thread.sleep(5000);
		log.info("clicked on withoutsearch button");
		schedule.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
