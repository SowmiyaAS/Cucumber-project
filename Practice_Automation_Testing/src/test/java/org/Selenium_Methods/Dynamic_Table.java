package org.Selenium_Methods;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Table {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions in = new ChromeOptions();
		in.addArguments("incognito");
		WebDriver driver = new ChromeDriver(in);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> companiesprices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		for (int i = 0; i < companynames.size(); i++) {
			if (companynames.get(i).getText().equalsIgnoreCase("Tasty Bite")) {
				
				System.out.println("Company Name = "+companynames.get(i).getText());
				System.out.println("Company Price = "+companiesprices.get(i).getText());
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
