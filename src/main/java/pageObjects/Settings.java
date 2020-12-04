package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Settings {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By scircle = By.cssSelector("[class='profile-circle1']");

	private By settings  = By.cssSelector("[href='/admin/farmers/settings']");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");
	
	private By choosefile = By.xpath("//div[@class='btn btn-primary']");
	
	private By crop = By.xpath("//button[@id='crop']");
	
	private By okpopup = By.xpath("//button[contains(text(),'OK')]");
	
	private By general = By.cssSelector("[href='#pills-profile']");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Settings(WebDriver driver) {

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

	public WebElement getscircle() {
		return driver.findElement(scircle);
	}

	public WebElement getsettings() {
		return driver.findElement(settings);
	}
	
	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getchoosefile() {
		return driver.findElement(choosefile);
	}
	
	public WebElement getcrop() {
		return driver.findElement(crop);
	}
	
	public WebElement getokpopup() {
		return driver.findElement(okpopup);
	}
	
	public WebElement getgeneral() {
		return driver.findElement(general);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
