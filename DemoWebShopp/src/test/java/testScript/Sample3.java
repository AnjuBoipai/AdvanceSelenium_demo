package testScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample3 {

	@Test
	public void testCase() {
		ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\SAP\\eclipse-workspace\\DemoWebShopp\\ExtendReport\\report.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et = er.createTest("Sample3");
		et.log(Status.INFO, "test case successgfully attch to the report");
		er.flush();
	}
}
