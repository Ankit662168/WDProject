package PageObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseTest.baseclass;
import DataProvider.Excelreuse;
//import Locator.Login_Page.Login_PageLocator;
import Locator.FL_LoginPage.Logins_PageLocator;
import Locator.FL_ProdRegPage.SDprodreg_PageLocator;

public class FLProdRegPage extends baseclass implements SDprodreg_PageLocator {
	public WebDriver driver;
	
	
	  public FLProdRegPage(WebDriver driver)
	  { this.driver = driver; 
	  }
	 
	
//===========================================

public void clickonnewreglink() throws Exception, InterruptedException, IOException {
	try {
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Wdtgglebttn)));
		if(element.isDisplayed()) {
			element.click();
			log.info("User is able to Switch toggle button to Sandisk ");
			Thread.sleep(8000);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(source, new File("./Sreenshots/Technician/Wd_prdreg_LoginPage.png"));
			
			
		}
		
		
		
	} 
	catch (NoSuchElementException e) {
		System.out.println("No such element found");
    
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getCause());
		e.printStackTrace();
	
	
} 
}
//=========================================================================
public void sandiskProdReg() throws Exception, InterruptedException, IOException {
	try {
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Regnewprdlink)));
		element.click();
		log.info("User is able to click on the New registration link"); 
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Branddrpdwn)));
		//element.click();
		Select sl = new Select(element);
		sl.selectByIndex(1);
		java.util.List<WebElement> options =sl.getOptions();
		 for(int i=0;i<options.size();i++) {
			 System.out.println(options.get(i).getText());
		 }
		 log.info("All the Brans is available & User is able to select Sandisk from Brand dropdown");
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Proddrpdown)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Sandprodexpd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Mp3prodexpnd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(SDclpjamexpnd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(EightGBexpnd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(BlackBexpnd)));
		 element.click();
		 log.info("Mp3 Black Non Serialized product is selected");
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Serialtxtfld)));
		 element.clear();
		 element.sendKeys((String) datas.get(5));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Firstnmetext)));
		 element.clear();
		 element.sendKeys((String) datas.get(6));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Lastnmetext)));
		 element.clear();
		 element.sendKeys((String) datas.get(7));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Emailtext)));
		 element.clear();
		 element.sendKeys((String) datas.get(8));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Countrydrpdwn)));
		 Select sl2 = new Select(element);
		 sl2.selectByIndex(1);
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Prchsedateclk)));
		 element.click();
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Purchsedate)));
		 element.click();
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Placeprchgedrpdwn)));
		 Select sl3 = new Select(element);
		 sl3.selectByIndex(2);
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Sbmitbbtn)));
		 element.click();
		 log.info("SD Non serialized product is registered successfully");
		 Thread.sleep(6000);
		 TakesScreenshot ts = (TakesScreenshot)driver; File source =
		 ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new File("./Sreenshots/Technician/FL_prodreg.png"));
		 //element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Sdregsccspopup)));
		 //Actions act = new Actions(driver);
	     //act.moveToElement(element).click().build().perform();
	} 
	catch (NoSuchElementException e) {
		System.out.println("No such element found");
    
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getCause());
		e.printStackTrace();
	
	
} 
}
//==============================================================
public void VerifyOverviewTitle() throws Exception, InterruptedException, IOException {
	try {
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='overViewDetails']/h1")));
		boolean bool = element.isDisplayed();
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Recent Activities']")));
		boolean bool1 = element.isDisplayed();
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Warranty Replacements']")));
		boolean bool2 = element.isDisplayed();
				
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(source, new File("./Sreenshots/Technician/Wd_prdreg_LoginPage.png"));
		
		
		
		
		
	} 
	catch (NoSuchElementException e) {
		System.out.println("No such element found");
    
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getCause());
		e.printStackTrace();
	
	
} 
}

//================FLash Product Registration=========================================================
public void FLsandiskProdReg() throws Exception, InterruptedException, IOException {
	try {
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Regnewprdlink)));
		element.click();
		log.info("User is able to click on the New registration link"); 
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Branddrpdwn)));
		//element.click();
		Select sl = new Select(element);
		sl.selectByIndex(3);
		java.util.List<WebElement> options =sl.getOptions();
		 for(int i=0;i<options.size();i++) {
			 System.out.println(options.get(i).getText());
		 }
		 log.info("All the Brans is available & User is able to select Sandisk from Brand dropdown");
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Proddrpdown)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Sandprodexpd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Mp3prodexpnd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(SDclpjamexpnd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(EightGBexpnd)));
		 element.click();
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(BlackBexpnd)));
		 element.click();
		 log.info("Mp3 Black Non Serialized product is selected");
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Serialtxtfld)));
		 element.clear();
		 element.sendKeys((String) datas.get(5));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Firstnmetext)));
		 element.clear();
		 element.sendKeys((String) datas.get(6));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Lastnmetext)));
		 element.clear();
		 element.sendKeys((String) datas.get(7));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Emailtext)));
		 element.clear();
		 element.sendKeys((String) datas.get(8));
		 element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Countrydrpdwn)));
		 Select sl2 = new Select(element);
		 sl2.selectByIndex(1);
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Prchsedateclk)));
		 element.click();
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Purchsedate)));
		 element.click();
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Placeprchgedrpdwn)));
		 Select sl3 = new Select(element);
		 sl3.selectByIndex(2);
		 element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Sbmitbbtn)));
		 element.click();
		 log.info("SD Non serialized product is registered successfully");
		 Thread.sleep(6000);
		 TakesScreenshot ts = (TakesScreenshot)driver; File source =
		 ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new File("./Sreenshots/Technician/FL_prodreg.png"));
		 //element  = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Sdregsccspopup)));
		 //Actions act = new Actions(driver);
	     //act.moveToElement(element).click().build().perform();
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





  



