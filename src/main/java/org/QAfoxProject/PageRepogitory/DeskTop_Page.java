package org.QAfoxProject.PageRepogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeskTop_Page {
	@FindBy(xpath="//button[@data-original-title='Add to Wish List']")
	private WebElement AddProductTo_Wishlist;
	
	public DeskTop_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the addProductTo_Wishlist
	 */
	public WebElement getAddProductTo_Wishlist() {
		return AddProductTo_Wishlist;
	}

}
