package org.AccountStepdefinition;

import java.util.concurrent.TimeUnit;

import org.BaseClass.Base_Class;
import org.Hooksfile.Accounthooks;
import org.Pomclass.Accountpage;
import org.Pomclass.Accountpage1;
import org.Testrunner.Accountrunner;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accountstep extends Base_Class{

	public static WebDriver driver= Accountrunner.driver;
	public static Accountpage ap=new Accountpage(driver);
	public static Accountpage1 ap1=new Accountpage1(driver);




	@Given("User launch the testleaf application")
	public void user_launch_the_testleaf_application() throws Throwable{
		getUrl("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	//	@When("User enter the username")
	//	public void user_enter_the_username() throws Throwable{
	//		inputvalueelement(ap.getUsername(), "demosalesmanager");
	//
	//	}
	//	@When("User enter the password")
	//	public void user_enter_the_password() throws Throwable{
	//		inputvalueelement(ap.getPassword(), "crmsfa");
	//	}


	@When("User enter the value to username {string} textfield")
	public void user_enter_the_value_to_username_textfield(String  username) throws Throwable{
		inputvalueelement(ap.getUsername(), username);

	}
	@When("User enter the value password {string} textfield")
	public void user_enter_the_value_password_textfield(String password) throws Throwable{
		inputvalueelement(ap.getPassword(), password);

	}
	@Then("user click on the login button")
	public void user_click_on_the_login_button() throws Throwable{
		clickonElement(ap.getClicklogin());
	}

	@When("user click on the crmsfa button and it navigate to the home page")
	public void user_click_on_the_crmsfa_button_and_it_navigate_to_the_home_page() throws Throwable{
		clickonElement(ap.getCrmsfa());

	}
	@When("user click on the account button and it navigate to the account page")
	public void user_click_on_the_account_button_and_it_navigate_to_the_account_page() throws Throwable{
		clickonElement(ap.getAccount());

	}
	@Then("user click on the create account button and it navigate to the create account page")
	public void user_click_on_the_create_account_button_and_it_navigate_to_the_create_account_page() throws Throwable{
		clickonElement(ap.getCerateaccount());

	}

	@When("user enter the value to accname {string} textfield")
	public void user_enter_the_value_to_accname_textfield(String accountname) throws Throwable{
		inputvalueelement(ap1.getAccname(), accountname);
		
			}
	@When("user enter the value to accdesc {string} textfield")
	public void user_enter_the_value_to_accdesc_textfield(String description) throws Throwable{
		inputvalueelement(ap1.getAccdesc(),description);

	}
	@When("user enter the value to areacode {string} textfield")
	public void user_enter_the_value_to_areacode_textfield(String areacode) throws Throwable{
		inputvalueelement(ap1.getAreacode(), areacode);

	}
	@When("user enter the value to email {string} textfield")
	public void user_enter_the_value_to_email_textfield(String email ) throws Throwable{
		inputvalueelement(ap1.getEmail(), email);

	}
	@When("user enter the value to toname {string} textfield")
	public void user_enter_the_value_to_toname_textfield(String tonmae) throws Throwable{
		inputvalueelement(ap1.getToname(), tonmae);

	}
	@When("user enter the value to state {string} textfield")
	public void user_enter_the_value_to_state_textfield(String state) throws Throwable{
		inputvalueelement(ap1.getState(),state);

	}
	@When("user enter the value to countryid {string} textfield")
	public void user_enter_the_value_to_countryid_textfield(String countryid) throws Throwable{
		inputvalueelement(ap1.getCountryid(), countryid);

	}
	@Then("user click on the submit button and user account successfully created")
	public void user_click_on_the_submit_button_and_user_account_successfully_created() throws Throwable{

		clickonElement(ap1.getSubmit());
	}





}
