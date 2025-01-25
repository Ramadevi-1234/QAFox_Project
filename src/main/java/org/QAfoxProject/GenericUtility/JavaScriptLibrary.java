package org.QAfoxProject.GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * This Class Provide The Reusable Method 
 */

public class JavaScriptLibrary {

	public JavascriptExecutor javascriptobj;
	/**
	 * This Method
	 	
	 */
	
	public void enterData_DisabledElement(WebElement element,String data)
	{
		javascriptobj =(JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].value="+ data+ "", element);
	}
	/**
	 * This Method is Used To Click Disable Element
	 */
	
	public void click_DisabledElement(WebElement element)
	{
		javascriptobj =(JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].click()", element);
	}
	public void defaultVerticalScrollBy()
	{
		javascriptobj =(JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(100,100)");
	}
	public void defaultVerticalScrollTo()
	{
		javascriptobj =(JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(100,100)");
	}
	public void defaultHarizentalScrollBy()
	{
		javascriptobj =(JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	public void scrollUsingView(WebElement element,boolean value) {
		javascriptobj =(JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].scrollIntoView(" + value +");",element);

	}
	
	
}
