package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FarmUsers {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By farmusers = By.cssSelector("a#Farmer-List.nav-link");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By withoutsearch = By.name("searchdates");

	private By farmuserdownload = By.cssSelector("[href='/admin/farmers/farmerexcel']");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public FarmUsers(WebDriver driver) {

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

	public WebElement getfarmusers() {
		return driver.findElement(farmusers);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);

	}

	public WebElement getwithoutsearch() {
		return driver.findElement(withoutsearch);
	}

	public WebElement getfarmuserdownload() {
		return driver.findElement(farmuserdownload);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
