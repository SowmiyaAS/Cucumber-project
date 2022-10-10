package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.basecalss.Base_Class;
import org.openqa.selenium.WebDriver;
import org.pomclass.Homepage;
import org.pomclass.Loginpage;
import org.pomclass.Paymenttouser;
import org.testrunner.Testrunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cyclosstep extends Base_Class {

	public static WebDriver driver = Testrunner.driver;

	public static Loginpage lp = new Loginpage(driver);

	public static Homepage hp = new Homepage(driver);

	public static Paymenttouser pt = new Paymenttouser(driver);
	
	
	
	
	

	@Given("User launch the application")
	public void user_launch_the_application() throws Throwable {
		
		getUrl("https://demo.cyclos.org/ui/home");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@When("user click on the login button")
	public void user_click_on_the_login_button() throws Throwable {
		
		clickonElement(lp.getLogin());
	}


	@When("user enter valid username")
	public void user_enter_valid_username() throws Throwable {
		
		
		inputvalueelement(hp.getUsername(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\src\\test\\java\\Cyloslogin.xlsx", 0, 1));
		

	}

	@When("user enter tha valid password")
	public void user_enter_tha_valid_password() throws Throwable {
		
		inputvalueelement(hp.getPassword(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\src\\test\\java\\Cyloslogin.xlsx", 1, 1));
	}

	@Then("user click the submit button And it navigate to the Dashboard page")
	public void user_click_the_submit_button_and_it_navigate_to_the_dashboard_page() throws Throwable {

		clickonElement(hp.getSubmit());
		
	}

	@When("user click the payuser button")
	public void user_click_the_payuser_button() throws Throwable {
		clickonElement(hp.getPayuser());

	}

	@When("user click contact list")
	public void user_click_contact_list() throws Throwable {

		clickonElement(pt.getContactlist());
	}

	@When("user select the contact list")
	public void user_select_the_contact_list() throws Throwable {
		
		clickonElement(pt.getSelectcontact());
	}

	@When("user enter the amount")
	public void user_enter_the_amount() throws Throwable {
		inputvalueelement(pt.getEnteramt(), "2");

	}

	@When("click scheduling and select the paynow option")
	public void click_scheduling_and_select_the_paynow_option() throws Throwable {
		clickonElement(pt.getClickschedule());
		clickonElement(pt.getClickpaynow());

	}

	@When("user enter the description")
	public void user_enter_the_description() throws Throwable {
		
		inputvalueelement(pt.getDescription(), "hi tristha");

	}

	@Then("user click the next button and it navigate to the payment confirmation page")
	public void user_click_the_next_button_and_it_navigate_to_the_payment_confirmation_page() throws Throwable {
		clickonElement(pt.getClicknxt());
		clickonElement(pt.getClickconfirm());
		
		

	}

}
