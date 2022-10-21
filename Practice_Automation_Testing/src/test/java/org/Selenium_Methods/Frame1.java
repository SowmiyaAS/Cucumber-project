package org.Selenium_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Naveen kumar\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		driver.switchTo().frame("singleframe");

		WebElement t = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement f = t;
		f.sendKeys("Pal pandyian");

		driver.switchTo().defaultContent();

		// MulitipleFrames

		WebElement x = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		x.click();

		WebElement d = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(d); // outer frame.

		WebElement i = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

		driver.switchTo().frame(i);

		WebElement t1 = driver.findElement(By.xpath("//input[@type='text']"));
		t1.sendKeys("Tamil King");

		driver.close();
		
		

	}
}