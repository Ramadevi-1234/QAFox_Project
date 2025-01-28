package org.QAfoxProject.Components;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_Printers_Test extends BaseConfiguration {
	@Test
	public void AddComponents_Printer() {
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		webdriverobj.mouseHoverToElement(homeobj.getComponents_Printerheadertext());
		javautilityobj.pause(5000);
		Reporter.log("Add Components_Printer",true);
		Reporter.log("Add Components_Printer",true);
	}

}
