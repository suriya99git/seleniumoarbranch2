package LoginModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import PomScript.WelcomePage;
import UtilityLibrary.Base_Test;

public class ProgramTest extends Base_Test  {

	@Test
	public void testCase() {

		Reporter.log("Test Case Executed",true);
		
		Reporter.log( i.getWebDriverUtilityMethod().curenturl(),true);
		
		WelcomePage w = new WelcomePage(driver);
	
		i.getWebDriverUtilityMethod().click(w.getRegisterLink());
		
	}
}
