package stepdefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageobjects.Homepage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	public WebDriver driver;
	Homepage hm;
	
    @Given("^User is on GreenCart login page$")
    public void user_is_on_greencart_login_page() throws Throwable {
    	driver = Baseclass.getDriver();  
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
       hm= new Homepage(driver);
       hm.getSearch().sendKeys(strArg1);
       Thread.sleep(2000);
       
       }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }
    
    
    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^User proceed to checkout page for purchase$")
    public void user_proceed_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }
    
    

   


}
