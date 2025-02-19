package PageObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseTest.baseclass;
import DataProvider.Excelreuse;
import Locator.FL_LoginPage.Logins_PageLocator;

public class FLLoginPage extends baseclass implements Logins_PageLocator {
	public WebDriver driver;
	
	
	  public FLLoginPage(WebDriver driver)
	  { this.driver = driver; 
	  }
	 
	
//===========================================

public void SDLogin(int flurl) throws Exception, InterruptedException, IOException {
	try {
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		driver.get((String) datas.get(flurl));
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Usrnmetxt)));
		element.sendKeys((String) datas.get(2));
		 log.info("User name entered"); 
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Psswrdtxt)));
		element.sendKeys((String) datas.get(23));
		log.info("Password Entered"); 
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(signbttn)));
		element.click();
		TakesScreenshot ts = (TakesScreenshot)driver; File source =
		ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new File("./Sreenshots/Technician/Wd_LoginPage.png"));
		System.out.println("User is able to login to the SD customer portal successfully in CN interface");		
		
		
	} 
	catch (NoSuchElementException e) {
		System.out.println("No such element found");
    
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getCause());
		e.printStackTrace();
	
	
} 
}

}





  



