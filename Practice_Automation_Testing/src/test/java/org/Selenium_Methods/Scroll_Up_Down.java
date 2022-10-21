package org.Selenium_Methods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Up_Down {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		driver.manage().window().maximize();

		Thread.sleep(10000);
		// (JavascriptExecutor)=small interface, (driver)=Larger interface. here the
		// Larger interface is converted into smaller interface
		JavascriptExecutor js = (JavascriptExecutor) driver; // Narrowing type casting

		// Finding webelement to scroll down from the web page
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Disclaimer']")); // Web element method to find the particular web element.
		js.executeScript("arguments[0].scrollIntoView();", scroll);
        Thread.sleep(2000);
        driver.close();
       
	}

}
