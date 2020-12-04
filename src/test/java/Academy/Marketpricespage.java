package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Marketprices;
import pageObjects.SignIn;
import resources.base;

public class Marketpricespage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void marketprices() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Marketprices market = new Marketprices(driver);
		Thread.sleep(5000);
		market.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		market.getmarketprices().click();
		Thread.sleep(5000);
		log.info("clicked on Market Prices");
		market.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		market.getdownload().click();
		Thread.sleep(5000);
		log.info("clicked on Download button");
		market.getuploadmarketrates().click();
		Thread.sleep(5000);
		log.info("clicked on Uploadmarketrates button");
		market.getmarketpriceslink().click();
		Thread.sleep(5000);
		log.info("clicked on market prices link button");
		market.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
