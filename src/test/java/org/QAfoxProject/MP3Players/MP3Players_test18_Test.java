package org.QAfoxProject.MP3Players;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MP3Players_test18_Test extends BaseConfiguration{
	@Test
	public void addproduct_MP3players() {
		
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getMP3_Playersheadertext());
		webdriverobj.mouseHoverToElement(homeobj.getMP3_test18_headertext());
		javautilityobj.pause(5000);
		Reporter.log("MP3_Players_product Added",true);
	}

}
