package org.QAfoxProject.MP3Players;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class MPPlayers_test15_Test extends BaseConfiguration {
	@Test(enabled = true, groups = "Sanity", invocationCount = 3)

	public void click_On_MP3Player() {

		test = report.createTest("verify-clicked on MP3Player product");
 
		HomePage homepage = new HomePage(webdriverobj.driver);
 
		// perform mouse hover action on printers

		webdriverobj.mouseHoverToElement(homepage.getMP3Player_text());
		webdriverobj.mouseHoverToElement(homepage.gettest15(0)_text());
		 
 
		javautilityobj.pause(5000);
 
		Reporter.log("clicked on Software", true);
 
		homepage.getSoftware_text().click();

		javautilityobj.pause(5000);

		test.log(Status.PASS, " 2.1 clicked on software text");
 
		String actualconenttext = homepage.getSoftware_content().getText();

		String expectedconenttext = "Software";
 
		Assert.assertEquals(actualconenttext, expectedconenttext);
 
		test.log(Status.PASS, "2.1.1 test passed");
 
	}
 
	@Test(enabled = false, groups = "Sanity", invocationCount = 3)

	public void blank_Details() {

		Reporter.log("There are no products to list in this category", true);

	}
 
