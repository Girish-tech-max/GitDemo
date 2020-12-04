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
import pageObjects.Farmuserotplogs;
import pageObjects.SignIn;
import resources.base;

public class Farmuserotplogspage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@SuppressWarnings("unused")
	@Test

	public void farmuserotplogs() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Farmuserotplogs otp = new Farmuserotplogs(driver);
		Thread.sleep(5000);
		otp.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		otp.getfarmuserotplogs().click();
		Thread.sleep(5000);
		log.info("clicked on Farm User OTP Logs");
		otp.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		otp.getwithoutsearch().click();
		Thread.sleep(5000);
		log.info("clicked on without Search button");
		otp.getdownload().click();
		Thread.sleep(5000);
		log.info("clicked on Download button");
		driver.findElement(By.cssSelector("input#start.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("November 2020")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}

		List<WebElement> ofromdate = driver.findElements(By.className("day"));
		int otps = driver.findElements(By.className("day")).size();

		for (int i = 0; i < otps; i++) {
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

		List<WebElement> otodate = driver.findElements(By.className("day"));
		int logs = driver.findElements(By.className("day")).size();

		for (int i = 0; i < logs; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.name("searchdates")).click();
		Thread.sleep(5000);
		otp.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
