package testScript;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleTest4 {
public void testCase() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String image = driver.getScreenshotAs(OutputType.BASE64);
	ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\SAP\\eclipse-workspace\\DemoWebShopp\\ExtendReport\\report.html");
	ExtentReports er=new ExtentReports();
	er.attachReporter(esr);
	ExtentTest et = er.createTest("SampleTest4");
	et.log(Status.INFO, "test case successgfully attch to the report");
	er.flush();
}
}
