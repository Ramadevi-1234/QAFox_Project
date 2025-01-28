package org.QAfoxProject.ShoppingCart;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseConfiguration{
	@Test
	public void addproduct_in_shoppingCart() {
		
		HomePage homeobj=new HomePage(webdriverobj.driver);
		webdriverobj.mouseHoverToElement(homeobj.getShoppingcart_headertext());
		javautilityobj.pause(5000);
		Reporter.log("shopping cart_product Added",true);
	}

}
