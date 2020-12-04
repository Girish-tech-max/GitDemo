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
import pageObjects.Addingcropdata;
import pageObjects.SignIn;
import resources.base;

public class Addingcropdatapage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void addingcropdata() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Addingcropdata data = new Addingcropdata(driver);
		Thread.sleep(5000);
		data.getcropmastermanagement().click();
		Thread.sleep(5000);
		log.info("clicked on crop master management");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement addingcropdata = driver.findElement(By.xpath("//span[contains(text(),'Adding CropData')]"));
		js.executeScript("arguments[0].scrollIntoView();", addingcropdata);
		data.getaddingcropdata().click();
		Thread.sleep(5000);
		log.info("clicked on Adding CropData");
		data.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		data.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on homelink");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
