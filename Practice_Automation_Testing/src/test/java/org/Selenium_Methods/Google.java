package org.Selenium_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

		


	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebElement iframess = driver.findElement(By.id("iframe"));
		driver.switchTo().frame(iframess);
		WebElement map = driver.findElement(By.xpath("(//li)[3]"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(map));
		map.click();
		
		
		//span[text()='Maps']
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
