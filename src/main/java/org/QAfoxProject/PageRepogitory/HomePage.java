package org.QAfoxProject.PageRepogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@title=My Account")
	WebElement myaccount_headerlink;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/li/a[text()='Login']")
	WebElement registre_headerlink;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/li/a[text()='Login']")
	WebElement login_headerlink;
	
	
	@FindBy(xpath="//li/a[contains"	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public WebElement getMyaccount_headerlink() {
		return myaccount_headerlink;
	}

	public WebElement getRegistre_headerlink() {
		return registre_headerlink;
	}

	public WebElement getLogin_headerlink() {
		return login_headerlink;
	}
	

}
