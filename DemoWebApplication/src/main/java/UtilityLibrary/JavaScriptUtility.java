package UtilityLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * @author suriy
 */
public class JavaScriptUtility extends WebDriverUtility {

   /**
    * 
    * @param driver
    * @param x
    * @param y
    */
	public void scrollBy(WebDriver driver,int x,int y) {
		
	    js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	/**
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollTo(WebDriver driver,int x,int y) {
		 js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
		
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param b
	 */
	public void scrollInToView(WebDriver driver,WebElement element,Boolean b) {
		
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments.scrollInToView("+b+");",element);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void jsclick(WebDriver driver,WebElement element) {
		
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void jsSendkeys(WebDriver driver,WebElement element,String value) {
		
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+value+"';",element);
	}
	
	
}
