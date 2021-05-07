package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import utilities.BaseClass;
import utilities.ExcelAPI;

public class LoginStepDefinitions {
	public WebDriver driver;
	LandingPage lp;
	ExcelAPI excel = new ExcelAPI();
	ArrayList<String> testdata;

	
	@Given("User is on landing page")
	public void user_is_on_landing_page() throws IOException, InterruptedException {
		testdata = excel.getData("Add items to cart", "testdata");
		System.out.println(testdata.get(1));
		driver = BaseClass.getDriver();
		driver.manage().window().maximize();
		System.out.println("User on the landing page");
	}
	@When("User clicked on login page")
	public void user_clicked_on_login_page() {
		lp = new LandingPage(driver);
		lp.clickLoginLink().click();
		System.out.println("User clicked on login link");
		
	}
	@Then("Message display as {string}")
	public void message_display_as(String expectedMessage) {
		expectedMessage = testdata.get(2);
		String actualMessage = lp.getLoginMessage().getText();
		System.out.println(actualMessage);
		assertEquals(actualMessage, expectedMessage);
		System.out.println("Displayed message on the page is:"+actualMessage);
	}
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
		assertEquals(username, testdata.get(3));
		assertEquals(password, testdata.get(4));
		lp.enterEmail().sendKeys(username);
		lp.enterPassword().sendKeys(password);
		System.out.println("User entered username is :"+username);
		System.out.println("User entered password is :"+password);
	  
	}
	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	 lp.clickLoginButton().click();
	 System.out.println("User clicked on login button");
	 Thread.sleep(3000);
	}
	@Then("Validate user account ID")
	public void validate_user_account_id() {
	   String expectedUserID = testdata.get(3);
	   String actualUserID = lp.getUserAccountID().getText();
	   assertEquals(actualUserID, expectedUserID);
	   System.out.println("User account id is :"+actualUserID);
	   
	}

}

