package genericUtility;

import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebDriverUtility {
	public static ChromeDriver driver;

	@BeforeSuite
	public void ConnectServer() {
		Reporter.log("Connect to server", true);
	}

	@BeforeTest
	public void connectDB() {
		Reporter.log("Connect to database");
	}

	@BeforeClass
	public void OpenBrowser() throws IOException {
		Reporter.log("Browser got Lauched successfully");
		driver = new ChromeDriver();
		 maximize();
		 implicitWait();
		String url = PropertyFileUtility.proprtyData("url");
		getUrl(url);
		 
	}

	

	@BeforeMethod
	public void toLogin() {
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("navigate to loginPage", true);
	}

	@AfterMethod
	public void toLogout() {
		//driver.findElement(By.linkText("Log out")).click();

		Reporter.log("Browser got sucessfully logout", true);
	}

	@AfterClass
	public void closerBrowser() {
		driver.quit();
	}

	@AfterTest
	public void disconnectDB() {
		Reporter.log("Disconnect to the database", true);
	}
}
