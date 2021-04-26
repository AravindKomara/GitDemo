package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Baseclass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageobjects.Productpage;

@RunWith(Cucumber.class)
public class stepDefination extends Baseclass{
	
	Productpage pp;
	
	@Then("^Verify selcted \"([^\"]*)\" items are displayed in the checkout page$")
    public void verify_selcted_something_items_are_displayed_in_the_checkout_page(String strArg1) throws Throwable {
    	Thread.sleep(2000);
    	pp= new Productpage(driver);
    	Assert.assertTrue(pp.getProductName().getText().contains(strArg1));
    }
	
	 @Then("^Verify selcted (.+) items are displayed in the check out page$")
	    public void verify_selcted_items_are_displayed_in_the_check_out_page(String vegetablename) throws Throwable {
		 Thread.sleep(2000);
	    	pp= new Productpage(driver);
	    	Assert.assertTrue(pp.getProductName().getText().contains(vegetablename));
	    }

	
	 @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Validate the browser");
	    }

	    @When("^Browser was triggered$")
	    public void browser_was_triggered() throws Throwable {
	    	System.out.println("Browser was triggered");
	    }

	    @Then("^Check if browser displayed$")
	    public void check_if_browser_started() throws Throwable {
	    	System.out.println("Check if browser displayed");
	    }
	    
	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	        System.out.println("navigated to login page");
	    }

	 @When("^User login into the appilication with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_the_appilication_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("navigated to then page");
	    }

	    @And("^Cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }
	    
	    @When("^User signup with following details$")
	    public void user_signup_with_following_details(DataTable data) throws Throwable {
	        List<List<String>> obj = data.asLists();
	        System.out.println(obj.get(0).get(0));
	        System.out.println(obj.get(0).get(2));
	    }
	    
	    @When("^User login in to the appilication with (.+) and (.+)$")
	    public void user_login_into_the_appilication_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
	   


}
