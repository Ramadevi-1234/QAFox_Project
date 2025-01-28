package org.QAfoxProject.Components;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_MiceandTrackballs_Test extends BaseConfiguration{
	@Test
	public void AddComponents_Mice() {
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		webdriverobj.mouseHoverToElement(homeobj.getComponents_Miceheadertext());
		javautilityobj.pause(5000);
		Reporter.log("Add Components_Mice",true);
	}

}
