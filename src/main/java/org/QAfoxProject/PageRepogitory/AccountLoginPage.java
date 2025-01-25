package org.QAfoxProject.PageRepogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {
	
	//Declaration
	@FindBy(id = "input-email")
	private WebElement emailadd_textfield;
	 //Declaration
	
	
	
	
	
	
	//2. Initialization of WebElement---Using Constructor
		public void RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
