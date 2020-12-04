package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Logout;
import pageObjects.SignIn;
import resources.base;

public class Logoutpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void logout() throws InterruptedException, IOException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Logout out = new Logout(driver);
		Thread.sleep(5000);
		out.getlcircle().click();
		Thread.sleep(5000);
		log.info("clicked on Circle");
		out.getlogout().click();
		Thread.sleep(5000);
		log.info("clicked on logout");
		out.getlogoutno().click();
		Thread.sleep(5000);
		log.info("clicked on No button");
		out.getlcircle().click();
		Thread.sleep(8000);
		log.info("clicked on Circle");
		out.getlogout().click();
		log.info("clicked on logout");
		out.getlogoutyes().click();
		log.info("clicked on yes button");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
