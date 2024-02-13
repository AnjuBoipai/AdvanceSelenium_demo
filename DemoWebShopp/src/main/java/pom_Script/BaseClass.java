package pom_Script;

import java.time.Duration;

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

public class BaseClass {
	public static ChromeDriver driver;
	@BeforeSuite
	public void ConnectServer()
	{
		Reporter.log("Connect to server",true);
	}
@BeforeTest
public void connectDB() {
	Reporter.log("Connect to database");
}
@BeforeClass
public void OpenBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
}
@BeforeMethod
public void toLogin() {
	driver.findElement(By.linkText(" "));
	Reporter.log("navigate to loginPage",true);
	}
@AfterMethod
public void toLogout() {
	Reporter.log("Browser got sucessfully logout",true);
}


@AfterClass
public void closerBrowser() {
	driver.quit();
}
@AfterTest
public void disconnectDB() {
	Reporter.log("Disconnect to the database",true);
}
}



