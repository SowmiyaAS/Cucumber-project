package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement lead;
	@FindBy(xpath = "//a[text()='Create Lead']")
	private WebElement createlead;
	@FindBy(xpath = "//input[@id='createLeadForm_companyName']")
	private WebElement companyname;
	@FindBy(xpath = "//input[@id='createLeadForm_firstName']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='createLeadForm_lastName']")
	private WebElement lastname;
	@FindBy(xpath = "//select[@id='createLeadForm_dataSourceId']")
	private WebElement sourceid;
	@FindBy(xpath = "//select[@id='createLeadForm_marketingCampaignId']")
	private WebElement campaignid;
	@FindBy(xpath = "//input[@id='createLeadForm_firstNameLocal']")
	private WebElement fnlocal;
	@FindBy(xpath = "//input[@id='createLeadForm_lastNameLocal']")
	private WebElement lnlocal;
	@FindBy(xpath = "//input[@id='createLeadForm_personalTitle']")
	private WebElement persontitle;
	@FindBy(xpath = "//input[@id='createLeadForm_generalProfTitle']")
	private WebElement proftitle;
	@FindBy(xpath = "//input[@id='createLeadForm_departmentName']")
	private WebElement departmentname;
	@FindBy(xpath = "//input[@id='createLeadForm_annualRevenue']")
	private WebElement annualrevenue;

	@FindBy(xpath = "//select[@id='createLeadForm_currencyUomId']")
	private WebElement currencyid;
	@FindBy(xpath = "//select[@id='createLeadForm_industryEnumId']")
	private WebElement industryenumid;
	@FindBy(xpath = "//input[@id='createLeadForm_numberEmployees']")
	private WebElement numberofemp;


	@FindBy(xpath = "//input[@id='createLeadForm_sicCode']")
	private WebElement siccode;
	@FindBy(xpath = "//textarea[@id='createLeadForm_description']")
	private WebElement description;
	@FindBy(xpath = "//textarea[@id='createLeadForm_importantNote']")
	private WebElement importantnote;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryPhoneCountryCode']")
	private WebElement phonecountrycode;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryPhoneAreaCode']")
	private WebElement areacode;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryPhoneNumber']")
	private WebElement phonenumber;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryPhoneExtension']")
	private WebElement phoneextension;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryPhoneAskForName']")
	private WebElement askforme;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryEmail']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='createLeadForm_primaryWebUrl']")
	private WebElement weburl;
	@FindBy(xpath = "//input[@id='createLeadForm_generalToName']")
	private WebElement toname;
	@FindBy(xpath = "//input[@id='createLeadForm_generalAttnName']")
	private WebElement attentionname;
	@FindBy(xpath = "//input[@id='createLeadForm_generalAddress1']")
	private WebElement address1;
	@FindBy(xpath = "//input[@id='createLeadForm_generalAddress2']")
	private WebElement address2;
	@FindBy(xpath = "//input[@id='createLeadForm_generalCity']")
	private WebElement city;
	@FindBy(xpath = "//select[@id='createLeadForm_generalStateProvinceGeoId']")
	private WebElement state;
	@FindBy(xpath = "//input[@id='createLeadForm_generalPostalCode']")
	private WebElement postalcode;
	@FindBy(xpath = "//select[@id='createLeadForm_generalCountryGeoId']")
	private WebElement countrycode;
	@FindBy(xpath = "//input[@id='createLeadForm_generalPostalCodeExt']")
	private WebElement codeexit;
	@FindBy(xpath = "//input[@name='submitButton']")
	private WebElement submit;
	public Homepage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLead() {
		return lead;
	}
	public WebElement getCreatelead() {
		return createlead;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getSourceid() {
		return sourceid;
	}
	public WebElement getCampaignid() {
		return campaignid;
	}
	public WebElement getFnlocal() {
		return fnlocal;
	}
	public WebElement getLnlocal() {
		return lnlocal;
	}
	public WebElement getPersontitle() {
		return persontitle;
	}
	public WebElement getProftitle() {
		return proftitle;
	}
	public WebElement getDepartmentname() {
		return departmentname;
	}
	public WebElement getAnnualrevenue() {
		return annualrevenue;
	}
	public WebElement getCurrencyid() {
		return currencyid;
	}
	public WebElement getIndustryenumid() {
		return industryenumid;
	}
	public WebElement getNumberofemp() {
		return numberofemp;
	}


	
	public WebElement getSiccode() {
		return siccode;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getImportantnote() {
		return importantnote;
	}
	public WebElement getPhonecountrycode() {
		return phonecountrycode;
	}
	public WebElement getAreacode() {
		return areacode;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getPhoneextension() {
		return phoneextension;
	}
	public WebElement getAskforme() {
		return askforme;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getWeburl() {
		return weburl;
	}
	public WebElement getToname() {
		return toname;
	}
	public WebElement getAttentionname() {
		return attentionname;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPostalcode() {
		return postalcode;
	}
	public WebElement getCountrycode() {
		return countrycode;
	}
	public WebElement getCodeexit() {
		return codeexit;
	}
	public WebElement getSubmit() {
		return submit;
	}
}
