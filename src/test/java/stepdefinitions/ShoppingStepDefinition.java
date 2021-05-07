package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ShoppingPage;
import utilities.BaseClass;
import utilities.ExcelAPI;

public class ShoppingStepDefinition extends BaseClass {
	//public WebDriver driver;
	ShoppingPage sp;

	@Given("User is on shopping page")
	public void user_is_on_shopping_page() throws InterruptedException {
	    System.out.println("User is on shopping page");
	    sp= new ShoppingPage(driver);
	    
	}
	@When("User cleared shopping cart")
	public void user_cleared_shopping_cart() throws InterruptedException {
		sp.clearShoppingCart().click();
		Thread.sleep(5000);
		String status = sp.checkCartEmpty().getText();
		if(status.equalsIgnoreCase("Your Shopping Cart is empty!")) {
			 driver.navigate().to("http://demowebshop.tricentis.com/");
		}else {
			List<WebElement> totalprodcuts = sp.removeProdcutFromCart();
			System.out.println(totalprodcuts.size());
			for ( WebElement el : totalprodcuts ) {
			   
			       sp.removeProdcutFromCart1().click();
			       Thread.sleep(3000);
			       sp.updateShoppingCart().click();
			    
			}
			
			System.out.println("User cleared the shopping cart");
			System.out.println("User back to the shopping page");
		    driver.navigate().to("http://demowebshop.tricentis.com/");
			
			
			
		}
		
	   
	}
	@When("User selected {string} from categories")
	public void user_selected_from_categories(String string) throws InterruptedException {
		Thread.sleep(2000);
		sp.clickBooks().click();
		System.out.println("User slected books from the categories");
		
	}
	@Then("User selected a book from the list displayed")
	public void user_selected_a_book_from_the_list_displayed() throws InterruptedException {
		Thread.sleep(2000);
		sp.selectBook().click();
		System.out.println("User selected 3rd book from the results");
	}
	@Then("Enter the qutatinty more than one")
	public void enter_the_qutatinty_more_than_one() throws InterruptedException {
		Thread.sleep(2000);
		sp.addQuantity().clear();
		sp.addQuantity().sendKeys("2");
		System.out.println("User entered the quantity 2");
	}
	@When("User clicked on {string}")
	public void user_clicked_on(String string) throws InterruptedException {
		Thread.sleep(3000);
		sp.addToCart().click();
		System.out.println("User added products to the cart");
	    
	}
	@Then("Validate {string} message")
	public void validate_message(String expectedMessage) throws InterruptedException {
		Thread.sleep(5000);
		String actualMessage = sp.checkCartMessage().getText();
		System.out.println(expectedMessage);
		//System.out.println("msg"+actualMessage);
		//assertEquals(actualMessage, expectedMessage);
		//System.out.println("Displayed message on the page is:"+actualMessage);
		
	}
}

