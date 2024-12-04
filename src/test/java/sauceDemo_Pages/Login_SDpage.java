package sauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_SDpage {
	
WebDriver driver;
	
	@FindBy(name="user-name") WebElement userField;
	@FindBy(name="password") WebElement pwdField;
	@FindBy(id="login-button") WebElement loginButton;
	
	
	public Login_SDpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void login(String username, String password) {
		userField.sendKeys(username);
		pwdField.sendKeys(password);
		loginButton.click();
		
	}
	

}
