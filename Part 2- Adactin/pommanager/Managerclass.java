package org.pommanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pomclass.Adactinbooknowpage;
import org.pomclass.Adactincontpage;
import org.pomclass.Adactinhomepage;
import org.pomclass.Adactinlogin;
import org.pomclass.Adactinsearchpage;

public class Managerclass {

	public WebDriver driver;//null 
	// private class object
	private Adactinlogin al;

	

	public Managerclass(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
		
	}

//	public Adactinlogin Instance_getAl() {
//
//		al = new Adactinlogin(driver);
//
//		return al;
	//}
	public Adactinlogin Instance_getAl()
	{
		al=new Adactinlogin(driver);
		return al;
	}
	
	
	
private Adactinsearchpage as;
	

	public Adactinsearchpage getAs() {
		
		as=new Adactinsearchpage(driver);
		
		
		return as;
	}
	
	
	private Adactincontpage ac;

	public Adactincontpage getAc() {

		ac = new Adactincontpage(driver);

		return ac;
	}

	private Adactinbooknowpage ab;

	public Adactinbooknowpage getAb() {

		ab = new Adactinbooknowpage(driver);
		return ab;
	}

	

}
