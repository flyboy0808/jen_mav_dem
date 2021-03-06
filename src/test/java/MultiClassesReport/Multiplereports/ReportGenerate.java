package MultiClassesReport.Multiplereports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class ReportGenerate {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static  ChromeDriver webdriver;
 
  @BeforeSuite
  public void Setup() {
	  
		    htmlReporter = new ExtentHtmlReporter("WebsiteTestResult-Automation.html");
		    extent = new ExtentReports();
		    extent.attachReporter(htmlReporter);
		    
		    extent.setSystemInfo("OS", "Windows 10");
		    extent.setSystemInfo("Host Name", "Test");
		    extent.setSystemInfo("Environment", "QA");
		    extent.setSystemInfo("User Name", "Jayesh Bhandari");

		    htmlReporter.config().setChartVisibilityOnOpen(true);
		    htmlReporter.config().setDocumentTitle("Extent report");
		    htmlReporter.config().setReportName("Test Report");
		    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);	  
		    
		    //Chrome setup
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			 ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-dev-shm-usage");
                        webdriver = new ChromeDriver(chromeOptions);			
		//	webdriver = new ChromeDriver();
			webdriver.manage().window().maximize();
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  
  
  @AfterMethod
  public void getResults(ITestResult result) {
	   if(result.getStatus() == ITestResult.FAILURE)
	    {
	        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	        test.fail(result.getThrowable());
	    }
	    else if(result.getStatus() == ITestResult.SUCCESS)
	    {
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	    }
	    else
	    {
	        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	        test.skip(result.getThrowable());	        
	    }
  }


  @AfterSuite
  public void tearDown() {
       webdriver.quit();
	  extent.flush();
  }
}
