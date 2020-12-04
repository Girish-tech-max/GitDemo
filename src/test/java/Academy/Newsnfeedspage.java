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
import pageObjects.Newsnfeeds;
import pageObjects.SignIn;
import resources.base;

public class Newsnfeedspage extends base {
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
		Newsnfeeds news = new Newsnfeeds(driver);
		Thread.sleep(5000);
		news.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		news.getnewsfeeds().click();
		Thread.sleep(5000);
		log.info("clicked on News & Feeds");
		news.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		news.getwithoutsearch().click();
		Thread.sleep(5000);
		log.info("clicked on search button");
		news.getdownload().click();
		Thread.sleep(5000);
		log.info("clicked on download button");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#start.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText()
				.contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']"))
					.click();
		}

		@SuppressWarnings("unused")
		List<WebElement> nffromdate = driver.findElements(By.className("day"));
		int new1 = driver.findElements(By.className("day")).size();

		for (int i = 0; i < new1; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("1")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#end.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText()
				.contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']"))
					.click();
		}

		@SuppressWarnings("unused")
		List<WebElement> nftodate = driver.findElements(By.className("day"));
		int feed = driver.findElements(By.className("day")).size();

		for (int i = 0; i < feed; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		news.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
