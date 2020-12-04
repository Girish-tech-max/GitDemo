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
import pageObjects.Schedulenotification;
import pageObjects.SignIn;
import resources.base;

public class Schedulenotificationpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void schedulenotification() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Schedulenotification schedule = new Schedulenotification(driver);
		Thread.sleep(5000);
		schedule.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolldown = driver.findElement(By.xpath("//span[contains(text(),'Schedule Notification')]"));
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		Thread.sleep(5000);
		schedule.getschedulenotification().click();
		Thread.sleep(5000);
		log.info("clicked on Schedule Notification");
		schedule.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		schedule.getsavebutton().click();
		Thread.sleep(5000);
		log.info("clicked on Save button");
		schedule.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
