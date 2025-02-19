package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import org.apache.log4j.PropertyConfigurator;
import io.github.bonigarcia.wdm.WebDriverManager;
import DataProvider.Excelreuse;
import BaseTest.baseclass;

public class baseclass {
	
	public WebDriver driver;
	public static WebElement element;
	public static Logger log = LogManager.getLogger(baseclass.class.getName());
	public static Properties prop;
	
	/*
	 * @BeforeTest public void startReport() {
	 * //PropertyConfigurator.configure(System.getProperty("user.dir") +
	 * "/src/main/java/Utils/log4j.properties"); }
	 */
	
	@Test
	public WebDriver setupbrowser() throws IOException {
		//PropertyConfigurator.configure(System.getProperty("user.dir") +"/src/main/java/Utils/log4j.properties");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		log.info("Chrome Driver initiated successfully");
        prop = new Properties();
		
		//FileInputStream file = new FileInputStream("D:\\ICAR-Updated new\\ICAR-Updated\\src\\main\\java\\resources\\data.properties");
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Utils/data.properties");
		
		//ArrayList data = passData(prop.getProperty("models"));
		
		prop.load(file);	
	
		
		//String browserName = System.getProperty("browser");
		//String browserName = prop.getProperty("browser");
		Excelreuse e = new Excelreuse();
		ArrayList datas = e.getData(prop.getProperty("Excelinputs"));
		
		//String browserName = (String) datas.get(3);
		driver.get((String) datas.get(1));
		
		log.info("Chrome browser initiated successfully");
		log.info("We've just greeted the user on Western Digital");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	
	}
	
	/*
	 * @AfterTest public void teardown() { driver.close(); //driver.quit();
	 * //log.info("Driver session ended");
	 * 
	 * }
	 */
	
	public String getScreenShotPath(WebDriver driver, String testCaseName) throws IOException, WebDriverException {



		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);



		}
	
		
		 
		 
}


