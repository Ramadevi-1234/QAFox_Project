package org.QAfoxProject.GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * This Class Provide The Reusable Method 
 */

public class JavaScriptLibrary {

	public JavascriptExecutor javascriptobj;

	/**
	 * this method is used to enter the data in disabled element
	 * 
	 * @param element
	 * @param data
	 */
	public void enterData_DisabledElement(WebElement element, String data) {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].value='" + data + "';", element);
	}

	/**
	 * this method is used to click disable element
	 * 
	 * @param element
	 */
	public void click_DisableElement(WebElement element) {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].click();", element);
	}

	/**
	 * this method is used to scroll on webpage by
	 */
	public void defaultVerticalScrollBy() {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}

	/**
	 * this method is used to scroll on webpage by to
	 */
	public void defaltVerticalScrollTo() {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollTo(1000,1000)");
	}

	/**
	 * this method is used to scroll on webpage by element
	 */
	public void scrollUsingView(WebElement element, boolean value) {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].scrollIntoView(" + value + ");", element);
	}
}
