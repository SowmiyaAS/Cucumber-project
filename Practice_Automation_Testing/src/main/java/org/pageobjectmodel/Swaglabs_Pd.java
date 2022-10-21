package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglabs_Pd {
	public WebDriver driver;
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement SauceLabsBackpack;
	@FindBy(xpath = "(//button[text()='Add to cart'])[3]") private WebElement SauceLabsBoltTShirt;
	@FindBy(xpath = "(//button[text()='Add to cart'])[5]") private WebElement SauceLabsOnesie;
	@FindBy(xpath = "//a[contains(@class,'shopping_cart_')]") private WebElement Shopingcartbutton;
	@FindBy(id = "checkout") private WebElement checkoutbutton;
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement Lastname;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']") private WebElement Zipcode;
	@FindBy(id = "continue") private WebElement continuebutton;
	@FindBy(id = "finish") private WebElement Finishbutton;
	
	
	
	public Swaglabs_Pd(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFinishbutton() {
		return Finishbutton;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public void setZipcode(WebElement zipcode) {
		Zipcode = zipcode;
	}
	public WebElement getSauceLabsBackpack() {
		return SauceLabsBackpack;
	}
	public WebElement getSauceLabsBoltTShirt() {
		return SauceLabsBoltTShirt;
	}
	public WebElement getSauceLabsOnesie() {
		return SauceLabsOnesie;
	}
	public WebElement getShopingcartbutton() {
		return Shopingcartbutton;
	}
	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getZipcode() {
		return Zipcode;
	}
}
