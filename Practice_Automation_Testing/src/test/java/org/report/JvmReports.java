package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static void cearteJVMReport(String filepath) {
		// file path where to  create the report
File f = new File("C:\\Users\\tgt587\\eclipse-workspace\\Practice_Automation_Testing\\JVM-Report");
// config class used to name the report and configuration 
Configuration c= new Configuration(f, "Swaglabs-Report");
c.addClassifications("PlatForm", "Windows");
c.addClassifications("Automation Project Done by", "Jagadesh");
c.addClassifications("Support Team", "Prabu,Nithish,Pandiyan,Sathya and Manoj");
//locate the json report file path in list 
List<String> l= new ArrayList<String>();
l.add(filepath);
//to build the jvm report
ReportBuilder r =new ReportBuilder(l, c);
r.generateReports();

	}
}
