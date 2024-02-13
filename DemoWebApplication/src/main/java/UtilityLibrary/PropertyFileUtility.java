package UtilityLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	/**
	 * 
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public String fetchData(String value) throws IOException {
		
		FileInputStream fis = new FileInputStream(FrameWorkConstraints.propertyPath);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		return p.getProperty(value);
	}
}
