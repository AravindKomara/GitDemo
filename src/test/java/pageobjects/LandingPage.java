package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By loginpagelink = By.linkText("Log in");
	By loginpagemsg = By.xpath("//div[@class='page-title']");
	By email = By.id("Email");
	By password = By.id("Password");
	By loginbutton = By.xpath("//input[@type='submit' and @value='Log in']");
	By accountid = By.xpath("//a[@class='account']");

	public WebElement clickLoginLink() {
		return driver.findElement(loginpagelink);
	}
	public WebElement getLoginMessage() {
		return driver.findElement(loginpagemsg);
	}
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement clickLoginButton() {
		return driver.findElement(loginbutton);
	}
	public WebElement getUserAccountID() {
		return driver.findElement(accountid);
	}

	
}
