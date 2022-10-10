package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@class='decorativeSubmit']") private WebElement submit;
	@FindBy(xpath = "//div[@id='button']") private WebElement crmsfabutton;
	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCrmsfabutton() {
		return crmsfabutton;
	}
			
			

}
