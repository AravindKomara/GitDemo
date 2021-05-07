package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import pageobjects.PaymentPage;
import utilities.BaseClass;
import utilities.ExcelAPI;

public class PaymentStepDefinition extends BaseClass {
	//public WebDriver driver;
	PaymentPage pp;

	@Given("User is on payment page")
	public void user_is_on_payment_page() {
		System.out.println("User on the payment page");
	}
	@When("User clicked on billing address dropdown")
	public void user_clicked_on_billing_address_dropdown() throws InterruptedException {
		pp = new PaymentPage(driver);
		Select billingAddress = new Select(pp.clickAddressDropdown());
	//	drpAddress.selectByValue("1943502");
		//WebElement address = drpAddress.getFirstSelectedOption();
	  //  String billingaddress = address.getText();
	   // if(billingaddress.equalsIgnoreCase("demo test, Lakshmipuram, Guntur1 522426, India")) {
	    ////	pp.addBillingAddress().click();
	    	System.out.println("User selected billing address");
	    //}else {
	    	billingAddress.selectByVisibleText("New Address");
	    	driver.findElement(By.id("BillingNewAddress_FirstName")).clear();
	    	driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Aravind");
	    	driver.findElement(By.id("BillingNewAddress_LastName")).clear();
	    	driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Komara");
	    	driver.findElement(By.id("BillingNewAddress_Email")).clear();
	    	driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("itsaravind.developer@gmail.com");
	    	driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Plaintext");
			Thread.sleep(2000);
			Select billingCountry = new Select(pp.clickCountryDropdown());
			billingCountry.selectByVisibleText("India");
			Thread.sleep(2000);
			driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Macherla");
			driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Oldtown");
			driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("18thWard");
			driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("522426");
			driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("7416674136");
			driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("1234");
			Thread.sleep(3000);
			pp.addNewAddress().click();
			
	   // }
		
		
	}
	
	@When("User slected billing and shipping address are same")
	public void user_slected_billing_and_shipping_address_are_same() throws InterruptedException {
		Thread.sleep(3000);
		Select drpAddress = new Select(pp.clickShippingAddressDropdown());
		drpAddress.selectByVisibleText("Ajay Komara, Oldtown, Macherla 522426, India");
		pp.addShippingAddress().click();
		Thread.sleep(2000);
		System.out.println("User selected shipping address same as billing address");
	}
	@Then("User selected shipping method as Next Day Air")
	public void user_selected_shipping_method_as_next_day_air() throws InterruptedException {
	   pp.selectShippingMethod().click();
	   Thread.sleep(2000);
	   System.out.println("User selected shipping method as Next Day Air");
	}
	@Then("User clicked on continue")
	public void user_clicked_on_continue() throws InterruptedException {
	    pp.addShippingMethod().click();
	    Thread.sleep(2000);
	}
	@When("User selcted payment method as COD \\(Cash on delivery)")
	public void user_selcted_payment_method_as_cod_cash_on_delivery() throws InterruptedException {
		System.out.println("User selcted payment method as COD");
		pp.addPaymentMethod().click();
		Thread.sleep(2000);
		System.out.println("User payment method as COD(Cash on Delivery)");
	    
	}
	@Then("User validated message as {string}")
	public void user_validated_message_as(String expectedMessage) throws InterruptedException {
	   String actualMessage = pp.getPaymentMessage().getText();
	   System.out.println(actualMessage);
	   assertEquals(actualMessage, expectedMessage);
	   pp.continueToPayment().click();
	   Thread.sleep(5000);
	   System.out.println("User will pay cash by COD mode");
			   
	}
	@When("User clicked on confirm order")
	public void user_clicked_on_confirm_order() throws InterruptedException {
	   WebElement element = pp.placeOrder();
	   elementScrollintoView(driver,element);
	   System.out.println("User placed the order");
	   Thread.sleep(5000);
	}
	@Then("print the order number")
	public void print_the_order_number() throws InterruptedException {
	   String href = pp.getOrderNumber().getAttribute("href");
	   System.out.println(href);
	   String[] parts = href.split("/");
	   String orderNumber = parts[4];
	   System.out.println("Generated order number is :"+orderNumber);
	   Thread.sleep(2000);
	}
	@Then("click on continue")
	public void click_on_continue() throws InterruptedException {
	    pp.backToHomePage().click();
	    System.out.println("User back to shopping page");
	    Thread.sleep(5000);
	    
	}
	@Then("logout from appilication")
	public void logout_from_appilication() {
		System.out.println("User logouted from the appilication");
	    pp.Logout().click();
	}
	
	public static void elementScrollintoView(WebDriver driver, WebElement element) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 Thread.sleep(3000);
		 element.click();
	}
}

