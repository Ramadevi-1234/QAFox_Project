package org.QAfoxProject.Components;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_WebCameras_Test  extends BaseConfiguration{
	@Test
	public void AddComponents_WebCameras() {
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		webdriverobj.mouseHoverToElement(homeobj.getComponents_WebCamerasheadertext());
		javautilityobj.pause(5000);
		Reporter.log("Add Components_WebCameras",true);
	}

}
