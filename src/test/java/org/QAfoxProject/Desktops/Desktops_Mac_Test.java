package org.QAfoxProject.Desktops;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Desktops_Mac_Test extends BaseConfiguration {
	
	
	
	
	@Test
	public void addProduct_Desktops_Mac() {
		//Create The Test Information
		test = report.createTest("Verify-AddProduct_Desktops_Mac");
		
		 HomePage homeobj = new HomePage(webdriverobj.driver);
		 Object javautitlityobj;
		javautitlityobj.pause(5000);
		 //Perform Mouse Hover Action
		 webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		 test.log(Status.PASS,"Step1 : Perform Mouse HoverAction-Desktop");
		 Reporter.log("Desktops_Mac_Product Added",true);
		//Perform Mouse Hover Action
		 webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		 test.log(Status.PASS,"Step2 : Perform Mouse HoverAction-Mac");
			
	}

}
