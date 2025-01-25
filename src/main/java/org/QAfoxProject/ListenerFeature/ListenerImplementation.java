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

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("onTestStart..!!",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess..!!",true);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure..!!",true);
		//Fetch the test MethodName
		
		String methodname=result.getName();
		TakesScreenshot ts = (TakesScreenshot)WebDriverLibrary.static_driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./TestSceenshot/" + methodname + javautilityobj.getCurrentTime()+"m1.png");
		try {
			FileHandler.copy(source, destination);
		}
		catch(IOException e) {
			e.printStackTrace();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped..!!",true);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTest..!!",true);

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestStart..!!",true);

	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart..!!",true);

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish..!!",true);

	}
		@Override
		public boolean retry(ITestResult result) {
			int retryuntil = 5;
			boolean flag = false;
			if(count < retryuntil) {
				Reporter.log("Retry..",true);
				count++;
				flag = true;
			}
			return flag;
		}
	}
	
	

}
