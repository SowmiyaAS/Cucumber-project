package org.runnerclass;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.basecalss.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pomclass.Homepage;
import org.pomclass.Loginpage;
import org.pomclass.Paymenttouser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClassCyclos extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");
	
	public static Loginpage lp = new Loginpage(driver);
	
	public static Homepage hp = new Homepage(driver);
	
	public static Paymenttouser pt = new Paymenttouser(driver);

	public static void main(String[] args) throws Throwable {

		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * ChromeDriver driver = new ChromeDriver();
		 */

		// driver.get("https://demo.cyclos.org/ui/home");

		getUrl("https://demo.cyclos.org/ui/home");

		// driver.get("https://demo.cyclos.org/ui/login");

		// driver.findElement(By.xpath("https://demo.cyclos.org/ui/login")).click();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click login

		//Loginpage lp = new Loginpage(driver);

		// driver.findElement(By.xpath("//a[@id='login-link']")).click();
		clickonElement(lp.getLogin());
	//	Homepage hp = new Homepage(driver);

		// driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("demo");

		inputvalueelement(hp.getUsername(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\src\\test\\java\\Cyloslogin.xlsx", 0, 1));

		// driver.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("1234");

		inputvalueelement(hp.getPassword(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\src\\test\\java\\Cyloslogin.xlsx", 1, 1));

		// driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		clickonElement(hp.getSubmit());

		// driver.findElement(By.xpath("//div[@class='quick-access-icon']")).click();

		clickonElement(hp.getPayuser());

		//Paymenttouser pt = new Paymenttouser(driver);

		// driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']")).click();
		clickonElement(pt.getContactlist());

		// driver.findElement(By.xpath("(//div[@class='mb-2']/a)[1]")).click();
		clickonElement(pt.getSelectcontact());

		// driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("2");

		inputvalueelement(pt.getEnteramt(), "2");

		// driver.findElement(By.xpath("//button[@title='Pay now']")).click();

		clickonElement(pt.getClickschedule());
		// driver.findElement(By.xpath("(//div[@class='dropdown-menu
		// show']/a)[1]")).click();

		clickonElement(pt.getClickpaynow());

		// driver.findElement(By.xpath("(//div[@class='d-flex
		// label-value-value'])[5]/textarea")).sendKeys("hi tristha");

		inputvalueelement(pt.getDescription(), "hi tristha");

		// driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

		clickonElement(pt.getClicknxt());

		// driver.findElement(By.xpath("//span[text()='Confirm']")).click();

		clickonElement(pt.getClickconfirm());

	}

}
