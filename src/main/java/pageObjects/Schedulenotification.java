package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Schedulenotification {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By broadcasting = By.xpath("//span[contains(text(),'Broadcasting')]");

	private By schedulenotification = By.xpath("//span[contains(text(),'Schedule Notification')]");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By savebutton  = By.name("upmargin");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Schedulenotification(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement gettenantname() {
		return driver.findElement(tenantname);
	}

	public WebElement getmobilenumber() {
		return driver.findElement(mobilenumber);
	}

	public WebElement getpin() {
		return driver.findElement(pin);
	}

	public WebElement getsignin() {
		return driver.findElement(signin);
	}

	public WebElement getbroadcasting() {
		return driver.findElement(broadcasting);
	}

	public WebElement getschedulenotification() {
		return driver.findElement(schedulenotification);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getsavebutton() {
		return driver.findElement(savebutton);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
