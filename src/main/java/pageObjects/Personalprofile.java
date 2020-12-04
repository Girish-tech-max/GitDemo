package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Personalprofile {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By pcircle = By.cssSelector("[class='profile-circle1']");

	private By profile = By.cssSelector("[href='/admin/usermanagement/backofficeusers/UU13543051']");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Personalprofile(WebDriver driver) {

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

	public WebElement getpcircle() {
		return driver.findElement(pcircle);
	}

	public WebElement getprofile() {
		return driver.findElement(profile);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
