package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

	public WebDriver driver;
	
	public PaymentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By billingaddress = By.id("billing-address-select");
	By selectcountry = By.id("BillingNewAddress_CountryId");
	By billingaddresscontinue = By.xpath("//div[@id='billing-buttons-container']//input[@type='button' and @value='Continue']");
	By shippingaddress = By.id("shipping-address-select");
	By shippingaddresscontinue = By.xpath("//div[@id='shipping-buttons-container']//input[@type='button' and @value='Continue']");
	By shippingmethod = By.id("shippingoption_1");
	By shippingmethodcontinue = By.xpath("//div[@id='shipping-method-buttons-container']//input[@type='button' and @value='Continue']");
	By paymentmethodcontinue = By.xpath("//div[@id='payment-method-buttons-container']//input[@type='button' and @value='Continue']");
	By paymentmodemessage = By.xpath("//div[@class='section payment-info']//div//table//tbody//tr//td//p[1]");
	By paymnetinfocontinue = By.xpath("//div[@id='payment-info-buttons-container']//input[@type='button' and @value='Continue']");
	By confirmorder = By.xpath("//div[@id='confirm-order-buttons-container']//input[@type='button' and @value='Confirm']");
	By getordernumber = By.xpath("//ul[@class='details']//li[2]//a");
	By backtohome = By.xpath("//div[@class='buttons']//input[@type='button' and @value='Continue']");
	By logout = By.linkText("Log out");
	
	public WebElement clickAddressDropdown() {
		return driver.findElement(billingaddress);
	}
	
	public WebElement clickCountryDropdown() {
		return driver.findElement(selectcountry);
	}
	
	public WebElement addNewAddress() {
		return driver.findElement(billingaddresscontinue);
	}
	
	public WebElement addBillingAddress() {
		return driver.findElement(billingaddresscontinue);
	}
	
	public WebElement clickShippingAddressDropdown() {
		return driver.findElement(shippingaddress);
	}
	public WebElement addShippingAddress() {
		return driver.findElement(shippingaddresscontinue);
	}
	public WebElement selectShippingMethod() {
		return driver.findElement(shippingmethod);
	}
	public WebElement addShippingMethod() {
		return driver.findElement(shippingmethodcontinue);
	}
	public WebElement addPaymentMethod() {
		return driver.findElement(paymentmethodcontinue);
	}
	
	public WebElement getPaymentMessage() {
		return driver.findElement(paymentmodemessage);
	}
	
	public WebElement continueToPayment() {
		return driver.findElement(paymnetinfocontinue);
	}
	public WebElement placeOrder() {
		return driver.findElement(confirmorder);
	}
	
	public WebElement getOrderNumber() {
		return driver.findElement(getordernumber);
	}
	
	public WebElement backToHomePage() {
		return driver.findElement(backtohome);
	}
	
	public WebElement Logout() {
		return driver.findElement(logout);
	}
	
}
