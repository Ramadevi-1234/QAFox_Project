package org.QAfoxProject.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class Contains reusable methods to perform driver related operations
 * 
 * @author Ramadevi
 * 
 */

public class WebDriverLibrary {
	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;

	/**
	 * This Method launches specified browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			static_driver = driver;
			break;
		case "firefox":
			driver = new FirefoxDriver();
			static_driver = driver;
			break;
		case "edge":
			driver = new EdgeDriver();
			static_driver = driver;
			break;
		default:
			System.out.println("invalid browser info");
		}
		return driver;
	}

	/**
	 * this method maximize the browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	/**
	 * this method is used to navigate to the Application
	 * 
	 * @param url
	 */
	public void navigateToApp(String url) {
		driver.get(url);
	}

	/**
	 * This Method is used to Close the Browser
	 */
	public void closeTheBrowser() {
		driver.close();
	}

	/**
	 * This Method is used to Close All the Browser window/tab
	 */
	public void closeAllBrowsers() {
		driver.quit();
	}

	/**
	 * This Method is used to wait the statement until element will found
	 * 
	 */
	public void waituntilElementFound() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PathConstant.DURATION));
	}
	/**
	 * This Method Waits Until Element Is Visible on the web Page
	 * 
	 * @param Element
	 */
	public void waituntilElementFound(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(PathConstant.DURATION));
				wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This Metho is Used to mouse Hover on an Element
	 * 
	 	action = new Actions(driver);
		action.doubleClick(eement).perform();
	}* @param elemet
	 * 
	 */
	public void mouseHoverToElement(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * 
	* @param element
	 * 
	 */
	public void doubleClickOnElement(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param element
	 * 
	 */
	public void rightClickOnElement(WebElement element) {
		action = new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void dragAndDropElement(WebElement source,WebElement target) {
		action = new Actions(driver);
		action.dragAndDrop(source,target).perform();
	}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void selectFromDropDown(WebElement element,int index) {
		select = new Select(element);
		select.selectByIndex(index);
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void selectFromDropDown(WebElement element,String Value) {
		select = new Select(element);
		select.selectByValue(Value);
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void selectFromDropDown(String Visibletext,WebElement element){
		select = new Select(element);
		select.selectByVisibleText(Visibletext);
		}
	
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void switchToFrame() {
		driver.switchTo().defaultContent();
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void switchToDefaultWindow() {
		driver.switchTo().defaultContent();
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
		}
	/**
	 * This Method is Used to mouse Hover on an Element
	 * @param elemet
	 * @param target
	 */
	public void handleAlert(String status) {
		Alert al = driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
		al.accept();
		else
			al.dismiss();
		}
	
	public WebElement convertDynamicXpathToWebElement(String commonPath,String replaceData) {
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}
}