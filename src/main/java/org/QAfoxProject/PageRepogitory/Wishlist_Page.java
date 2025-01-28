package org.QAfoxProject.PageRepogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist_Page {
	
	@FindBy(xpath="//a[@title='Wish List (1)']")
	private WebElement wishlist_headertext;

	
	public Wishlist_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the wishlist_headertext
	 */
	public WebElement getWishlist_headertext() {
		return wishlist_headertext;
	}
}
