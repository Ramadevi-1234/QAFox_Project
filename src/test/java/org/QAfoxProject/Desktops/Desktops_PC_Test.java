package org.QAfoxProject.Desktops;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Desktops_PC_Test extends BaseConfiguration {
	@Test
	public void addproduct_Desktop_Pc() {
		
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_Pcheadertext());
		javautilityobj.pause(5000);
		//perform click action
		
		homeobj.getDesktop_Pcheadertext().click();
		Reporter.log("pcheader",true);
		Reporter.log("Desktops_Pc_product Added",true);
}

}
