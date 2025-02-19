/**
 * 
 */

  
  
  package Utils;
  
  import java.io.File; 
  import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType; 
  import org.openqa.selenium.TakesScreenshot;
  import org.openqa.selenium.WebDriver;
  
  import com.aventstack.extentreports.ExtentReports;
  import com.aventstack.extentreports.ExtentTest; 
  import com.aventstack.extentreports.Status; 
  import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
  
 /**
	 * @author rb00583711
	 *
	 */
		  public class ExtendReports_Screenshots {
		  
		  WebDriver driver;
		  
		  public ExtendReports_Screenshots(WebDriver driver) {
		  
		  this.driver=driver;
		  
		  }
		  
		  public void Reports1() throws IOException {
		  
		  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/cpo.html");
		  
		  ExtentReports extent = new ExtentReports();
		  
		  extent.attachReporter(reporter);
		  
		  ExtentTest logger = extent.createTest("SetUp"); 
		  logger.log(Status.INFO, "Opening Pre owned certified cars portal");
		  logger.log(Status.PASS,  "Pre owned certified cars portal");
		  logger.addScreenCaptureFromPath("C:/Users/rb00583711/IdeaProjects/SeleniumUI/Sreenshots/HomePage.jpg");
		  extent.flush(); 
		  }
		  
		  
		  public void Reports2() throws IOException {
		  
		  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/cpo.html");
		  
		  ExtentReports extent = new ExtentReports();
		  
		  extent.attachReporter(reporter);
		  
		  ExtentTest logger2 = extent.createTest("LoginNegativeTC");
		  logger2.log(Status.INFO, "Verifying error messages");
		  logger2.log(Status.PASS, "Verification Sucess");
		  logger2.addScreenCaptureFromPath( "C:/Users/AG00825147/eclipse-workspace/WDAutomatioFramework/screenshot/NegativeScenario.jpg");
		  extent.flush(); 
		  }
		  
		  
		  
		  public void Reports3() throws IOException {
		  
		  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/cpo.html");
		  
		  ExtentReports extent = new ExtentReports();
		  
		  extent.attachReporter(reporter);
		  
		  ExtentTest logger3 = extent.createTest("LoginNegativeTC");
		  logger3.log(Status.INFO, "Verifying error messages");
		  logger3.log(Status.PASS, "Verification Sucess");
		  logger3.addScreenCaptureFromPath("C:/Users/AG00825147/eclipse-workspace/WDAutomatioFramework/screenshot/NegativeScenario.jpg");
		  extent.flush(); 
		  }
		  
		  
		  
		  public void Reports4() throws IOException {
		  
		  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/cpo.html");
		  
		  ExtentReports extent = new ExtentReports();
		  
		  extent.attachReporter(reporter);
		  
		  ExtentTest logger4 = extent.createTest("LoginNegativeTC");
		  logger4.log(Status.INFO, "Verifying error messages");
		  logger4.log(Status.PASS, "Verification Sucess");
		  logger4.addScreenCaptureFromPath(  "C:/Users/AG00825147/eclipse-workspace/WDAutomatioFramework/screenshots/NegativeScenario.jpg");
		  extent.flush(); 
		  }
		  
		
		  
		  
		  
		  
			/*
			 * public void Screenshot1() throws IOException { 
			 * TakesScreenshot ts = (TakesScreenshot)driver; 
			 * File source = ts.getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(source, new File("./Sreenshots/LoginPage.png")); }
			 * 
			 * public void Screenshot2() throws IOException { TakesScreenshot ts =
			 * (TakesScreenshot)driver; File source = ts.getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(source, new File("./Sreenshots/VinEntryScreen.png")); }
			 * 
			 * public void Screenshot3() throws IOException { TakesScreenshot ts =
			 * (TakesScreenshot)driver; File source = ts.getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(source, new File("./Sreenshots/PreInspectionScreen.png"));
			 * }
			 * 
			 * public void Screenshot4() throws IOException { TakesScreenshot ts =
			 * (TakesScreenshot)driver; File source = ts.getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(source, new File("./Sreenshots/ChecklistScreen.png")); }
			 */
		  }
		 