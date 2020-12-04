package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Marketprices {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By broadcasting = By.xpath("//span[contains(text(),'Broadcasting')]");

	private By marketprices = By.xpath("//span[contains(text(),'Market Prices')]");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");
	
	private By download = By.xpath("//button[contains(text(),'Download')]");
	
    private By uploadmarketrates = By.cssSelector("[href='/admin/web/markets']");
    
    private By marketpriceslink = By.xpath("//*[@id='page-top']/div[4]/div/div/div/div[2]/ol/li[3]/a");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Marketprices(WebDriver driver) {

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

	public WebElement getmarketprices() {
		return driver.findElement(marketprices);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getdownload() {
		return driver.findElement(download);
	}

	public WebElement getuploadmarketrates() {
		return driver.findElement(uploadmarketrates);
	}
	
	public WebElement getmarketpriceslink() {
		return driver.findElement(marketpriceslink);
	}
	
	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
