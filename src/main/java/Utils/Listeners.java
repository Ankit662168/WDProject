package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import BaseTest.baseclass;
import Utils.ExtentReporterNG;


public class Listeners extends baseclass implements ITestListener {
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//extentTest.get().log(Status.PASS, "Test Passed");
		//extentTest.get().log(Status.PASS,result.getMethod().getMethodName()+" Test is Successfully Passed");
		extentTest.get().pass( result.getMethod().getDescription());
		
		if(result.getMethod().getMethodName().equalsIgnoreCase("TC_014_Vin_Validationtests"))
		{	
			//extentTest.get().log(Status.PASS,"Verified VIN search box field, Validated with valid and invalid VIN numbers");
			test.createNode("Validated with Greater then 17 numbers");
			test.createNode("Validated with less then 17 numbers");
			test.createNode("Validated with Invalid VIN number");
			
			
			}
		
	
		if(result.getMethod().getMethodName().equalsIgnoreCase("TC_006_Technician_inspection_ValidationChecks"))
		{	

			test.createNode("Service Technician login Mileage,Stock,WorkOrder text boxes is enabled to edit");
			test.createNode("Service Technician can able to Edit or Save-->Button is enabled");
			}
		
		if(result.getMethod().getMethodName().equalsIgnoreCase("TC_007_Mileage_test"))
		{	
			test.createNode("Mileage Can enter greater than 80000");
			test.createNode("While enter Mileage greater than 80000 and save,text color is turned to red color");
			
			
			}
		
		
		
		if(result.getMethod().getMethodName().equalsIgnoreCase("TC_007_ManagerLogin_Vin_Validationtests"))
		{	
			test.createNode("Validated by typing with Greater then 17 numbers");
			test.createNode("Validated by typing with Less then 17 numbers");
			test.createNode("Validated by typing with Invalid VIN number");
			}
		
		
		if(result.getMethod().getMethodName().equalsIgnoreCase("TC_005_DefaultUser_VinSearchboxValidation"))
		{	
		
			test.createNode("Validated by typing with Greater then 17 numbers");
			test.createNode("Validated by typing with Less then 17 numbers");
			test.createNode("Validated by typing with Invalid VIN number");
			
			}
	
		
		if(result.getMethod().getMethodName().equalsIgnoreCase("EnterInvalid_usercredentials"))
		{	
			
			test.createNode("User entered Invalid Username or Password");
			
			}
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//Screenshot
		//extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testMethodName =result.getMethod().getMethodName();
		
		try {
			
			driver =(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} 
		catch(Exception e)
		{
			
		}
		try {
			//extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
			
			extentTest.get().fail("Test case failed", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotPath(driver,testMethodName)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//extentTest.get().pass( result.getMethod().getDescription());
		extentTest.get().fail(result.getThrowable().getLocalizedMessage());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stubWebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch(Exception e)
		{
			
		}
		try {
			//extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
			extentTest.get().fail("Test case failed", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShotPath(driver,testMethodName)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//extentTest.get().pass( result.getMethod().getDescription());
		extentTest.get().fail(result.getThrowable().getLocalizedMessage());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	
}
