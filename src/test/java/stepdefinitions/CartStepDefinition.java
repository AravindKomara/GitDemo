package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import utilities.BaseClass;
import utilities.ExcelAPI;

public class CartStepDefinition extends BaseClass {
	//public WebDriver driver;
	CartPage cp;

	@Given("User is on cart page")
	public void user_is_on_cart_page() throws InterruptedException, IOException {
		//driver = BaseClass.getDriver();
		//driver.manage().window().maximize();
		System.out.println("User on the cart page");
		 
	}
	@When("User validated subtotal price for the selected book")
	public void user_validated_subtotal_price_for_the_selected_book() throws InterruptedException {
		cp = new CartPage(driver);
		cp.clickCart().click();
		Thread.sleep(2000);
		System.out.println("User clicked on shopping cart");
	    String actualprice = cp.getActualPrice().getText();
	    System.out.println("Actual price of the product :"+actualprice);
	    Thread.sleep(1000);
	    String subtotalprice = cp.getSubTotalPrice().getText();
	    Thread.sleep(1000);
	    System.out.println("Subtotal price of the product :"+subtotalprice);
	    assertEquals(actualprice, subtotalprice);
	    
	}
	@Then("User clicked on agree terms and conditions")
	public void user_clicked_on_agree_terms_and_conditions() throws InterruptedException {
	   cp.agreeTermsConditions().click();
	   System.out.println("User agreed terms and conditions");
	   Thread.sleep(2000);
	}
	@When("User clciked on checkout button")
	public void user_clciked_on_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    cp.clickChekoutButton().click();
	    System.out.println("User clicked on checkout button");
	}
	
}

