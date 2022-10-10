package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Accountpage1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='accountName']") private WebElement accname;
	@FindBy(xpath = "//textarea[@name='description']") private WebElement accdesc;
	@FindBy(xpath = "//input[@id='primaryPhoneAreaCode']") private WebElement areacode;
	@FindBy(xpath = "//input[@id='primaryEmail']") private WebElement email;
	@FindBy(xpath = "//input[@id='generalToName']") private WebElement toname;
	@FindBy(xpath = "//select[@id='generalStateProvinceGeoId']") private WebElement state;
	@FindBy(xpath = "//select[@id='generalCountryGeoId']") private WebElement countryid;
	@FindBy(xpath = "//input[@type='submit']") private WebElement submit;
	public Accountpage1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAccname() {
		return accname;
	}
	public WebElement getAccdesc() {
		return accdesc;
	}
	public WebElement getAreacode() {
		return areacode;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getToname() {
		return toname;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountryid() {
		return countryid;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
