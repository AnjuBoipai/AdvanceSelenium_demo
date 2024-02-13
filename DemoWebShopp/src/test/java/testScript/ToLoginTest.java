package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pom_Script.LoginPage;
import pom_Script.WelcomePage;

public class ToLoginTest extends BaseClass{
	@Test
	public void testCse() {
	
		String username = System.getProperty("username");
		String password = System.getProperty("Password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		
		WelcomePage w =new WelcomePage(driver);
		w.getLoginLink().click();
		
		LoginPage l=new LoginPage(driver);
		l.getEmailTextfield().sendKeys(username);
		l.getPasswordTextField().sendKeys(password);
		l.getLoginbutton().click();
		
	}
}
