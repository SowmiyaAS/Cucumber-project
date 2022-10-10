package org.Testrunner;

import org.BaseClass.Base_Class;
import org.Jvmreport.JvmReportTestleaf;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\Feature\\Testleaf.feature",
		glue = "org.StepDefinition",
		
		dryRun = false,
		monochrome = true,
		
	tags = "@sanity or @smoke or  @Rgression",
	
	plugin = {"json:C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\jsonreport\\testleafproject.json" ,
			
			"html:C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\htmlreport\\teatleafproject.html"
			
	},
	
	
	
		
		
	snippets = SnippetType.CAMELCASE
		
		)


public class Leadrunner {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setup()
	{
		 driver = Base_Class.browser_configuration("chrome");
	}
	
	@AfterClass
public static void teardown()
{
		driver.close();
	JvmReportTestleaf.createjvmreport("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\jsonreport\\testleafproject.json");
}
}
