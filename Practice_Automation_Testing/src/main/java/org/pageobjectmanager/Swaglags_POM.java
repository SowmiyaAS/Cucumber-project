package org.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.pageobjectmodel.Swaglabs_Pd;
import org.pageobjectmodel.Swaglabs_hp;

public class Swaglags_POM {
	
	public WebDriver driver;
	
	private Swaglabs_hp shp;

	private Swaglabs_Pd spd;
	
	public Swaglags_POM(WebDriver driver2) {
		this.driver=driver2;
	}

	public Swaglabs_hp getShp() {
		if (shp == null) {
			shp = new Swaglabs_hp(driver);
			
		}
		return shp;
	}

	public Swaglabs_Pd getSpd() {
		
		if (spd == null) {
			spd =new Swaglabs_Pd(driver);
			
		}
		return spd;
	}

}
