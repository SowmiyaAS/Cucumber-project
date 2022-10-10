package org.RunnerClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.BaseClass.Base_Class;
import org.Pomclass.Contactpage;
import org.Pomclass.Homepage;
import org.Pomclass.Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pommanager.Managerclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");
	//	public static Loginpage lp = new Loginpage(driver);
	//	public static Homepage hp = new Homepage(driver);
	// public static Createpage cp=new  Createpage(driver);
	public static Managerclass mc=new Managerclass(driver);



	public static void main(String[] args) throws Throwable {
		getUrl("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		inputvalueelement(mc.Instance_getLp().getUsername(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 0, 1));
		inputvalueelement(mc.Instance_getLp().getPassword(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 1, 1));
		clickonElement(mc.Instance_getLp().getSubmit());
		clickonElement(mc.Instance_getLp().getCrmsfabutton());

		clickonElement(mc.Instance_getHp().getLead());
		clickonElement(mc.Instance_getHp().getCreatelead());
		inputvalueelement(mc.Instance_getHp().getCompanyname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 2, 1));
		inputvalueelement(mc.Instance_getHp().getFirstname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 3, 1));
		inputvalueelement(mc.Instance_getHp().getLastname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 4, 1));
		inputvalueelement(mc.Instance_getHp().getSourceid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 5, 1));
		inputvalueelement(mc.Instance_getHp().getCampaignid(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 6, 1));
		inputvalueelement(mc.Instance_getHp().getFnlocal(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 7, 1));
		inputvalueelement(mc.Instance_getHp().getLnlocal(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 8, 1));
		inputvalueelement(mc.Instance_getHp().getPersontitle(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 9, 1));
		inputvalueelement(mc.Instance_getHp().getProftitle(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 10, 1));
		inputvalueelement(mc.Instance_getHp().getDepartmentname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 11, 1));
		inputvalueelement(mc.Instance_getHp().getAnnualrevenue(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 12, 1));
		inputvalueelement(mc.Instance_getHp().getCurrencyid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 13, 1));
		inputvalueelement(mc.Instance_getHp().getIndustryenumid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 14, 1));
		inputvalueelement(mc.Instance_getHp().getNumberofemp(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 15, 1));
		inputvalueelement(mc.Instance_getHp().getSiccode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 16, 1));
		inputvalueelement(mc.Instance_getHp().getDescription(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 17, 1));
		inputvalueelement(mc.Instance_getHp().getImportantnote(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 18, 1));              
		inputvalueelement(mc.Instance_getHp().getCountrycode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 19, 1));
		inputvalueelement(mc.Instance_getHp().getAreacode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 20, 1));
		inputvalueelement(mc.Instance_getHp().getPhonenumber(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 21, 1));
		inputvalueelement(mc.Instance_getHp().getPhoneextension(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 22, 1));
		inputvalueelement(mc.Instance_getHp().getAskforme(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 23, 1));
		inputvalueelement(mc.Instance_getHp().getEmail(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 24, 1));
		inputvalueelement(mc.Instance_getHp().getWeburl(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 25, 1));
		inputvalueelement(mc.Instance_getHp().getToname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 26, 1));
		inputvalueelement(mc.Instance_getHp().getAttentionname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 27, 1));
		inputvalueelement(mc.Instance_getHp().getAddress1(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 28, 1));
		inputvalueelement(mc.Instance_getHp().getAddress2(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 29, 1));
		inputvalueelement(mc.Instance_getHp().getCity(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 30, 1));
		inputvalueelement(mc.Instance_getHp().getState(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 31, 1));
		inputvalueelement(mc.Instance_getHp().getPostalcode(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 32, 1));
		inputvalueelement(mc.Instance_getHp().getCurrencyid(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 33, 1));
		inputvalueelement(mc.Instance_getHp().getCodeexit(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Testleaf.xlsx", 34, 1));
		clickonElement(mc.Instance_getHp().getSubmit());

		//contact
		clickonElement(mc.Instance_getCp().getClickcontact());
		clickonElement(mc.Instance_getCp().getClickcreatecontact());
		inputvalueelement(mc.Instance_getCp().getFname(), "kanimozhi");
		inputvalueelement(mc.Instance_getCp().getLname(), "S");
		inputvalueelement(mc.Instance_getCp().getSalutation(), "Hi,Everyone");
		inputvalueelement(mc.Instance_getCp().getTitle(), "Create contact");
		inputvalueelement(mc.Instance_getCp().getDeptname(), "Test Engineer");
		inputvalueelement(mc.Instance_getCp().getCurrencyid(), "DZD");
		inputvalueelement(mc.Instance_getCp().getCreatedesc(), "Automation project");
		inputvalueelement(mc.Instance_getCp().getNote(), "Send the data for all mandatory fields ");
		
		clear(mc.Instance_getCp().getCcode());
		inputvalueelement(mc.Instance_getCp().getCcode(), "91");
		inputvalueelement(mc.Instance_getCp().getAcode(), "01");
		inputvalueelement(mc.Instance_getCp().getPnumber(),"8912346517");
		inputvalueelement(mc.Instance_getCp().getPextension(), "oct 01");
		inputvalueelement(mc.Instance_getCp().getPaskforme(), "pandiyan");
		inputvalueelement(mc.Instance_getCp().getPemail(), "friends@gmail.com");
		inputvalueelement(mc.Instance_getCp().getToname(), "kani");
		inputvalueelement(mc.Instance_getCp().getAttnname(), "vairavan");
		inputvalueelement(mc.Instance_getCp().getAdd1(), "Andakottai");
		inputvalueelement(mc.Instance_getCp().getAdd2(), "peravurani");
		inputvalueelement(mc.Instance_getCp().getGeneralcity(), "Thanjavur");
		inputvalueelement(mc.Instance_getCp().getStateid(), "WY");
		inputvalueelement(mc.Instance_getCp().getPcode(), "614523");
		inputvalueelement(mc.Instance_getCp().getCountryid(), "Aruba");
		inputvalueelement(mc.Instance_getCp().getCodeextension(), "oct 5");
		clickonElement(mc.Instance_getCp().getContactsubmit());


		










		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//driver.findElement(By.xpath("//a[text()='Create Contact']")).click();

		//firstname
		//driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("kanimozhi");

		//lastname
		//driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("S");

		//salutation
		//driver.findElement(By.xpath("//input[@id='createContactForm_personalTitle']")).sendKeys("Hi,Everyone");


		//title
		//	driver.findElement(By.xpath("//input[@id='createContactForm_generalProfTitle']")).sendKeys("Create contact");

		//department name
		//	driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Test Engineer");

		//preferred currency
		//		WebElement element = driver.findElement(By.xpath("//select[@id='createContactForm_preferredCurrencyUomId']"));
		//		Select cur=new Select(element);
		//		cur.selectByValue("DZD");

		//description
		//.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Automation project");

		//important note
		//	driver.findElement(By.xpath("//textarea[@id='createContactForm_importantNote']")).sendKeys("Send the data for all mandatory fields ");


		//countrycode
		//		WebElement element2 = driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneCountryCode']"));
		//		element2.clear();
		//		element2.sendKeys("91");


		//area code
		//driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneAreaCode']")).sendKeys("01");

		//phone number
		//driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneNumber']")).sendKeys("8912346517");

		//extension
		//driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneExtension']")).sendKeys("oct 01");

		//Person to Ask For
		//driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneAskForName']")).sendKeys("pandiyan");

		//email
		//driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("friends@gmail.com");

		//primary address
		//to name
		//driver.findElement(By.xpath("//input[@id='generalToNameField']")).sendKeys("kani");

		//attention name
		//driver.findElement(By.xpath("//input[@id='createContactForm_generalAttnName']")).sendKeys("vairavan");

		//address1
		//driver.findElement(By.xpath("//input[@id='createContactForm_generalAddress1']")).sendKeys("Andakottai");

		//address2
		//driver.findElement(By.xpath("//input[@id='createContactForm_generalAddress2']")).sendKeys("peravurani");

		//city
		//	driver.findElement(By.xpath("//input[@id='createContactForm_generalCity']")).sendKeys("Thanjavur");

		//state
		//		WebElement element3 = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		//		Select state=new Select(element3);
		//		state.selectByValue("WY");

		//postal code
		//	driver.findElement(By.xpath("//input[@id='createContactForm_generalPostalCode']")).sendKeys("614523");

		//country
		//		WebElement element4 = driver.findElement(By.xpath("//select[@id='createContactForm_generalCountryGeoId']"));
		//		Select id=new Select(element4);
		//		id.selectByVisibleText("Aruba");

		//postal code extension
		//driver.findElement(By.xpath("//input[@id='createContactForm_generalPostalCodeExt']")).sendKeys("oct 5");

		//click create contact
		//driver.findElement(By.xpath("//input[@name='submitButton']")).click();


		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver=new ChromeDriver();
		// driver.get("http://leaftaps.com/opentaps/control/main");


		// Loginpage lp=new Loginpage(driver);
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		// driver.findElement(By.xpath("//div[@id='button']")).click();


		// Homepage hp=new Homepage(driver);
		// driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// company name
		// driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Tristha");

		// firstname
		// driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sowmiya");

		// lastname
		// driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("A");

		// source
		// WebElement element =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		// Select source=new Select(element);
		// source.selectByValue("LEAD_COLDCALL");

		// marketing campaign
		// WebElement element2 =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		// Select market=new Select(element2);
		// market.selectByValue("CATRQ_AUTOMOBILE");

		// firstname local
		// driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ayyadurai");

		// lastname local
		// driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("S");

		// salutation
		// driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Hi");

		// title
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("TGPL
		// company");

		// department
		// driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Automtion");

		// Annual revenue
		// driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("10000");

		// preferred currency
		// WebElement element3 =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']"));
		// Select currency=new Select(element3);
		// currency.selectByValue("SVC");

		// industry
		// WebElement element4 =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		// Select industry=new Select(element4);
		// industry.selectByValue("IND_SOFTWARE");

		// number of employees
		// driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("600");


		// sic code
		// driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("346");

		// description
		// driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Hi ,I am sowmiya");

		// important note

		// driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("Please check all field is fill or not");

		// contact information

		// country code
		// WebElement element6 =
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']"));
		// element6.clear();
		// element6.sendKeys("+91");

		// area code
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("12");

		// phone number
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9856548765");

		// extension
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("30
		// sep");

		// phone ask for me
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("Aravind");

		// email
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sowmi@gmail.com");

		// web url
		// driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("https://testleaf.com");


		// primary address
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("sowmiya");

		// attention name
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("ayyadurai");

		// address1
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("trichy");

		// address2
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("chennai");

		// city
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("city");

		// state
		// WebElement element7 =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		// Select state=new Select(element7);
		// state.selectByValue("SC");


		// postal code
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("652431");

		// country
		// WebElement element8 =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		// Select country=new Select(element8);
		// country.selectByVisibleText("Samoa");

		// zip postal code
		// driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("sep
		// 15");

		// driver.findElement(By.xpath("//input[@name='submitButton']")).click();


	}

}
