package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By clickcart = By.id("topcartlink");
	By actualprice = By.xpath("//tr[@class='cart-item-row']//td[6]//span[2]");
	By subtottalprice = By.xpath("//table[@class='cart-total']//tbody//tr//td[@class='cart-total-right']//span[1]//span[1]");
	By agree = By.xpath("//input[@type='checkbox' and @name='termsofservice']");
	By checkout = By.xpath("//button[@id='checkout']");
	
	public WebElement clickCart() {
		return driver.findElement(clickcart);
	}
	
	public WebElement getActualPrice() {
		return driver.findElement(actualprice);
	}
	
	public WebElement getSubTotalPrice() {
		return driver.findElement(subtottalprice);
	}
	
	public WebElement agreeTermsConditions() {
		return driver.findElement(agree);
	}
	
	public WebElement clickChekoutButton() {
		return driver.findElement(checkout);
	}
	
	
}
