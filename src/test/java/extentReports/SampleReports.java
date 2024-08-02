package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReports {
	@Test
	public void BasicReport() {
	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/sampleReport.html");
	spark.config().setDocumentTitle("sampleReport");
	spark.config().setReportName("Manikandan");
	spark.config().setTheme(Theme.DARK);
	
	ExtentReports report=new ExtentReports();
	report.setSystemInfo("Os","window-10");
	report.setSystemInfo("Browser", "Chrome-100");
	
	report.attachReporter(spark);
	ExtentTest test=report.createTest("BasicReport");
	test.log(Status.INFO,"report is successfully created");
	report.flush();
	
	}

}
