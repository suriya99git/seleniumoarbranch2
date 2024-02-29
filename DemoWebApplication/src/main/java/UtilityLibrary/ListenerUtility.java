package UtilityLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerUtility extends Base_Test implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Text Excecution started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Excecution Success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Excecution Failed",true);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File source = t.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\suriy\\git\\repository29\\DemoWebApplication\\ScreenShot\\image.png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
}
