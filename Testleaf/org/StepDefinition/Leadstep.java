package org.StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.BaseClass.Base_Class;
import org.Hooksfile.Leadhooks;
import org.Testrunner.Leadrunner;
import org.openqa.selenium.WebDriver;
import org.pommanager.Managerclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leadstep extends Base_Class{
	public static WebDriver driver=Leadrunner.driver;
	public static Managerclass mc=new Managerclass(driver);
@Given("user launch the application")
public void userLaunchTheApplication() {
	getUrl("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@When("user enter the username")
public void userEnterTheUsername() throws Throwable {
	inputvalueelement(mc.Instance_getLp().getUsername(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 0, 1));
}
@When("user enter the password")
public void userEnterThePassword() throws Throwable {
	inputvalueelement(mc.Instance_getLp().getPassword(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 1, 1));

}
@When("user click on the login button")
public void userClickOnTheLoginButton()throws Throwable {

	clickonElement(mc.Instance_getLp().getSubmit());

}
@Then("user click on the crmsfa button and it naviagte to the home page")
public void userClickOnTheCrmsfaButtonAndItNaviagteToTheHomePage()throws Throwable {
	clickonElement(mc.Instance_getLp().getCrmsfabutton());

}

@When("user click on the lead button")
public void userClickOnTheLeadButton()throws Throwable {
	clickonElement(mc.Instance_getHp().getLead());
	

}
@When("user click on the create lead button and it navigate to the create lead page")
public void userClickOnTheCreateLeadButtonAndItNavigateToTheCreateLeadPage() throws Throwable{
	clickonElement(mc.Instance_getHp().getCreatelead());

}
@When("user enter the company name")
public void userEnterTheCompanyName()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getCompanyname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 2, 1));

}
@When("user enter the firstname")
public void userEnterTheFirstname()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getFirstname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 3, 1));

}
@When("user enter the lastname")
public void userEnterTheLastname()throws Throwable {

	inputvalueelement(mc.Instance_getHp().getLastname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 4, 1));
}
@When("user enter the sourceid")
public void userEnterTheSourceid()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getSourceid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 5, 1));
}
@When("user enter the campaign id")
public void userEnterTheCampaignId() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getCampaignid(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 6, 1));
}
@When("user enter the firstname local")
public void userEnterTheFirstnameLocal()throws Throwable {

	inputvalueelement(mc.Instance_getHp().getFnlocal(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 7, 1));
}
@When("user enter the lastname local")
public void userEnterTheLastnameLocal() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getLnlocal(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 8, 1));
	
}
@When("user enter the salutation")
public void userEnterTheSalutation() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getPersontitle(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 9, 1));
}
@When("user enter the title")
public void userEnterTheTitle() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getProftitle(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 10, 1));

}
@When("user enter the department name")
public void userEnterTheDepartmentName() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getDepartmentname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 11, 1));
}
@When("user enter the annual revenue")
public void userEnterTheAnnualRevenue()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getAnnualrevenue(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 12, 1));
   
}
@When("user enter the preferred currency")
public void userEnterThePreferredCurrency()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getCurrencyid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 13, 1));
}
@When("user enter the industry")
public void userEnterTheIndustry() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getIndustryenumid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 14, 1));
}
@When("user enter the number of employees")
public void userEnterTheNumberOfEmployees()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getNumberofemp(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 15, 1));

}
@When("user enter the Siccode")
public void userEnterTheSiccode()throws Throwable {

	inputvalueelement(mc.Instance_getHp().getSiccode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 16, 1));
	
}
@When("user enter the description")
public void userEnterTheDescription()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getDescription(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 17, 1));
	

}
@Then("user enter the important note and it navigate to the contact information page")
public void userEnterTheImportantNoteAndItNavigateToTheContactInformationPage()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getImportantnote(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 18, 1));              
	

}
@When("user enter the countrycode")
public void userEnterTheCountrycode() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getCountrycode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 19, 1));
	
}
@When("user enter the area code")
public void userEnterTheAreaCode() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getAreacode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 20, 1));
	

}
@When("user enter the phone number")
public void userEnterThePhoneNumber() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getPhonenumber(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 21, 1));
	

}
@When("user enter the extension")
public void userEnterTheExtension() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getPhoneextension(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 22, 1));
	

}
@When("use enter the phone ask for me")
public void useEnterThePhoneAskForMe()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getAskforme(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 23, 1));
	

}
@When("user enter the email")
public void userEnterTheEmail() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getEmail(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 24, 1));
	
}
@Then("user enter the weburl and it navigate to the primary address page")
public void userEnterTheWeburlAndItNavigateToThePrimaryAddressPage() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getWeburl(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 25, 1));
	
}
@When("user enter the toname")
public void userEnterTheToname1()throws Throwable {
	inputvalueelement(mc.Instance_getHp().getToname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 26, 1));
	
}
@When("user enter the attention name")
public void userEnterTheAttentionName() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getAttentionname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 27, 1));
	
}
@When("user enter the address1")
public void userEnterTheAddress1() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getAddress1(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 28, 1));
	
}
@When("user enter the address2")
public void userEnterTheAddress2() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getAddress2(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 29, 1));
	
}
@When("user enter the city")
public void userEnterTheCity() throws Throwable{

	inputvalueelement(mc.Instance_getHp().getCity(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 30, 1));
	
}
@When("user enter the state")
public void userEnterTheState() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getState(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 31, 1));
	
    
}
@When("user enter the postal code")
public void userEnterThePostalCode() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getPostalcode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 32, 1));
	
}
@When("user enter the country")
public void userEnterTheCountry() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getCurrencyid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 33, 1));
	

}
@When("user enter the zip postal code")
public void userEnterTheZipPostalCode() throws Throwable{
	inputvalueelement(mc.Instance_getHp().getCodeexit(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 34, 1));
	

}
@Then("user click on the submit button and user successfully created user lead")
public void userClickOnTheSubmitButtonAndUserSuccessfullyCreatedUserLead()throws Throwable {

	clickonElement(mc.Instance_getHp().getSubmit());
}

@When("user click on the contact button1")
public void userClickOnTheContactButton1() throws Throwable{
	clickonElement(mc.Instance_getCp().getClickcontact());
	


}
@When("user click on the create contact button1")
public void userClickOnTheCreateContactButton1()throws Throwable {
	clickonElement(mc.Instance_getCp().getClickcreatecontact());
	
}
@When("user enter the firstname1")
public void userEnterTheFirstname1() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getFname(), "kanimozhi");
	
}
@When("user enter the lastname1")
public void userEnterTheLastname1() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getLname(), "S");
	
}
@When("user enter the salutation field")
public void userEnterTheSalutationField() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getSalutation(), "Hi,Everyone");
	
}
@When("user enter the title field")
public void userEnterTheTitleField() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getTitle(), "Create contact");
	
}
@When("user enter the department name1")
public void userEnterTheDepartmentName1() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getDeptname(), "Test Engineer");
	
}
@When("user enter the currency id")
public void userEnterTheCurrencyId()throws Throwable {
	inputvalueelement(mc.Instance_getCp().getCurrencyid(), "DZD");
	
}
@When("user enter the createdesc")
public void userEnterTheCreatedesc() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getCreatedesc(), "Automation project");
	
}
@Then("user enter the important note and it navigate to the contact session")
public void userEnterTheImportantNoteAndItNavigateToTheContactSession()throws Throwable {
inputvalueelement(mc.Instance_getCp().getNote(), "Send the data for all mandatory fields ");
	
	
}
@When("user enter the country code1")
public void userEnterTheCountryCode1() throws Throwable{
	clear(mc.Instance_getCp().getCcode());
	inputvalueelement(mc.Instance_getCp().getCcode(), "91");
	
}
@When("user enter the Acode")
public void userEnterTheAcode() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getAcode(), "01");
	
}
@When("user enter the pnumber")
public void userEnterThePnumber() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getPnumber(),"8912346517");
	
}
@When("user enter the pextension")
public void userEnterThePextension() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getPextension(), "oct 01");
	
}
@When("user enter the Paskforme")
public void userEnterThePaskforme() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getPaskforme(), "pandiyan");
	
}
@Then("user enter the Pemail and it navigate to the the primary session")
public void userEnterThePemailAndItNavigateToTheThePrimarySession()throws Throwable {
	inputvalueelement(mc.Instance_getCp().getPemail(), "friends@gmail.com");
	
}
@When("user enter the Toname")
public void userEnterTheToname()throws Throwable {
	inputvalueelement(mc.Instance_getCp().getToname(), "kani");
	
}
@When("user enter the Attnname")
public void userEnterTheAttnname() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getAttnname(), "vairavan");
	
}
@When("user enter the Add1")
public void userEnterTheAdd1() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getAdd1(), "Andakottai");
	
}
@When("user enter the Add2")
public void userEnterTheAdd2()throws Throwable {
	inputvalueelement(mc.Instance_getCp().getAdd2(), "peravurani");
	
}
@When("user enter the Generalcity")
public void userEnterTheGeneralcity() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getGeneralcity(), "Thanjavur");
	
}
@When("user enter the Stateid")
public void userEnterTheStateid() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getStateid(), "WY");
	
}
@When("user enter the Pcode")
public void userEnterThePcode() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getPcode(), "614523");
	
}
@When("user enter the Countryid")
public void userEnterTheCountryid() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getCountryid(), "Aruba");

}
@When("user enter the Codeextension")
public void userEnterTheCodeextension() throws Throwable{
	inputvalueelement(mc.Instance_getCp().getCodeextension(), "oct 5");
	
}
@Then("user click on the submit button")
public void userClickOnTheSubmitButton() throws Throwable{
	clickonElement(mc.Instance_getCp().getContactsubmit());
}




	


	}


