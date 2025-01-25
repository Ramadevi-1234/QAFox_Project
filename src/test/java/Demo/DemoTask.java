package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTask {
	@Test
	public void DemoTesting1() {
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
	
	
	//Steps Information
	test.log(Status.INFO,"Step1:Launch The Browser Successfull");
	test.log(Status.INFO,"Step2:Navigate To The Application Via URL Successfull");
	test.log(Status.PASS,"Step3:Verified the Webpage Successful");
	if("Harry".equals("Harry")) {
		test.log(Status.PASS,"Step4:Verified the WebElement Is Displayed");
	}
	else {
		test.log(Status.FAIL,"Step4:Verified the WebElement Is Not Displayed");
	}
	//test.log(Status.SKIP,"Step5:Element Is Hidden");
	//Flush The Report Information
	report.flush();

	
		
	}
	
	
	}
		
	
