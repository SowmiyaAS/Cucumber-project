package org.pommanager;

import org.Pomclass.Contactpage;
import org.Pomclass.Homepage;
import org.Pomclass.Loginpage;
import org.openqa.selenium.WebDriver;

public class Managerclass {
  
	
	public WebDriver driver;
	
	
	 private Loginpage lp;
	 private Homepage hp;
	
	private Contactpage cp;
	 
	public Managerclass(WebDriver driver2) {

this.driver=driver2;
		
		
	}
	public Loginpage Instance_getLp() {
		lp=new Loginpage(driver);
		return lp;
	}
	public Homepage Instance_getHp() {
		
		hp=new Homepage(driver);
		return hp;
	}
	 public Contactpage Instance_getCp() {
		 
		 cp=new Contactpage(driver);
			return cp;
		}
	 
	 
	 
	 
	
	
}
  