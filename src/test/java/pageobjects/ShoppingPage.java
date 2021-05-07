package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingPage {

	public WebDriver driver;
	
	public ShoppingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	By shoppingcartlink = By.linkText("Shopping cart");
	By checkcartempty = By.xpath("//div[@class='order-summary-content']");
	By removefromcart = By.xpath("//tr[@class='cart-item-row']");
	By selectchekbox = By.xpath("//input[@type='checkbox' and @name='removefromcart']");
	By updatecart = By.xpath("//input[@type='submit' and @value='Update shopping cart']");
	By books = By.linkText("Books");
	By selectbook = By.xpath("//div[@class='item-box'][3]");
	By addquantity = By.id("addtocart_45_EnteredQuantity");
	By addtocart = By.id("add-to-cart-button-45");
	By barnotification =  By.xpath("//div[@id='bar-notification']/p/a");
	
	
	public WebElement clearShoppingCart() {
		return driver.findElement(shoppingcartlink);
	}
	
	public WebElement checkCartEmpty() {
		return driver.findElement(checkcartempty);
	}
	
	public List<WebElement> removeProdcutFromCart() {
		return driver.findElements(removefromcart);
	}
	public WebElement removeProdcutFromCart1() {
		return driver.findElement(selectchekbox);
	}
	
	public WebElement updateShoppingCart() {
		return driver.findElement(updatecart);
	}
	
	public WebElement clickBooks() {
		return driver.findElement(books);
	}
	
	public WebElement selectBook() {
		return driver.findElement(selectbook);
	}
	
	public WebElement addQuantity() {
		return driver.findElement(addquantity);
	}
	
	public WebElement addToCart() {
		return driver.findElement(addtocart);
	}
	
	public WebElement checkCartMessage() {
		return driver.findElement(barnotification);
	}
	
	

	
}
