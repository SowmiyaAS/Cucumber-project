package org.Jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportTestleaf {
	
	public static void createjvmreport(String filepath)
	{
		
	File f=new File("C:\\Users\\tgt593\\eclipse-workspace1\\Testleaf\\JvmReport");
	Configuration c=new Configuration(f, "Testleaf");
	
	
	c.addClassifications("Testleaf", "CRM applicaton");
	
	
	List<String> L=new ArrayList<>();
	
	L.add(filepath);
	
	
	//report build
	ReportBuilder rb=new ReportBuilder(L, c);
	
	
	rb.generateReports();
	}
}
