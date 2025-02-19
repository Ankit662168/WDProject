package test;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseTest.baseclass;
import PageObject.FLIncidentCreation;
import PageObject.FLLoginPage;
import PageObject.FLProdRegPage;
import PageObject.FLRMACreationPage;
import PageObject.SDLoginPage;


public class Application extends baseclass {
	
		
	
	
@Test(priority=1,description="CN-User is able to Register a Flash product successfully")
public void Verifylogin_TC_01() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(1);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	sd.FLsandiskProdReg();
	
}

@Test(priority=2,description="CN-User is able to create the Flash RMA successfully")
public void Verify_FLRMACration_TC_02() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(1);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	//rma.ViewRegProdcut();
	rma.CreateRMA();
}	

@Test(priority=3,description="User is able create the incident")
public void Verify_IncidentCreation_TC_03() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	//SDLoginPage lp = new SDLoginPage(driver);
	//lp.SDLogin();
	FLIncidentCreation ic= new FLIncidentCreation(driver);
	ic.SDIncdntCreation();
}

@Test(priority=4,description="User is able to Register Sandisk product successfully in EN interface")
public void VerifySDENlogin_TC_04() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(10);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}

@Test(priority=5,description="User is able to create the sandisk RMA successfully in EN interface")
public void Verify_SDRMAENCration_TC_05() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(10);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=6,description="User is able to Register Sandisk product successfully in CN interface")
public void VerifySDCNlogin_TC_06() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(11);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
	TakesScreenshot ts = (TakesScreenshot)driver; File source =
	ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new File("./Sreenshots/Technician/SD_CN.png"));
	
}

@Test(priority=7,description="User is able to create the sandisk RMA successfully in CN interface")
public void Verify_SDRMACNCration_TC_07() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(11);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=8,description="User is able to Register Sandisk product successfully in EU interface")
public void VerifySDEUlogin_TC_08() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(12);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=9,description="User is able to create the sandisk RMA successfully in EU interface")
public void Verify_SDRMAEUCration_TC_09() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(12);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=10,description="User is able to Register Sandisk product successfully in IN interface")
public void VerifySDINlogin_TC_10() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(13);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=11,description="User is able to create the sandisk RMA successfully in IN interface")
public void Verify_SDRMAINCration_TC_11() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(13);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}
@Test(priority=12,description="User is able to Register Sandisk product successfully in DE interface")
public void VerifySDDElogin_TC_12() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(14);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=13,description="User is able to create the sandisk RMA successfully in DE interface")
public void Verify_SDRMADECration_TC_13() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(14);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=14,description="User is able to Register Sandisk product successfully in fr interface")
public void VerifySDfrlogin_TC_14() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(15);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=15,description="User is able to create the sandisk RMA successfully in fr interface")
public void Verify_SDRMAfrCration_TC_15() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(15);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}


@Test(priority=16,description="User is able to Register Sandisk product successfully in IT interface")
public void VerifySDITlogin_TC_16() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(16);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=17,description="User is able to create the sandisk RMA successfully in IT interface")
public void Verify_SDRMAITCration_TC_17() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(16);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=18,description="User is able to Register Sandisk product successfully in ES interface")
public void VerifySDESlogin_TC_18() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(17);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=19,description="User is able to create the sandisk RMA successfully in ES interface")
public void Verify_SDRMAESCration_TC_19() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(17);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=20,description="User is able to Register Sandisk product successfully in RU interface")
public void VerifySDRUlogin_TC_20() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(18);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=21,description="User is able to create the sandisk RMA successfully in RU interface")
public void Verify_SDRMARUCration_TC_21() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(18);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=22,description="User is able to Register Sandisk product successfully in PT interface")
public void VerifySDPTlogin_TC_22() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(19);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=23,description="User is able to create the sandisk RMA successfully in PT interface")
public void Verify_SDRMAPTCration_TC_23() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(19);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=24,description="User is able to Register Sandisk product successfully in ZH interface")
public void VerifySDZHlogin_TC_24() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(20);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=25,description="User is able to create the sandisk RMA successfully in ZH interface")
public void Verify_SDRMAZHCration_TC_25() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(20);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=26,description="User is able to Register Sandisk product successfully in KO interface")
public void VerifySDKOlogin_TC_26() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(21);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=27,description="User is able to create the sandisk RMA successfully in KO interface")
public void Verify_SDRMAKOCration_TC_27() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(21);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=28,description="User is able to Register Sandisk product successfully in JP interface")
public void VerifySDJPlogin_TC_28() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(22);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.sandiskProdReg();
}
@Test(priority=29,description="User is able to create the sandisk RMA successfully in JP interface")
public void Verify_SDRMAJPCration_TC_29() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	SDLoginPage lp = new SDLoginPage(driver);
	lp.SDENLogin(22);
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	rma.CreateRMA();
}

@Test(priority=30,description="IN-User is able to Register a Flash product successfully")
public void VerifyFLINlogin_TC_30() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(24);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	sd.FLsandiskProdReg();
	
}

@Test(priority=31,description="IN-User is able to create the Flash RMA successfully")
public void Verify_FLINRMACration_TC_31() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(24);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	//rma.ViewRegProdcut();
	rma.CreateRMA();
}	


@Test(priority=32,description="KO-User is able to Register a Flash product successfully")
public void VerifyFLKOlogin_TC_32() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(25);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	sd.FLsandiskProdReg();
	
}

@Test(priority=33,description="KO-User is able to create the Flash RMA successfully")
public void Verify_FLKORMACration_TC_33() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(25);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	//rma.ViewRegProdcut();
	rma.CreateRMA();
}	

@Test(priority=34,description="ZH-User is able to Register a Flash product successfully")
public void VerifyFLZHlogin_TC_34() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(26);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	sd.FLsandiskProdReg();
	
}

@Test(priority=35,description="ZH-User is able to create the Flash RMA successfully")
public void Verify_FLKORMACration_TC_35() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(26);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	//rma.ViewRegProdcut();
	rma.CreateRMA();
}	

@Test(priority=36,description="Fash RU-User is able to Register a Flash product successfully")
public void VerifyFLRUlogin_TC_36() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(27);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	sd.FLsandiskProdReg();
	
}

@Test(priority=37,description="Flash RU-User is able to create the Flash RMA successfully")
public void Verify_FLRURMACration_TC_37() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(27);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	//rma.ViewRegProdcut();
	rma.CreateRMA();
}	

@Test(priority=38,description="Fash PT-User is able to Register a Flash product successfully")
public void VerifyFLPTlogin_TC_38() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(28);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	sd.FLsandiskProdReg();
	
}

@Test(priority=39,description="Flash PT-User is able to create the Flash RMA successfully")
public void Verify_FLPTRMACration_TC_39() throws InterruptedException, IOException, Exception {
	driver = setupbrowser();
	FLLoginPage lp = new FLLoginPage(driver);
	lp.SDLogin(28);
	FLProdRegPage sd = new FLProdRegPage(driver);
	sd.clickonnewreglink();
	FLRMACreationPage rma = new FLRMACreationPage(driver);
	//rma.ViewRegProdcut();
	rma.CreateRMA();
}	

@AfterTest
public void TechnicianReports() throws IOException
{
	  
	String path =System.getProperty("user.dir")+"\\Reports\\WesternDigital_flow_test.html";
	  ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	  
	  ExtentReports extent = new ExtentReports();
	  
     extent.attachReporter(reporter);
	  
     ExtentTest logger =	extent.createTest("WesternDigital_Positive_TestCases", "Western Digital flow");
     
     logger.getStatus();
     
     
     //LOGIN PAGE
     logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("./Sreenshots/Wd_LoginPage.png").build());
     
     logger.addScreenCaptureFromPath("." + "./Sreenshots/Technician/Wd_LoginPage.png");
     
     //Product Reg Page
     logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("./Sreenshots/Wd_prdreg_LoginPage.png").build());
     
     logger.addScreenCaptureFromPath("." + "./Sreenshots/Technician/Wd_prdreg_LoginPage.png");
     
   //SD prod reg successfull message
     logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("./Sreenshots/Sd_prodreg.png.png").build());
     
     logger.addScreenCaptureFromPath("." + "./Sreenshots/Technician/Sd_prodreg.png");
         
     //RMA Creation
     logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("./Sreenshots/Flash_RMACreation.png").build());
     
     logger.addScreenCaptureFromPath("." + "./Sreenshots/Technician/Flash_RMACreation.png");
     
     //CN Interface
     logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("./Sreenshots/Flash_RMACreation.png").build());
     
     logger.addScreenCaptureFromPath("." + "./Sreenshots/Technician/SD_CN.png");
     // Flash IN Interface
     logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("./Sreenshots/FL_prodreg.png").build());
     logger.addScreenCaptureFromPath("." + "./Sreenshots/Technician/FL_prodreg.png");
     extent.flush();
     
   
 		
 	
     
	  }


}


