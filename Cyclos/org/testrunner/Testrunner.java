package org.testrunner;

import org.basecalss.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\Feature\\cyclos.feature",

		glue = "org.stepdefinition",

		dryRun = false, monochrome = true ,
		
		//plugin = "html:C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\htmlreport\\Cyclosproject.html" 
		
		 plugin= "json:C:\\\\Users\\\\tgt593\\\\eclipse-workspace1\\\\CyclosProject\\\\jsonreport\\\\Cyclosproject.json"
		

)

public class Testrunner {

	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setup() {
		driver = Base_Class.browser_configuration("chrome");
		
	}

	@AfterClass
	
	public static void teardown() {
		driver.close();
	}
}
