package org.Selenium_Methods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Dropdown12 {
	
	
	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement go = driver.findElement(By.id("superheros"));
		Select s = new Select(go);
		
		if (s.isMultiple())
		{
			System.out.println("This dropdown is Mulitiple");
			s.selectByVisibleText("Batman");
			s.selectByVisibleText("Captain America");
			s.selectByVisibleText("Doc Savage");
		}
		else
		{
			System.out.println("This dropdown is not Mulitiple");
		}
		
	
		WebElement go1 = driver.findElement(By.id("fruits"));
		Select s1 = new Select(go1);
		
	if (s1.isMultiple())
	{
		System.out.println("This dropdown is Mulitiple2");
	}
	else 
	{
			System.out.println("This dropdown is not Mulitiple2");
		s1.selectByVisibleText("Banana");
		
		System.out.println(s1.getFirstSelectedOption().getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
