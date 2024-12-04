package sauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcartandCheckout_SDpage {
	
	WebDriver driver;
	@FindBy(id="add-to-cart-sauce-labs-backpack") WebElement saucebackpackButton;
	@FindBy(id="add-to-cart-sauce-labs-bike-light") WebElement saucebikelightButton;
	@FindBy(id="shopping_cart_container") WebElement gotocartButton;
	@FindBy(id="checkout") WebElement checkoutButton;

	public AddcartandCheckout_SDpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addCart() {
		saucebackpackButton.click();
		saucebikelightButton.click();
	}
	
	public void checkOut() {
		gotocartButton.click();
		checkoutButton.click();
		
	}
	
}
