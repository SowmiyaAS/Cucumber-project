package Jvmaccount;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Accountjvm {

	public static void Account(String filepath)
	{	
		File f = new File("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\Accountjvm");

		Configuration c= new Configuration(f, "Account");

		c.addClassifications("Account", "Testleaf");


		List<String> l=new ArrayList<>();
		l.add(filepath);

		ReportBuilder rb=new ReportBuilder(l, c);

		rb.generateReports();


	}

}