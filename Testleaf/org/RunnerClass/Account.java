package org.RunnerClass;

import java.util.concurrent.TimeUnit;

import org.BaseClass.Base_Class;
import org.Pomclass.Accountpage;
import org.Pomclass.Accountpage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account extends Base_Class {
	
	public static WebDriver driver=browser_configuration("chrome");
	public static Accountpage ap=new Accountpage(driver);
	public static Accountpage1 ap1=new Accountpage1(driver);

	public static void main(String[] args) {
		getUrl("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		inputvalueelement(ap.getUsername(), "demosalesmanager");
		inputvalueelement(ap.getPassword(), "crmsfa");
		clickonElement(ap.getClicklogin());
		clickonElement(ap.getCrmsfa());
		clickonElement(ap.getAccount());
		clickonElement(ap.getCerateaccount());
		
		
		inputvalueelement(ap1.getAccname(), "sowmiya");
		inputvalueelement(ap1.getAccdesc(), "check all fields fill or not");
		inputvalueelement(ap1.getAreacode(), "09");
		inputvalueelement(ap1.getEmail(), "saso@gmail.com");
		inputvalueelement(ap1.getToname(), "kavin");
		inputvalueelement(ap1.getState(), "AA");
		inputvalueelement(ap1.getCountryid(), "ARG");
		clickonElement(ap1.getSubmit());
		
		
		
		
		
		
		
		
		
		
		
		
	
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();

		//driver.get("http://leaftaps.com/opentaps/control/main");
		
		
//		Accountpage ap=new Accountpage(driver);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		

	//	driver.findElement(By.xpath("//div[@id='button']")).click();
		
		
		//driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//Accountpage1 ap1=new Accountpage1(driver);
				//account name
				//driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("sowmiya");
			
				//description
				//driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("check all fields fill or not");
				
				//area code
			//	driver.findElement(By.xpath("//input[@id='primaryPhoneAreaCode']")).sendKeys("09");
				
				//email
			//	driver.findElement(By.xpath("//input[@id='primaryEmail']")).sendKeys("saso@gmail.com");
				
				//to name
				
			//	driver.findElement(By.xpath("//input[@id='generalToName']")).sendKeys("kavin");
				
				//state
//				WebElement element = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
//				Select state=new Select(element);
//				state.selectByValue("AA");
				
				//country
//				WebElement element2 = driver.findElement(By.xpath("//select[@id='generalCountryGeoId']"));
//				Select country=new Select(element2);
//				country.selectByValue("ARG");
				
				
				//submit
				//driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		
	}

}
