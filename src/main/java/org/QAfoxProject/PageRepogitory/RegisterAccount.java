package org.QAfoxProject.PageRepogitory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class RegisterAccount {

	// 1.Declaration of WebElements
	@FindBy(xpath = "//li[@class='dropdown open']")
	private WebElement MyAccountModule;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterComponent;

	@FindBy(name = "firstname")
	private WebElement UserFirstnameTextField;

	@FindBy(name = "lastname")
	private WebElement UserLastnameTextField;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement UserEmailTextField;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement UserTelePhoneTextField;

	@FindBy(id = "input-password")
	private WebElement UserPasswordTextField;
	@FindBy(name = "confirm")
	private WebElement UserConfirmPasswordTextField;

	@FindBy(name = "newsletter")
	private WebElement SubscribeRadioButton;

	@FindBy(name = "agree")
	private WebElement PrivacypolicyCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;

	//2. Initialization of WebElement---Using Constructor
	public void RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyAccountModule() {
		return MyAccountModule;
	}

	public WebElement getRegisterComponent() {
		return RegisterComponent;
	}

	public WebElement getUserFirstnameTextField() {
		return UserFirstnameTextField;
	}

	public WebElement getUserLastnameTextField() {
		return UserLastnameTextField;
	}

	public WebElement getUserEmailTextField() {
		return UserEmailTextField;
	}

	public WebElement getUserTelePhoneTextField() {
		return UserTelePhoneTextField;
	}

	public WebElement getUserPasswordTextField() {
		return UserPasswordTextField;
	}

	public WebElement getUserConfirmPasswordTextField() {
		return UserConfirmPasswordTextField;
	}

	public WebElement getSubscribeRadioButton() {
		return SubscribeRadioButton;
	}

	public WebElement getPrivacypolicyCheckBox() {
		return PrivacypolicyCheckBox;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}



}
	

