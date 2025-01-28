package org.QAfoxProject.Desktops;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.DeskTop_Page;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Desktops_Mac_Test extends BaseConfiguration {
	
	
	
	
	@Test(priority = -1, invocationCount = 1, groups="FT", enabled=true)
	public void addproduct_Desktop_Mac() {
		
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_Macheadertext());
		javautilityobj.pause(5000);
		//perform click action
		homeobj.getDesktop_Macheadertext().click();
		Reporter.log("Macheader",true);
		Reporter.log("Desktops_MAC_product Added",true);
		
		DeskTop_Page desktop=new DeskTop_Page(webdriverobj.driver);
		
		desktop.getAddProductTo_Wishlist().click();
		Reporter.log("Add Product to Wishlist", true);
	}
}
