package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pestmanagement {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By cropmastermanagement = By.cssSelector("[href='#emails']");

	private By pestmanagement = By.cssSelector("[href='/admin/crops/criteria/pest']");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By getpest = By.cssSelector("button#upmargin.btn.btn-success");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Pestmanagement(WebDriver driver) {

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

	public WebElement getcropmastermanagement() {
		return driver.findElement(cropmastermanagement);
	}

	public WebElement getpestmanagement() {
		return driver.findElement(pestmanagement);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getpest() {
		return driver.findElement(getpest);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
