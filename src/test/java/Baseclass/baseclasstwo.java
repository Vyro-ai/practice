package Baseclass;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pageobjects.Discard_dialogue;
import pageobjects.EditImageScreen;
import pageobjects.Googlebg;
import utils.Testutils;

public class baseclasstwo {

	    public  static AndroidDriver<AndroidElement>  driver;
	protected Properties property;
	protected static String datetime;
	InputStream inputstream;
	protected static ThreadLocal <String> platform = new ThreadLocal<String>();
	protected static ThreadLocal <String> deviceName = new ThreadLocal<String>();
	//static Logger log= new LogManager(baseclasstwo.class.getName());
	Testutils utils ;
  @BeforeTest
  public void beforeTest() {
	  utils = new Testutils();
	  datetime=utils.dateTime();
	  try {
		 
		  property=new Properties();
		  String propertiesFilename="config.properties";
		  //input stream object to get properties file
		  inputstream= getClass().getClassLoader().getResourceAsStream(propertiesFilename);
		  property.load(inputstream);
	  DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Galaxy Note8");
	//	cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("udid", "ce06171653f0281f027e");
	//	cap.setCapability("deviceName", "Galaxy A31");
		//	cap.setCapability("automationName", "UiAutomator2");
	//		cap.setCapability("udid", "R58N500V2BW");
		cap.setCapability("automationName", property.getProperty("androidAutomationName"));
		cap.setCapability("autoGrantPermissions", true); 
		//cap.setCapability("autoAcceptAlerts", true);
		
		cap.setCapability("newCommandTimeout", 360);
		   cap.setCapability("skipUnlock", "true");
		//   cap.setCapability("systemPort", 8210);
		   
		 
	//	String path=System.getProperty("user.dir")+ File.separator+ "src"+ File.separator+ "test"+ File.separator+ "resources"+ File.separator+ "app-debug.apk";
	//	System.out.println("path  "+path);
	//	/Users/aqsa/eclipse-workspace/BGChangerFW/src/test/resources/app/app-debug.apk 
	//	cap.setCapability("app", "path");
	//	URL apppath=getClass().getClassLoader().getResource(property.getProperty("androidAppLocation"));
	//	cap.setCapability("app", "apppath");
	//	String path=System.getProperty("user.dir")+ File.separator+ "src"+ File.separator+ "main"+ File.separator+ "resources"+ File.separator+ "BG-v3.1.0.apk";
	//	cap.setCapability("app", path);
		cap.setCapability("appPackage", property.getProperty("androidAppPackage"));
		cap.setCapability("appActivity", property.getProperty("androidAppActivity"));
	//	cap.setCapability("skipDeviceInitialization",true);
				
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", "false");
		cap.setCapability("autoGrantPermissions", true); 
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver= new AndroidDriver<AndroidElement>(url,cap);
		 //Setup of Applitools Eyes
       

	  }
	  catch(Exception e) {
		  e.printStackTrace();	  }
  }
  public void wait(MobileElement e) {
	  
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(e));
}
  public void wait2(MobileElement e) {
	  
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(e));
}
  public void wait3(MobileElement e) {
	  
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOf(e));
}
  public void Implicit_wait() {
  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
  }
  public AndroidDriver<AndroidElement> getDriver() {
	return driver;
	  
  }
  public String getDateTime() {
	  return datetime;
  }
  
  public String getPlatform() {
	  return platform.get();
  }
  
  public void setPlatform(String platform2) {
	  platform.set(platform2);
  }
  

  
  public String getDeviceName() {
	  return deviceName.get();
  }
  public void screenshot(String filename) throws IOException, InterruptedException {
		
		String destDir = "editorscreenshots";
	    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//    new File(destDir).mkdirs();
	    File dest = new File("Editor Screenshots/" + filename+".png");
	//    File dest = new File(System.getProperty("user.dir")+"\\"+filename+".png");
//	    System.out.println(System.getProperty("user.dir"));
	    FileUtils.copyFile(scr, dest);
	}
  
  public void screenshot2(String filename) throws IOException, InterruptedException {
		
		String destDir = "editorscreenshots";
	    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//    new File(destDir).mkdirs();
	    File dest = new File("BG Screenshots/" + filename+".png");
	//    File dest = new File(System.getProperty("user.dir")+"\\"+filename+".png");
//	    System.out.println(System.getProperty("user.dir"));
	    FileUtils.copyFile(scr, dest);
	}
  public void screenshot3(String filename) throws IOException, InterruptedException {
		
		String destDir = "editorscreenshots";
	    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//    new File(destDir).mkdirs();
	    File dest = new File("BG Object Screenshots/" + filename+".png");
	//    File dest = new File(System.getProperty("user.dir")+"\\"+filename+".png");
//	    System.out.println(System.getProperty("user.dir"));
	    FileUtils.copyFile(scr, dest);
	}
  public void discard_changes() throws InterruptedException {
	  Discard_dialogue element2= new  Discard_dialogue((AndroidDriver) driver);
		//		 List<MobileElement> footer_options=element2.footer_options;
				 MobileElement yes_btn=element2.yes_discard;
				 MobileElement back_btn=element2.back_view;
				 MobileElement flip_btn=element2.flip_btn;
				 MobileElement discard_dialogue=element2.description;
				 Thread.sleep(3000);
				 back_btn.click();
				 System.out.println("back button clicked");
				 wait(discard_dialogue);
				 System.out.println("dialogue box given");
				 yes_btn.click();
				 
				 if(flip_btn.isDisplayed()) {
					 
					 System.out.println("TC:3 Changes are discarded !!");
					}
					else {
						AssertJUnit.assertTrue(false);
						System.out.println("Tch tch Failed ;(");
					}
  }
  public void last_bg() throws InterruptedException {
	//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			  Googlebg element2=new Googlebg((AndroidDriver)driver);
			//  MobileElement ocean_category=element2.ocean_category;
			  List<MobileElement> ocean_cat_images=element2.photo;
			  MobileElement apply_images=element2.use_btn;
			  MobileElement Searchbar=element2.eraser;
			  WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));
				ocean_cat_images.get(2).click();
			Thread.sleep(5000);
			  apply_images.click();
			  wait(Searchbar);
			
	  
  }
  @AfterTest
  public void afterTest() {
	//  driver.close();
	  driver.quit();
  }
}
