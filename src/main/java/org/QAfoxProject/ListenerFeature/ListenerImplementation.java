package org.QAfoxProject.ListenerFeature;

import java.io.File;
import java.io.IOException;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.WebDriverLibrary;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenerImplementation extends BaseConfiguration implements ITestListener,IRetryAnalyzer {

	int count=1;
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("on test start",true);	
	}
	@Override
	public boolean retry(ITestResult result) {
		int retryuntil=5;
		boolean flag=false;
		if(count<=retryuntil) {
			Reporter.log("Retry",true);
			count++;
			flag= true;
		}
return flag;
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("on test success",true);
		
		}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("on test failure",true);
		String methodname=result.getName();
		TakesScreenshot ts=(TakesScreenshot) WebDriverLibrary.static_driver;
		File source = ts.getScreenshotAs(OutputType.FILE);		
		File destination=new File("./TakeScreenshot/"+methodname+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("on test skipped",true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on Test Failed But With in Success Percentage",true);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on test failed with timeout",true);
	}
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("on start",true);
	}
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("on finish",true);
	}
}