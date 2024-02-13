package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ReadExcelUtility;

public class SampleTest extends BaseClass {

	@Test(dataProvider ="credential")
	public void testCase(String username,String password) {
		Reporter.log("Sample test get executed",true);
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		
	}
	@DataProvider(name="credential")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("sheet1");
	
	}
}
