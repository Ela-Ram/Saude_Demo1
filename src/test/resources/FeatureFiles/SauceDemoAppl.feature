@SauceDemoFlow
Feature: Complete Flow of SauceDemo Application

@Test
Scenario: Login/Add to cart(two Products)/Checkout/Shipping/Logout

        Given the user is on the login page

        When the user enters "standard_user" in the username field and "secret_sauce" in the password field and clicks login button
        
        When the user added the products to the cart

        And the user clicks the cart symbol and the user clicks the checkout button
        
        And the user enters "Ajith" in the First Name field and the user enters "Kumar" in the Last Name d and the user enters "12345" in the Zip/Postal code field
        
        And the user clicks the Continue butto and the user clicks the Finish button  

        And the user clicked Back Home button to logout
        
        Then the user should be logged out Successfully


        
        
        
