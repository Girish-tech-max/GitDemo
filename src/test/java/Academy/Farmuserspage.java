package Academy;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FarmUsers;
import pageObjects.SignIn;
import resources.base;

public class Farmuserspage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@SuppressWarnings("unused")
	@Test

	public void farmusers() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		Thread.sleep(5000);
		lp.getsignin().click();
		FarmUsers farm = new FarmUsers(driver);
		farm.getfarmusers().click();
		Thread.sleep(5000);
		log.info("clicked on farmuserspage");
		farm.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		farm.getwithoutsearch().click();
		Thread.sleep(5000);
		log.info("clicked on search button");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='/admin/farmers/farmerexcel']")));
		farm.getfarmuserdownload().click();
		Thread.sleep(5000);
		log.info("clicked on download button");
		driver.findElement(By.cssSelector("input#start.form-control")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}

		List<WebElement> ffromdate = driver.findElements(By.className("day"));
		int count2 = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count2; i++) {
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

		List<WebElement> ftodate = driver.findElements(By.className("day"));
		int count3 = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count3; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.name("searchdates")).click();
		Thread.sleep(5000);
		farm.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
