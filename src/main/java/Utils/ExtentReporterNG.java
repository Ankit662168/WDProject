package Utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseTest.baseclass;
import Utils.ReadConfig;



public class ExtentReporterNG extends baseclass {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject()  
	{

		//String datename = new SimpleDateFormat("MMddyyyyhhmmss").format(new Date());
		//String path = System.getProperty("user.dir")+"\\Reports\\"+ datename + "CPOtests.html";
		String path =System.getProperty("user.dir")+"/Testexecutedreports/Testreport.html";
        ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
        reporter.config().setReportName("Western Digital Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");
      
       
        
        reporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");   // add this line 

        
        extent =new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Scripts Executed in Env.", "STAGE");
        extent.setSystemInfo("Selenium Version", "4.0.0");
        extent.setSystemInfo("Extent reports Version","3.1.1");
        extent.setSystemInfo("Executed By", "Automationteam");
        extent.setSystemInfo("Browser", "Chrome");
         reporter.config().setTheme(Theme.DARK);
        reporter.config().setCSS(".r-img { width: 80%; }");
        reporter.config().setCSS("p{font-size:50px;}");
        reporter.config().setCSS("p{font-color:blue;}");
        reporter.config().setChartVisibilityOnOpen(true);
        return extent;
        
        
}

		
	}
	
	/*
	public static ExtentReports getReportObject() throws IOException
	{
		Excelreuse e = new Excelreuse();
		BaseClass b = new BaseClass();
		ArrayList data = e.getData(b.prop.getProperty("models"));
		String path =System.getProperty("user.dir")+"\\Testexecutedreports\\ICARNCAREnglish.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("NCI_ICAR Web Automation Test Results");
		reporter.config().setDocumentTitle("ICAR Web Automation Test Results");
		
		 extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Moulidharan");
		return extent;
		
	}*/
	
	
	
	

