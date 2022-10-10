package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
	
	public static void CreatejvmReport(String filePath)
	{
		
		File f=new File("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Jvmreport");
		
		Configuration c = new Configuration(f, "TestLeaf");
		
		c.addClassifications("adactinjvm Report", " Windows10");
		
		List<String> list=new ArrayList<>();
		
		list.add(filePath);
		
		//report filter
		
		ReportBuilder rb=new ReportBuilder(list, c);
		
		rb.generateReports();
	}

}
