package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addcropfeature {

	public WebDriver driver;
	private By tenantname = By.id("tenantName");

	private By mobilenumber = By.id("mobileNumber");

	private By pin = By.name("pin");

	private By signin = By.xpath("//*[@id='loginform']/div[5]/div/a/button");

	private By cropmastermanagement = By.cssSelector("[href='#emails']");

	private By addcropfeature= By.xpath("//span[contains(text(),'Add Crop Feature')]");

	private By hamburgericon = By.cssSelector("a.sidebar-toggler.not-active");

	private By cropcriteriaupload  = By.xpath("//button[contains(text(),'Crop criteria upload')]");
	
	private By cropparameterupload  = By.xpath("//button[contains(text(),'Crop parameter upload')]");
	
	private By schedulecriteriaupload  = By.xpath("//button[contains(text(),'Schedule criteria upload')]");	

	private By homelink = By.xpath("//a[contains(text(),'Home')]");

	public Addcropfeature(WebDriver driver) {

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

	public WebElement getaddcropfeature() {
		return driver.findElement(addcropfeature);
	}

	public WebElement gethamburgericon() {
		return driver.findElement(hamburgericon);
	}

	public WebElement getcropcriteriaupload() {
		return driver.findElement(cropcriteriaupload);
	}
	
	public WebElement getcropparameterupload() {
		return driver.findElement(cropparameterupload);
	}
	
	public WebElement getschedulecriteriaupload() {
		return driver.findElement(schedulecriteriaupload);
	}

	public WebElement gethomelink() {
		return driver.findElement(homelink);
	}
}
