package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Settings;
import pageObjects.SignIn;
import resources.base;

public class Settingspage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void settings() throws InterruptedException, IOException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Settings set = new Settings(driver);
		Thread.sleep(5000);
		set.getscircle().click();
		Thread.sleep(5000);
		log.info("clicked on Circle");
		set.getsettings().click();
		Thread.sleep(5000);
		log.info("clicked on Settings");
		set.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		set.getchoosefile().click();
		Thread.sleep(8000);
		log.info("clicked on Choose File button");
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\fileupload1.exe");
		set.getcrop().click();
		Thread.sleep(5000);
		log.info("clicked on Crop button");
		set.getokpopup().click();
		Thread.sleep(5000);
		log.info("clicked on ok button");
		set.getgeneral().click();
		Thread.sleep(5000);
		log.info("clicked on General Tab");
		set.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
