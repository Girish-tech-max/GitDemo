package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Usermanagement {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By usermanagement = By.cssSelector("li#users.nav-item");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By adduser = By.cssSelector("[href='/admin/usermanagement/backofficeusers/adduser']");

	private By save = By.xpath("//button[contains(text(),'Save')]");

	private By cancel = By.xpath("//*[contains(text(),'Cancel')]");

	private By withoutsearch = By.name("searchdates");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Usermanagement(WebDriver driver) {

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

	public WebElement getusermanagement() {
		return driver.findElement(usermanagement);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getadduser() {
		return driver.findElement(adduser);
	}

	public WebElement getsave() {
		return driver.findElement(save);
	}

	public WebElement getcancel() {
		return driver.findElement(cancel);
	}

	public WebElement getwithoutsearch() {
		return driver.findElement(withoutsearch);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
