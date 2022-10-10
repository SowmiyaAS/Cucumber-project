package org.Hooksfile;

import org.BaseClass.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import Jvmaccount.Accountjvm;


public class Accounthooks extends Base_Class{

	public static WebDriver driver;
	@BeforeClass
	public static void setup()
	{
	 driver= Base_Class.browser_configuration("chrome");
	}
	
	@AfterClass
	
	public static void teardown()
	{
		driver.close();
		
Accountjvm.Account("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\jsonreport1\\account1.json");
	}
	
	
	
	
	
}
