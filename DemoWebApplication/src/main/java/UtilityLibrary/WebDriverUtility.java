package UtilityLibrary;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author suriy
 */
public class WebDriverUtility {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	public static InitObjects initclass;
	
	/**
	 * this method is used to navigate to the particular url
	 * @param url
	 */
	public  void navigate(String url) {
		driver.get(url);
	}
	/**
	 * this method is used to maximize the browser
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the browser
	 */
	public void minimize() {

		driver.manage().window().minimize();
	}
	/**
	 * this method is used to refresh the browser
	 */
	public void refresh() {

		driver.navigate().refresh();
	}
	/**
	 * this method is used to go backward
	 */
	public void back() {

		driver.navigate().back();
	}
	/**
	 * this method is used to go Forward
	 */
	public void forward() {

		driver.navigate().forward();
	}
	/**
	 * this method is used to get the current url of the webpage
	 * @return
	 */
	public String curenturl() {

		return driver.getCurrentUrl();
	}
	/**
	 * this method is used to get the current url of the webpage
	 * @return
	 */
	public String title() {

		return driver.getTitle();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	/**
	 * this method is used to get current window adress
	 * @return
	 */
	public String windowAddres() {

		return driver.getWindowHandle();
	}
	/**
	 * this method is used to all the window a
	 * @return
	 */
	public Set<String> allWindowAdres() {

		return driver.getWindowHandles();
	}
	public void waitLoadPage() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void waitVisiblityWebelement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitClickWebelement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void dropDown(WebElement element,int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void dropDown(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void dropDown(String value,WebElement element) {

		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	public void moveCursor(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void doubleClick(WebDriver driver) {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}
	public void doubleClick(WebElement element) {

		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void rightClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	public void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	public void dragAndDrop(WebElement source,WebElement destination) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source,destination);
	}
	public void getAlertAccept() {

		driver.switchTo().alert().accept();
	}
	public void getAlertDismiss() {

		driver.switchTo().alert().dismiss();
	}
	public String getAlertText() {

		return driver.switchTo().alert().getText();
	}
	public void handleFrame(int index) {
		driver.switchTo().frame(index);	
	}
	public void handleFrame(String idOrname) {
		driver.switchTo().frame(idOrname);
	}
	public void handleFrame(WebElement element) {

		driver.switchTo().frame(element);
	}
	
	
}
