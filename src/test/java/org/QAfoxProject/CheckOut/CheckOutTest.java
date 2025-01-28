package org.QAfoxProject.CheckOut;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseConfiguration {

	@Test
	public void ToCheckOutHomePage() {
		
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_CheckOutheadertext());
		javautilityobj.pause(5000);
		Reporter.log("Check out succesfsully",true);
	}
}
