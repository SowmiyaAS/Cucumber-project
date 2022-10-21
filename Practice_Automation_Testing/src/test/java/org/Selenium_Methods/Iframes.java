package org.Selenium_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions in = new ChromeOptions();
		in.addArguments("incognito");
		WebDriver driver = new ChromeDriver(in);
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//SingleFrame
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pal Pandiyan");
		driver.switchTo().defaultContent();
		
		//MultipleFrames
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement d = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(d);
		
		WebElement i = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(i);
		
		WebElement t1 = driver.findElement(By.xpath("//input[@type='text']"));
		t1.sendKeys("Tamil King");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
