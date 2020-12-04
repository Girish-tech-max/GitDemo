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
import pageObjects.SignIn;
import pageObjects.Usermanagement;
import resources.base;

public class Usermanagementpage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@SuppressWarnings("unused")
	@Test

	public void usermanagement() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		Thread.sleep(5000);
		lp.getsignin().click();
		Usermanagement u = new Usermanagement(driver);
		u.getusermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on usermanagementpage");
		u.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		u.getadduser().click();
		Thread.sleep(5000);
		log.info("clicked on adduser button");
		u.getsave().click();
		Thread.sleep(5000);
		log.info("clicked on save button");
		u.getcancel().click();
		Thread.sleep(5000);
		log.info("clicked on cancel button");
		Thread.sleep(5000);
		u.getwithoutsearch().click();
		Thread.sleep(5000);
		log.info("clicked on search button");
		driver.findElement(By.cssSelector("input#start.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}

		List<WebElement> ufromdate = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
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

		List<WebElement> utodate = driver.findElements(By.className("day"));
		int count1 = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count1; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.name("searchdates")).click();
		Thread.sleep(5000);
		u.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
