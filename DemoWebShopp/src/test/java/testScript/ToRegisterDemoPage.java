package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ReadExcelUtility;
import pom_Script.RegisterPage;
import pom_Script.WelcomePage;


public class ToRegisterDemoPage extends BaseClass {
	@Test(dataProvider ="credential")
	public void testCase(String gender,String fname,String lname,String email,String pass,String confirmpass) {
		Reporter.log("Sample test get executed",true);
		
		WelcomePage w = new WelcomePage(driver);
			w.getRegLink().click();

			// For registration page
			RegisterPage r = new RegisterPage(driver);
			r.getGenderRButton().click();
			r.getFirstNameTextField().sendKeys("fname");
			r.getLastNameTextField().sendKeys("lname");
			r.getEmailTextField().sendKeys("email");
			r.getPasswordTextField().sendKeys("pass");
			r.getConfirmPasswordTextField().sendKeys("confirmpass");
			r.getRegisterButton().click();
	}
	@DataProvider(name="credential")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet2");
	
	}
}
