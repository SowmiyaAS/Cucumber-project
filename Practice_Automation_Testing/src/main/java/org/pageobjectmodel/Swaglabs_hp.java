package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglabs_hp {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Username']") private WebElement username;

	@FindBy(id = "password") private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']") private WebElement login;
	
	
	
	public Swaglabs_hp(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
