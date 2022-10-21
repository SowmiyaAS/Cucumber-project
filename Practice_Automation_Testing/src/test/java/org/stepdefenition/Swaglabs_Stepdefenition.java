package org.stepdefenition;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebDriver;
import org.pageobjectmanager.Swaglags_POM;
import org.testrunner.Swaglabs_Testrunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swaglabs_Stepdefenition extends Base_Class {
	public static WebDriver driver = Swaglabs_Testrunner.driver;
	
	//public static Swaglabs_hp shp = new Swaglabs_hp(driver);
	
	//public static Swaglabs_Pd spd = new Swaglabs_Pd(driver);

	public static Swaglags_POM pom = new Swaglags_POM(driver);
	 
	@Given("user launch the application for dress purchases")
	public void user_launch_the_application_for_dress_purchases() { 
		 getUrl("https://www.saucedemo.com/");
	}
	
	@When("user enter the username in the vaild feild")
	public void user_enter_the_username_in_the_vaild_feild() {
		inputvalueelement(pom.getShp().getUsername(),"standard_user");
	}
	
	@When("user enter the password in the  vaild feild")
	public void user_enter_the_password_in_the_vaild_feild() {
		inputvalueelement(pom.getShp().getPassword(), "secret_sauce");
	}
	
	@Then("user click the login button and its Navigate to product page")
	public void user_click_the_login_button_and_its_navigate_to_product_page() {
		clickonElement(pom.getShp().getLogin());
	}
	
	@Given("user select the product")
	public void user_select_the_product() {
	    System.out.println("User selecting the Product");
	}
	@When("user select the Add to cart button in  Sauce Labs Backpack product")
	public void user_select_the_add_to_cart_button_in_sauce_labs_backpack_product() {
		      clickonElement(pom.getSpd().getSauceLabsBackpack());
	   	}
	@When("user select the Add to cart button in Sauce Labs Bike Light product")
	public void user_select_the_add_to_cart_button_in_sauce_labs_bike_light_product() {
	      clickonElement(pom.getSpd().getSauceLabsOnesie());
	}
	@When("user select the Add to cart button in Sauce Labs Bolt T-Shirt product")
	public void user_select_the_add_to_cart_button_in_sauce_labs_bolt_t_shirt_product() {
	   clickonElement(pom.getSpd().getSauceLabsBoltTShirt());
	}
	@When("user click the Shopping cart button and its Navigate to the Your cart page")
	public void user_click_the_shopping_cart_button_and_its_navigate_to_the_your_cart_page() {
	    clickonElement(pom.getSpd().getShopingcartbutton());
	}
	@When("user click the checkout button and its Navigate to the Your Information page")
	public void user_click_the_checkout_button_and_its_navigate_to_the_your_information_page() {
	   clickonElement(pom.getSpd().getCheckoutbutton());
	}
	@When("user enters the First name in the vaild field")
	public void user_enters_the_first_name_in_the_vaild_field() {
	   inputvalueelement(pom.getSpd().getFirstName(), "Jagadesh");
	}
	@When("user enters the last name in the vaild field")
	public void user_enters_the_last_name_in_the_vaild_field() {
	   inputvalueelement(pom.getSpd().getLastname(),"waran");
	}
	@When("user enters the zipcode in the vaild field")
	public void user_enters_the_zipcode_in_the_vaild_field() {
	   inputvalueelement(pom.getSpd().getZipcode(), "600018");
	}
	@When("user click the coutinue button")
	public void user_click_the_coutinue_button() {
	  clickonElement(pom.getSpd().getContinuebutton());
	}
	@Then("user click the finish button")
	public void user_click_the_finish_button() {
	   clickonElement(pom.getSpd().getFinishbutton());
	}




}
