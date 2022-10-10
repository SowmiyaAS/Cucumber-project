package org.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='gb_yf']/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@role='presentation'])[2]")));
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		
		
		
	}

}
