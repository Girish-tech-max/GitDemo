package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By lcircle = By.cssSelector("[class='profile-circle1']");

	private By logout = By.xpath("//a[span='Log Out']");

	private By logoutno = By.xpath("//button[contains(text(),'No')]");

	private By logoutyes = By.cssSelector("[href='/admin/sys/auth/logout']");

	public Logout(WebDriver driver) {

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

	public WebElement getlcircle() {
		return driver.findElement(lcircle);
	}

	public WebElement getlogout() {
		return driver.findElement(logout);
	}

	public WebElement getlogoutno() {
		return driver.findElement(logoutno);
	}

	public WebElement getlogoutyes() {
		return driver.findElement(logoutyes);
	}

}
