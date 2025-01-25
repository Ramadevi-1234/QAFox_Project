package org.QAfoxProject.GenericUtility;

import org.QAfoxProject.PageRepogitory.AccountLoginPage;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * This Class Describe the Configuration For TestScript
 * This Class is Used
 *This Class Describes The Configuration For TestScript
 *@author Ramadevi*/




public class BaseConfiguration {
	
	
	public WebDriverLibrary webdriverobj;
	public ExcelFileLibrary excelutilityobj;
	public PropertyFileLibrary propertyfileobj;
	public JavaLibrary javautilityobj;
	public JavaScriptLibrary jsutilityobj;
	public TakeScreenShotLibrary tsutilityobj;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
/**
 * This Method is Used To Configure the Browser
 * @param
 * */
	@BeforeClass
	public void browserSetup() {
		//Initilize all the Libraries 
		initobjects();
		
				
		String browser = "Chrome";
		String url = "https://tutorialsninja.com/demo/";
		//Test Log
		
		//Precondition 1 : Launch the Browser
		
		webdriverobj.launchBrowser(browser);
		Reporter.log("Browser Launched Successfully",true);

		
		//Precondition 2 :Navigate to The Application
		webdriverobj.navigateToApp(url);

		Reporter.log("Navigate to the Application Successfully",true);

		//Precondition 3 : Maximize the Browser
		webdriverobj.maximizeBrowser();

		Reporter.log("Maximize the Browser Successfully",true);
		
        HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Click on "My Account" Header Link
		homeobj.getMyaccount_headerlink().click();
		Reporter.log("Clicked on My Account Header Link Successfull",true);
		
		//Click on "Register" Header Link
				homeobj.getRegistre_headerlink().click();
				Reporter.log("Clicked on Register Header Link Successfull",true);
				
				//Click on "Login" Header Link
				homeobj.getLogin_headerlink().click();
				Reporter.log("Clicked on My Account Header Link Successfull",true);

		}
	/**
	 * This Method is Used To Configure the Browser
	 * 
	  */
	@AfterClass
	public void browserTerminate() {
		//Test Log
				Reporter.log("Terminate Successfully",true);
				
		
	}
	/**
	 * This Method is Used To Perform Login Action
	 *
	  */
	@BeforeMethod(enebled=false)
	public void login() {
		
		//Provide Waiting Statement
		webdriverobj.waituntilElementFound();
		
		
		
				
		AccountLoginPage loginobj = new AccountLoginPage(webdriverobj.driver);
		//Enter Email ID
		loginobj.getEmailadd_textfield().sendKeys("");
		
		//Test Log
		Reporter.log("Login Successfully",true);
		
		
	}
	/**
	 * This Method is Used To Perform Logout Action
	 * 
	 */
	@AfterMethod
public void logout() {
		
	//Test Log
			Reporter.log("Logou Successfully",true);
			
	}

/**
 * This Method is Used To getTestRunner Level Connection
 * 
  */
	@BeforeTest
public void getTestRunnerConnection() {
	//Test Log
			Reporter.log("Getting TestRunnerConnection Successfully",true);
			
}

/**
 * This Method is Used To Terminate  the TestRunner Level Connection
 * 
 */
	@AfterTest
public void terminateTestRunnerConnection() {
	//Test Log
			Reporter.log("Terminate TesrRunnerConnection Successfully",true);
			
	
}
/**
 * This Method is Used To Get/Configure the Database or Advance Report Connection
 * 
 */
	@BeforeSuite
public void getReportConnection() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceRepotr/report.html");
		
		
		//Configure The SparkReport information
		
	spark.config().setDocumentTitle("Functionality Testing||QaFox");
	spark.config().setReportName("FunctionalitySuite||Verify User Able To Add Desktop-Mac-QaFox");

	spark.config().setTheme(Theme.DARK);	
	//Create The Extent Report
	ExtentReports report = new ExtentReports();
	
	
	//Attach Spark Report and ExtentReport
	
	report.attachReporter(spark);
	
	//Configure The System Information In Extent Report
	report.setSystemInfo("DeviceName:","LAPTOP-LAAMSI9C");
	report.setSystemInfo("OperatingSystem:","WINDOWA 11");
	report.setSystemInfo("Browser:","Chrome");
	report.setSystemInfo("BrowserVersion:","chrome-Version 131.0.6778.265 (Official Build) (64-bit)\r\n"
			+ "");
	
	//Create The Test Information
	ExtentTest test = report.createTest("Functionalitytest");
	
		
	//Test Log
	Reporter.log("Getting ReporterConnection Successfully",true);
	
	
}
/**
 * This Method is Used To Terminate/Configure the Database or Advance Report Connection
 * 
 */
	@AfterSuite
public void terminateReportConnection() {
		//Flush The Report Information
		report.flush();

	//Test Log
	Reporter.log("Terminate ReportConnection Successfully",true);
	
}
	public void initobjects()
	{
		webdriverobj = new WebDriverLibrary();
		excelutilityobj = new ExcelFileLibrary();
		propertyfileobj = new PropertyFileLibrary();
		javautilityobj = new JavaLibrary();
		jsutilityobj = new JavaScriptLibrary();
		tsutilityobj = new TakeScreenShotLibrary();
		
	}
}
