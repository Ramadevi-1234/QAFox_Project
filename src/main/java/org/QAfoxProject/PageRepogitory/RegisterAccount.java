package org.QAfoxProject.PageRepogitory;
import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class RegisterAccount extends BaseConfiguration{

	/**1.Declaration of webElement
	 */
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
		
		//2. Initialization of webElement
		public void RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		/**
		 * @return
		 */
		public WebElement getUserFirstnameTextField() {
			return UserFirstnameTextField;
		}
		/**
		 * @return
		 */
		public WebElement getUserLastnameTextField() {
			return UserLastnameTextField;
		}
		/**
		 * @return
		 */
		public WebElement getUserEmailTextField() {
			return UserEmailTextField;
		}
		/**
		 * @return
		 */
		public WebElement getUserTelePhoneTextField() {
			return UserTelePhoneTextField;
		}
		/**
		 * @return
		 */
		public WebElement getUserPasswordTextField() {
			return UserPasswordTextField;
		}
		/**
		 * @return
		 */
		public WebElement getUserConfirmPasswordTextField() {
			return UserConfirmPasswordTextField;
		}
		/**
		 * @return
		 */
		public WebElement getSubscribeRadioButton() {
			return SubscribeRadioButton;
		}
		/**
		 * @return
		 */
		public WebElement getPrivacypolicyCheckBox() {
			return PrivacypolicyCheckBox;
		}
		/**
		 * @return
		 */
		public WebElement getContinueButton() {
			return ContinueButton;
		}

}
	

