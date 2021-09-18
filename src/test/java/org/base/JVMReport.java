package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void main(String[] args) {
		String s=System.getProperty("user.dir");
		System.out.println(s);

	}
public static void generateJVMReport(String json) {
	File f=new File("C:\\Users\\91897\\eclipse-workspace\\CUCUMBER1\\src\\test\\resources\\Reports\\JVMReport");
	Configuration c=new Configuration(f, "Amazon");
	c.addClassifications("browser", "chrome");
	c.addClassifications("os", "windows");
	c.addClassifications("version", "10");
	List<String> jsonfiles=new ArrayList<String>();
	jsonfiles.add(json);
	ReportBuilder r=new ReportBuilder(jsonfiles, c);
	r.generateReports();
	}

}
