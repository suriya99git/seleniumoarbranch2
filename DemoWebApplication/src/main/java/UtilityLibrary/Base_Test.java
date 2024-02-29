package UtilityLibrary;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ListenerUtility.class)
public class Base_Test extends WebDriverUtility {

	public static  InitObjects i = new InitObjects();
	@BeforeClass
	public void openBrowser() throws IOException {
		Reporter.log("Browser Opened",true);

		driver = new ChromeDriver();
		
		i.getWebDriverUtilityMethod().maximize();

		String url = i.getPropertyFileUtilityMethod().fetchData("url");

		i.getWebDriverUtilityMethod().navigate(url);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();


	}
}
