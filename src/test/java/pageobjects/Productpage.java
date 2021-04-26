package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productpage {

public WebDriver driver;
	
	public Productpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By productName = By.cssSelector("p.product-name");
	
	public WebElement getProductName() {
		return driver.findElement(productName);
	}
}
