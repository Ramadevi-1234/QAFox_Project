package org.QAfoxProject.RegisterAccount;
import static org.testng.Assert.assertFalse;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepogitory.RegisterAccount;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.QAfoxProject.ListenerFeature.ListenerImplementation.class)

public class RegisterAccountTest extends BaseConfiguration {
	
	@Test
	public void verifyValidInput() {
	RegisterAccount registerAccountPage = new RegisterAccount();
	Reporter.log("Register success",true);
	/**
	//Enter FirstName in the Name TextField
	registerAccountPage.getUserFirstnameTextField().sendKeys("soujanya");
	//Enter LastName in the Name TextField
	registerAccountPage.getUserLastnameTextField().sendKeys("nanne");
	
	//Enter the mail in Email Text Field
	registerAccountPage.getUserEmailTextField().sendKeys("soujanyananne444@gmail.com");
	
	//Enter the Telephone in Telephone Text Field
	registerAccountPage.getUserTelePhoneTextField().sendKeys("9876543211");
	
	//Enter the password in Password Text Field
registerAccountPage.getUserPasswordTextField().sendKeys("Soujanya@1234");
	
	//Enter the Confirm password in Password Text Field
	registerAccountPage.getUserConfirmPasswordTextField().sendKeys("Soujanya@1234");
	
	//Click on Subscribe "Yes" Radio Button
	registerAccountPage.getSubscribeRadioButton().click();
	//Click on CheckBox
	registerAccountPage.getPrivacypolicyCheckBox().click();
	
	//Click on Continue Button
	registerAccountPage.getContinueButton().click();
	//Test log
	Reporter.log("Register Account verifyWith with valid inputs",true);
}
	
	public void verifyInvalidInput() {
		RegisterAccountPage registerAccountPage = new RegisterAccountPage();
			//Enter FirstName in the Name TextField
			registerAccountPage.getUserFirstnameTextField().sendKeys("Sai");
			//Enter LastName in the Name TextField
			registerAccountPage.getUserLastnameTextField().sendKeys("Nath");
			
			//Enter the mail in Email Text Field
			registerAccountPage.getUserEmailTextField().sendKeys("p.sai@gmail.com");
			
			//Enter the Telephone in Telephone Text Field
			registerAccountPage.getUserTelePhoneTextField().sendKeys("90909090");
			
			//Enter the password in Password Text Field
			registerAccountPage.getUserPasswordTextField().sendKeys("898989");
			
			//Enter the Confirm password in Password Text Field
			registerAccountPage.getUserConfirmPasswordTextField().sendKeys("Abcd123");
			
			//Click on Subscribe "Yes" Radio Button
			registerAccountPage.getSubscribeRadioButton().click();
			//Click on CheckBox
			registerAccountPage.getPrivacypolicyCheckBox().click();
			
			//Click on Continue Button
			registerAccountPage.getContinueButton().click();

	//Test log
	Reporter.log("Register Account verify with invalid inputs ");
}
*/
	}	

}
