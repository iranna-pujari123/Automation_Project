package WebDriverPackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Demo {

	public static void main(String[] args) {
		
		ExtentReports reports= new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".//Report//re.html");
		sparkReporter.config().setTheme(Theme.STANDARD);
		reports.attachReporter(sparkReporter);
		ExtentTest test1= reports.createTest("Test 1");
		test1.pass("test case is passed");
		
		reports.createTest("Test 2").log(Status.FAIL, "test case failed");
		reports.createTest("Test3").log(Status.SKIP, "Skipped");
		
		
		reports.flush();

	}

}
