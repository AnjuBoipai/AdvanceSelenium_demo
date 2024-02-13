package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebDriverUtility{
	public static String proprtyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(Iconstant.Property_Path);
		p=new Properties();
		p.load(fis);
		return p.getProperty(key) ;
		
	}
		
		
}