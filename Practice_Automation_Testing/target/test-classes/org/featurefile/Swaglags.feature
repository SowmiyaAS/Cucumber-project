Feature: Online Shopping

Scenario: Dress purchases
Given user launch the application for dress purchases
When user enter the username in the vaild feild
And user enter the password in the  vaild feild
Then user click the login button and its Navigate to product page

Scenario: Products select 
Given user select the product
When user select the Add to cart button in  Sauce Labs Backpack product 
And user select the Add to cart button in Sauce Labs Bike Light product
And user select the Add to cart button in Sauce Labs Bolt T-Shirt product
And user click the Shopping cart button and its Navigate to the Your cart page
And user click the checkout button and its Navigate to the Your Information page
And user enters the First name in the vaild field
And user enters the last name in the vaild field
And user enters the zipcode in the vaild field
And user click the coutinue button
Then user click the finish button
