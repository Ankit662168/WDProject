 
 package PageObject;

 import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
 import java.io.IOException;
 import java.util.ArrayList;

 import javax.swing.text.Utilities;

 import org.apache.commons.io.FileUtils;
 import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
 import Locator.FL_RMACreationPage.RMA_PageLocator;


 public class FLRMACreationPage extends baseclass implements RMA_PageLocator{
 	public WebDriver driver;
 	
 	
 	  public FLRMACreationPage(WebDriver driver)
 	  { this.driver = driver; 
 	  }
 	 
 	
 //===========================================

 public void ViewRegProdcut() throws Exception, InterruptedException, IOException {
 	try {
 		Excelreuse e = new Excelreuse();
 		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
 		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Regprodviewalllink)));
 		element.click();
 		
 		int elementsize = driver.findElements(By.cssSelector("#RegisteredProductsPaginator>ul>li")).size();
 		System.out.println(elementsize);
 		
 		for(int i=1;i<=elementsize; i++)
 		{
 			String paginationSelector = "#RegisteredProductsPaginator >ul >li:nth-child("+i+")";
 			Thread.sleep(8000);
 			driver.findElement(By.cssSelector(paginationSelector)).click();
 						 			
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
 //===========================================

 public void CreateRMA() throws Exception, InterruptedException, IOException {
 	try {
 		Excelreuse e = new Excelreuse();
 		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		/*
		 * element = new WebDriverWait(driver,
		 * 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Regprodviewalllink
		 * ))); element.click(); driver.navigate().refresh();
		 */
 		Thread.sleep(5000);
 		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(clkng_rqstwrrntylink)));
 		element.click();
 		
 		String zoomJS;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		zoomJS = "document.body.style.zoom='0.8'";  
		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(slct_rgprdctrdiobtn)));
 		element.click();
 		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(Contnuebttn)));
 		element.click();
 		
 		element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='product_item_0']//div[4]/input")));
 		boolean isDislayed = element.isDisplayed();
		  if (isDislayed == true) {
		  element.click();
		  element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rmaFormNextBtn\"]")));
		  element.click();
		  }
		  element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath(RmaReasondrpdwn)));
			//element.click();
			Select sl = new Select(element);
			sl.selectByIndex(4);
		  
			/*
			 * java.util.List<WebElement> options =
			 * driver.findElements(By.tagName("option")); for(WebElement option : options){
			 * if(option.getText().equals("Will not boot")) { option.click(); break; } }
			 */
		driver.findElement(By.xpath("//*[@id=\"rmaFormNextBtn\"]")).click();
		Thread.sleep(5000);

		WebElement button = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);
		//System.out.println("radio button selected");
		
		
		WebElement button1 = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='rmaFormNextBtn']")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button1);
		//System.out.println("Clicked on Continue button");
		 
		WebElement button2 = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", button2);
		//System.out.println("radio button selected");
		
		
		WebElement button3 = new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='rmaFormNextBtn']")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button3);
		//System.out.println("Clicked on Continue button");
		driver.findElement(By.id("uploadfiles")).sendKeys("C:\\Users\\7353307\\Downloads\\NL.png");
		Thread.sleep(6000);
		driver.findElement(By.id("submit-RMA")).click();
		log.info("User is able to create Flash RMA successfully");
		TakesScreenshot ts = (TakesScreenshot)driver; 
		Thread.sleep(8000);
		File source =ts.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(source, new File("./Sreenshots/Technician/Flash_RMACreation.png"));

		   
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





   




