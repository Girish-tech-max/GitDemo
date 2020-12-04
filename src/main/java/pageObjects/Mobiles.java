package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobiles {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By broadcasting = By.xpath("//span[contains(text(),'Broadcasting')]");

	private By mobiles = By.xpath("//span[contains(text(),'Mobile')]");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By aboutusedit  = By.xpath("//*[@id='v-pills-home']/div/div/form/div[1]/div/div/i");
	
	private By acancel  = By.id("about-cancel");
	
	private By contactus  = By.cssSelector("[id='v-pills-profile-tab']");
	
	private By contactusedit  = By.xpath("//*[@id='v-pills-profile']/div/div/div/i");
	
	private By ccancel  = By.id("cancelbtn");
	
	private By pincodelist  = By.xpath("[id='v-pills-messages-tab']");

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Mobiles(WebDriver driver) {

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

	public WebElement getmobiles() {
		return driver.findElement(mobiles);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getaboutusedit() {
		return driver.findElement(aboutusedit);
	}
	public WebElement getacancel() {
		return driver.findElement(acancel);
	}
	public WebElement getcontactus() {
		return driver.findElement(contactus);
	}
	public WebElement getcontactusedit() {
		return driver.findElement(contactusedit);
	}
	public WebElement getccancel() {
		return driver.findElement(ccancel);
	}
	public WebElement getpincodelist() {
		return driver.findElement(pincodelist);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
