package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage {
 public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@class='decorativeSubmit']") private WebElement clicklogin;
	@FindBy(xpath = "//div[@id='button']") private WebElement crmsfa;
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement account;
	@FindBy(xpath = "//a[text()='Create Account']") private WebElement cerateaccount;
	public Accountpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClicklogin() {
		return clicklogin;
	}
	public WebElement getCrmsfa() {
		return crmsfa;
	}
	public WebElement getAccount() {
		return account;
	}
	public WebElement getCerateaccount() {
		return cerateaccount;
	}


}
