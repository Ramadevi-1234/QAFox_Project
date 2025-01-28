package org.QAfoxProject.PageRepogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlist_Page {

	@FindBy(xpath="//a[@data-original-title='Remove']")
	private WebElement removeProduct_Wishlist;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continue_Wishlist;
	
	public MyWishlist_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the removeProduct_Wishlist
	 */
	public WebElement getRemoveProduct_Wishlist() {
		return removeProduct_Wishlist;
	}

	/**
	 * @return the continue_Wishlist
	 */
	public WebElement getContinue_Wishlist() {
		return continue_Wishlist;
	}
}
