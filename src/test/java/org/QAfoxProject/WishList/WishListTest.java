package org.QAfoxProject.WishList;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.MyWishlist_Page;
import org.QAfoxProject.PageRepogitory.Wishlist_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WishListTest extends BaseConfiguration {
	

	@Test
	public void addproduct_wishlist() {

		Wishlist_Page wishobj = new Wishlist_Page(webdriverobj.driver);
		wishobj.getWishlist_headertext().click();
		Reporter.log("continue successfully", true);

	}
	

}
