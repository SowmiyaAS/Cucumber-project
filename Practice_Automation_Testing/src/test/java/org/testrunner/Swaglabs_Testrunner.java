package org.testrunner;

import org.baseclass.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.report.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\org\\featurefile\\Swaglags.feature", glue = "org.stepdefenition", monochrome = true,

		publish = true,

		plugin = { "pretty", "html:Html_Report/Adactin.html", "json:Jason_Report/Adactin.json",
				"junit:Junit_Report/Adactin.junit" }

)

public class Swaglabs_Testrunner {
      public static WebDriver driver;
      
      @BeforeClass
      public static void Setup() {
    	  driver=Base_Class.browser_configuration("chrome");
      }
      @AfterClass
      public static void Teardown() {
    	  driver.close();
    	  //JvmReports.cearteJVMReport("C:\\Users\\tgt587\\eclipse-workspace\\Practice_Automation_Testing\\Jason_Report\\Adactin.json");
      }

}
