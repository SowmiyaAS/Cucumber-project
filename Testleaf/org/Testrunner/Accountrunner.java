package org.Testrunner;

import org.BaseClass.Base_Class;

import org.Jvmreport.JvmReportTestleaf;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Jvmaccount.Accountjvm;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(  features = "src\\test\\java\\Feature\\Account.feature" ,

glue = "org.AccountStepdefinition",

dryRun = false ,
monochrome = true,

tags = "@sanity or @smoke or @Regression",

plugin = {"pretty" ,  

		"html:C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\htmlreport1\\account.html",

		"json:C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\jsonreport1\\account1.json",

		"junit:C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\junitreport\\acc.xml"


}


		)

public class Accountrunner {

	public static WebDriver driver;
	@BeforeClass
	public static void setup()
	{

		driver = Base_Class.browser_configuration("chrome");

	}

	@AfterClass

	public static void teardown() {


		driver.close();

		Accountjvm.Account("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\jsonreport1\\account1.json");
	}
}


