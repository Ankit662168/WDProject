package PageObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
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

import BaseTest.baseclass;
import DataProvider.Excelreuse;
import Locator.FL_IncidentCreationPage.Incident_PageLocator;
import Locator.FL_ProdRegPage.SDprodreg_PageLocator;


public class FLIncidentCreation extends baseclass implements Incident_PageLocator,SDprodreg_PageLocator {
	public WebDriver driver;
	
	
	  public FLIncidentCreation(WebDriver driver)
	  { this.driver = driver; 
	  }
	 
	
//===========================================

public void SDIncdntCreation() throws Exception, InterruptedException, IOException {
	try {
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		Thread.sleep(8000);
		/*
		 * ((JavascriptExecutor) driver).executeScript("window.open()");
		 * ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(1));
		 */
		
		  driver.navigate().to("https://wd-en--tst1.custhelp.com/app/askweb?l_id=MQ==");
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Branddrpdwn)));
		  Select sl = new Select(element); 
		  sl.selectByIndex(3);
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Languagedrpdown)));
		  element.sendKeys("");
		  //Select sl1 = new Select(element); 
		  //sl1.selectByIndex(1);
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Catgrydrpdown)));
		  Select sl2 = new Select(element); 
		  sl2.selectByIndex(1); 
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Prodctctgrydrpdwn))); 
		  Select sl3 = new Select(element); 
		  sl3.selectByIndex(1); 
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Prctnamedrpdwn)));
		  Select sl4 = new Select(element); 
		  sl4.selectByValue("3750");
		  
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Firstnmetext)));
		  element.clear(); 
		  element.sendKeys((String) datas.get(6));
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Lastnmetext)));
		  element.clear(); 
		  element.sendKeys((String) datas.get(7)); 
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Emailtext)));
		  element.clear(); 
		  element.sendKeys((String) datas.get(8)); 
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Countrydrpdwn)));
		  Select sl5 = new Select(element); 
		  sl5.selectByIndex(1); 
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(sbjctlinetxtfld)));
		  element.sendKeys("Flash Ask Web");
		  element = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath(Descrptiontxtfld)));
		  element.sendKeys("Flash Ask Web Description");
		  Thread.sleep(60000);
		  driver.findElement(By.xpath("//*[text()='Submit']")).click();
		  log.info("User is able to Incident creation email"); 
		
		TakesScreenshot ts = (TakesScreenshot)driver; File source =
		ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new File("./Sreenshots/Technician/Wd_LoginPage.png"));
		System.out.println("User is able to login to the SD customer portal successfully");		
		
		
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





  



