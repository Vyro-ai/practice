

package Listner;



import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Baseclass.baseclasstwo;
import Reports.ExtentReport2;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class TestListner2 implements ITestListener {
	//TestUtils utils = new TestUtils();
	
	public void onTestFailure(ITestResult result) {
		if(result.getThrowable() != null) {
			  StringWriter sw = new StringWriter();
			  PrintWriter pw = new PrintWriter(sw);
			  result.getThrowable().printStackTrace(pw);
		//	  utils.log().error(sw.toString());
			  System.out.println(sw.toString());
		}
		
		
		baseclasstwo base = new baseclasstwo();
		
		Map <String, String> params = new HashMap<String, String>();
		params = result.getTestContext().getCurrentXmlTest().getAllParameters();
		String imagePath = "Screenshots2" + File.separator + params.get("platformName") 
		+ "_" + params.get("deviceName") + File.separator + base.getDateTime() + File.separator 
		+ result.getTestClass().getRealClass().getSimpleName() + File.separator + result.getName() + ".png";
		
		String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;
		File file = base.getDriver().getScreenshotAs(OutputType.FILE);
		byte[] encoded = null;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileUtils.copyFile(file, new File(imagePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ExtentReport2.getTest().fail("Test Failed",
					MediaEntityBuilder.createScreenCaptureFromPath(completeImagePath).build());
			ExtentReport2.getTest().fail("Test Failed",
					MediaEntityBuilder.createScreenCaptureFromBase64String(new String(encoded, StandardCharsets.US_ASCII)).build());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExtentReport2.getTest().fail(result.getThrowable());
	}
	
	public void onTestStart(ITestResult result) {
		baseclasstwo base=new baseclasstwo();
		ExtentReport2.startTest(result.getName(), result.getMethod().getDescription()).assignCategory(base.getPlatform()+"-"+base.getDeviceName()).assignAuthor("Aqsa bukhari");
		
	}
	

	/*	BaseTest base = new BaseTest();
		File file = base.getDriver().getScreenshotAs(OutputType.FILE);
		
		byte[] encoded = null;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map <String, String> params = new HashMap<String, String>();
		params = result.getTestContext().getCurrentXmlTest().getAllParameters();
		
		String imagePath = "Screenshots" + File.separator + params.get("platformName") 
		+ "_" + params.get("deviceName") + File.separator + base.getDateTime() + File.separator 
		+ result.getTestClass().getRealClass().getSimpleName() + File.separator + result.getName() + ".png";
		
		String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;
		
		try {
			FileUtils.copyFile(file, new File(imagePath));
			Reporter.log("This is the sample screenshot");
			Reporter.log("<a href='"+ completeImagePath + "'> <img src='"+ completeImagePath + "' height='400' width='400'/> </a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExtentReport.getTest().fail("Test Failed",
				MediaEntityBuilder.createScreenCaptureFromPath(completeImagePath).build());
		ExtentReport.getTest().fail("Test Failed",
				MediaEntityBuilder.createScreenCaptureFromBase64String(new String(encoded, StandardCharsets.US_ASCII)).build());
		ExtentReport.getTest().fail(result.getThrowable());
		
	}
*//*
	@Override
	public void onTestStart(ITestResult result) {
		baseclasstwo base = new baseclasstwo();
		ExtentReport.startTest(result.getName(), result.getMethod().getDescription())
	//	.assignCategory(base.getPlatform() + "_" + base.getDeviceName())
		.assignAuthor("Omprakash");		
	}*/

	
	public void onTestSuccess(ITestResult result) {
		ExtentReport2.getTest().log(Status.PASS, "Test Passed");
		
		
	}


	public void onTestSkipped(ITestResult result) {
		ExtentReport2.getTest().log(Status.SKIP, "Test Skipped");
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		ExtentReport2.getReporter().flush();		
	}

}
