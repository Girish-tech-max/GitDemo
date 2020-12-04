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
import pageObjects.Mobiles;
import pageObjects.SignIn;
import resources.base;

public class Mobilespage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void intialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void mobiles() throws InterruptedException {

		SignIn lp = new SignIn(driver);
		lp.gettenantname().sendKeys("Pepsico");
		Thread.sleep(5000);
		lp.getmobilenumber().sendKeys("9573832805");
		Thread.sleep(5000);
		lp.getpin().sendKeys("9999");
		lp.getsignin().click();
		Mobiles phone = new Mobiles(driver);
		Thread.sleep(5000);
		phone.getbroadcasting().click();
		Thread.sleep(5000);
		log.info("clicked on Broadcasting");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Mobile')]"));
		js.executeScript("arguments[0].scrollIntoView();", mobile);
		phone.getmobiles().click();
		Thread.sleep(5000);
		log.info("clicked on Mobiles");
		phone.gethamburgericon().click();
		Thread.sleep(5000);
		log.info("clicked on hamburger icon");
		phone.getaboutusedit().click();
		Thread.sleep(5000);
		log.info("clicked on Edit button");
		phone.getacancel().click();
		Thread.sleep(5000);
		log.info("clicked on cancel button");
		phone.getcontactusedit().click();
		Thread.sleep(5000);
		log.info("clicked on contact us button");
		phone.getccancel().click();
		Thread.sleep(5000);
		log.info("clicked on cancel button");
		phone.getpincodelist().click();
		Thread.sleep(5000);
		log.info("clicked on Pin code list button");
		phone.gethomelink().click();
		Thread.sleep(5000);
		log.info("clicked on home link");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
