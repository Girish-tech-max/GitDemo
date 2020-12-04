package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Curativepestmanagement {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By cropmastermanagement = By.cssSelector("[href='#emails']");

	private By curativepestmanagement = By.xpath("//a[@href='/admin/crops/curative/pest']");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By curativepest = By.xpath("//button[@id='upmargin']");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Curativepestmanagement(WebDriver driver) {

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

	public WebElement getcurativepestmanagement() {
		return driver.findElement(curativepestmanagement);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getcurativepest() {
		return driver.findElement(curativepest);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
