package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cropcriteria {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By cropmastermanagement = By.cssSelector("[href='#emails']");

	private By cropcriteria = By.cssSelector("[href='/admin/crops/criteria']");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By getcriteria = By.cssSelector("button#upmargin.btn.btn-success");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Cropcriteria(WebDriver driver) {

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

	public WebElement getcropcriteria() {
		return driver.findElement(cropcriteria);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getcriteria() {
		return driver.findElement(getcriteria);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
