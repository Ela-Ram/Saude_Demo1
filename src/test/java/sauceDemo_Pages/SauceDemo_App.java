package sauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import common.DriverFactory;
import common.Screenshot;

public class SauceDemo_App {
	WebDriver driver = DriverFactory.getdriver();
	Login_SDpage login_SDpage = new Login_SDpage(driver);
	AddcartandCheckout_SDpage addcartandcheckout_SDpage = new AddcartandCheckout_SDpage(driver);
	ShippingandLogout_SDpage shippingandlogout_SDpage = new ShippingandLogout_SDpage(driver);
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		
        driver.get("https://www.saucedemo.com/");
       
	}
	
	@When("the user enters {string} in the username field and {string} in the password field and clicks login button")
	public void the_user_enters_in_the_username_field_and_in_the_password_field_and_clicks_login_button(String username, String password) {
		login_SDpage.login(username, password);
		
	}

	@When("the user added the products to the cart")
	public void the_user_added_the_products_to_the_cart() {
		addcartandcheckout_SDpage.addCart();
	   
	}
	@When("the user clicks the cart symbol and the user clicks the checkout button")
	public void the_user_clicks_the_cart_symbol_and_the_user_clicks_the_checkout_button() {
	    
		addcartandcheckout_SDpage.checkOut();
	}
	@When("the user enters {string} in the First Name field and the user enters {string} in the Last Name d and the user enters {string} in the Zip\\/Postal code field")
	public void the_user_enters_in_the_first_name_field_and_the_user_enters_in_the_last_name_d_and_the_user_enters_in_the_zip_postal_code_field(String firstname, String lastname, String postal) {
	    	    
		shippingandlogout_SDpage.shipping(firstname,lastname,postal);
	}
	

	@When("the user clicks the Continue butto and the user clicks the Finish button")
	public void the_user_clicks_the_continue_butto_and_the_user_clicks_the_finish_button() {
		
		shippingandlogout_SDpage.Tologout();
		Screenshot.getScreenshot();
		
	}
	@When("the user clicked Back Home button to logout")
	public void the_user_clicked_back_home_button_to_logout() {
		shippingandlogout_SDpage.Logout();
	    
	}
	   
	@Then("the user should be logged out Successfully")
	public void the_user_should_be_logged_out_successfully() {
		
		shippingandlogout_SDpage.url();
		
	}
}



