package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newsnfeeds {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By broadcasting = By.xpath("//span[contains(text(),'Broadcasting')]");

	private By newsfeeds = By.cssSelector("[href='/admin/farmers/news']");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");
	
	private By withoutsearch = By.name("searchdates");
	
	private By download = By.xpath("//button[@id='nd']");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Newsnfeeds(WebDriver driver) {

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

	public WebElement getnewsfeeds() {
		return driver.findElement(newsfeeds);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}
	
	public WebElement getwithoutsearch() {
		return driver.findElement(withoutsearch);
	}
	
	public WebElement getdownload() {
		return driver.findElement(download);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
