package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Addcropfeature;
import pageObjects.SignIn;
import resources.base;

public class Addcropfeaturepage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void addcropfeature() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Addcropfeature add = new Addcropfeature(driver);
		Thread.sleep(5000);
		add.getcropmastermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on crop master management");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement addcrop = driver.findElement(By.xpath("//span[contains(text(),'Add Crop Feature')]"));
		js.executeScript("arguments[0].scrollIntoView();", addcrop);
		Thread.sleep(5000);
		log.info("clicked on Add Crop Feature");
		add.getaddcropfeature().click();
		Thread.sleep(5000);
		add.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		add.getcropcriteriaupload().click();
		Thread.sleep(5000);
		log.info("clicked on Crop Criteria upload button");
		add.getcropparameterupload().click();
		Thread.sleep(5000);
		log.info("clicked on Crop Parameter upload button");
		add.getschedulecriteriaupload().click();
		Thread.sleep(5000);
		log.info("clicked on Schedule Criteria upload button");
		add.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
