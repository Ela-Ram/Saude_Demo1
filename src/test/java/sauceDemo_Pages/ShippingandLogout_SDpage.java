package sauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingandLogout_SDpage {
	
	WebDriver driver;
	@FindBy(id="first-name") WebElement firstnameField;
	@FindBy(id="last-name") WebElement lastnameField;
	@FindBy(id="postal-code") WebElement postalField;
	@FindBy(id="continue") WebElement continueButton;
	@FindBy(id="finish") WebElement finishButton;
	
	@FindBy(id="back-to-products") WebElement backhomeButton;
	@FindBy(id="react-burger-menu-btn") WebElement tologoutButton;
	@FindBy(id="logout_sidebar_link") WebElement logoutButton;
	
	
	public ShippingandLogout_SDpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void shipping(String firstname,String lastname, String postal) {	
		firstnameField.sendKeys(firstname);
		lastnameField.sendKeys(lastname);
		postalField.sendKeys(postal);
	}
	public void Tologout() {
		continueButton.click();
		finishButton.click();
		}
	
	public void Logout(){
			backhomeButton.click();
			tologoutButton.click();
			logoutButton.click();

}
	public void url() {
		String currentUrl = driver.getCurrentUrl();
		if(!currentUrl.equals("https://www.saucedemo.com/"))
				{
			throw new AssertionError("User is not logged out");
					
		}
		
}
}
