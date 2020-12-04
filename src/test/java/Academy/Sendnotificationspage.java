package Academy;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SendNotifications;
import pageObjects.SignIn;
import resources.base;

public class Sendnotificationspage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@SuppressWarnings("unused")
	@Test

	public void sendnotifications() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		SendNotifications send = new SendNotifications(driver);
		Thread.sleep(5000);
		send.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		send.getsendnotifications().click();
		Thread.sleep(5000);
		log.info("clicked on Send Notifications");
		send.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		send.getsendnotificationbutton().click();
		Thread.sleep(5000);
		log.info("clicked on Send Notification button");
		send.getnotificationlogsbutton().click();
		Thread.sleep(5000);
		log.info("clicked on Notification logs button");
		send.getwithoutsearch().click();
		Thread.sleep(5000);
		log.info("clicked on without search button");
		driver.findElement(By.cssSelector("input#start.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}

		List<WebElement> nfromdate = driver.findElements(By.className("day"));
		int notification = driver.findElements(By.className("day")).size();

		for (int i = 0; i < notification; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("1")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#end.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}

		List<WebElement> ntodate = driver.findElements(By.className("day"));
		int nlogs = driver.findElements(By.className("day")).size();

		for (int i = 0; i < nlogs; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.name("searchdates")).click();
		send.getsendnotificationlink().click();
		Thread.sleep(5000);
		log.info("clicked on send notification link");
		send.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
