package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendNotifications {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By broadcasting = By.xpath("//span[contains(text(),'Broadcasting')]");

	private By sendnotifications = By.xpath("//span[contains(text(),'Send Notifications')]");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By sendnotificationbutton = By.xpath("//button[contains(text(),'Send Notification ')]");

	private By notificationlogsbutton = By.cssSelector("[href='/admin/web/notifyer/25/0/logs']");

	private By withoutsearch = By.name("searchdates");

	private By sendnotificationlink = By.cssSelector("[href='/admin/web/notifyer/user/null/customnotifyer']");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public SendNotifications(WebDriver driver) {

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

	public WebElement getsendnotifications() {
		return driver.findElement(sendnotifications);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getsendnotificationbutton() {
		return driver.findElement(sendnotificationbutton);
	}

	public WebElement getnotificationlogsbutton() {
		return driver.findElement(notificationlogsbutton);
	}

	public WebElement getwithoutsearch() {
		return driver.findElement(withoutsearch);
	}
	
	public WebElement getsendnotificationlink() {
		return driver.findElement(sendnotificationlink);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
