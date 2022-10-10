package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {

	public WebDriver driver;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement clickcontact;
	@FindBy(xpath = "//a[text()='Create Contact']")
	private WebElement clickcreatecontact;
	@FindBy(xpath = "//input[@id='firstNameField']")
	private WebElement fname;
	@FindBy(xpath = "//input[@id='lastNameField']")
	private WebElement lname;
	@FindBy(xpath = "//input[@id='createContactForm_personalTitle']")
	private WebElement salutation;
	@FindBy(xpath = "//input[@id='createContactForm_generalProfTitle']")
	private WebElement title;
	@FindBy(xpath = "//input[@id='createContactForm_departmentName']")
	private WebElement deptname;
	@FindBy(xpath = "//select[@id='createContactForm_preferredCurrencyUomId']")
	private WebElement currencyid;
	@FindBy(xpath = "//textarea[@id='createContactForm_description']")
	private WebElement createdesc;

	@FindBy(xpath = "//textarea[@id='createContactForm_importantNote']")
	private WebElement note;
	@FindBy(xpath = "//input[@id='createContactForm_primaryPhoneCountryCode']")
	private WebElement ccode;
	@FindBy(xpath = "//input[@id='createContactForm_primaryPhoneAreaCode']")
	private WebElement Acode;
	@FindBy(xpath = "//input[@id='createContactForm_primaryPhoneNumber']")
	private WebElement Pnumber;
	@FindBy(xpath = "//input[@id='createContactForm_primaryPhoneExtension']")
	private WebElement pextension;
	@FindBy(xpath = "//input[@id='createContactForm_primaryPhoneAskForName']")
	private WebElement Paskforme;
	@FindBy(xpath = "//input[@id='createContactForm_primaryEmail']")
	private WebElement Pemail;
	@FindBy(xpath = "//input[@id='generalToNameField']")
	private WebElement Toname;
	@FindBy(xpath = "//input[@id='createContactForm_generalAttnName']")
	private WebElement Attnname;
	@FindBy(xpath = "//input[@id='createContactForm_generalAddress1']")
	private WebElement Add1;
	@FindBy(xpath = "//input[@id='createContactForm_generalAddress2']")
	private WebElement Add2;
	@FindBy(xpath = "//input[@id='createContactForm_generalCity']")
	private WebElement Generalcity;
	@FindBy(xpath = "//select[@id='createContactForm_generalStateProvinceGeoId']")
	private WebElement stateid;
	@FindBy(xpath = "//input[@id='createContactForm_generalPostalCode']")
	private WebElement pcode;
	@FindBy(xpath = "//select[@id='createContactForm_generalCountryGeoId']")
	private WebElement Countryid;
	@FindBy(xpath = "//input[@id='createContactForm_generalPostalCodeExt']")
	private WebElement codeextension;
	@FindBy(xpath = "//input[@name='submitButton']")
	private WebElement contactsubmit;

	

	public Contactpage(WebDriver driver2) {
		
        this.driver=driver2;
        PageFactory.initElements(driver, this);
	}

	public WebElement getClickcontact() {
		return clickcontact;
	}

	public WebElement getClickcreatecontact() {
		return clickcreatecontact;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getSalutation() {
		return salutation;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDeptname() {
		return deptname;
	}

	public WebElement getCurrencyid() {
		return currencyid;
	}

	public WebElement getCreatedesc() {
		return createdesc;
	}

	public WebElement getNote() {
		return note;
	}

	public WebElement getCcode() {
		return ccode;
	}

	public WebElement getAcode() {
		return Acode;
	}

	public WebElement getPnumber() {
		return Pnumber;
	}

	public WebElement getPextension() {
		return pextension;
	}

	public WebElement getPaskforme() {
		return Paskforme;
	}

	public WebElement getPemail() {
		return Pemail;
	}

	public WebElement getToname() {
		return Toname;
	}

	public WebElement getAttnname() {
		return Attnname;
	}

	public WebElement getAdd1() {
		return Add1;
	}

	public WebElement getAdd2() {
		return Add2;
	}

	public WebElement getGeneralcity() {
		return Generalcity;
	}

	public WebElement getStateid() {
		return stateid;
	}

	public WebElement getPcode() {
		return pcode;
	}

	public WebElement getCountryid() {
		return Countryid;
	}

	public WebElement getCodeextension() {
		return codeextension;
	}

	public WebElement getContactsubmit() {
		return contactsubmit;
	}

}
