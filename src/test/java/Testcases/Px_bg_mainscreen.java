package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.EditImageScreen;
import pageobjects.Gallery;
import pageobjects.Googlebg;
import pageobjects.pxbg;

public class Px_bg_mainscreen extends baseclasstwo{
	 @Test
	  public void A_Testcase1() throws InterruptedException, IOException {
		Thread.sleep(20000);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		//  List<MobileElement> px_layout=element1.Px_layout;
		//  Gallery element2=new Gallery((AndroidDriver)driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
			MobileElement Searchbar=element2.search_bar;
			
			 MobileElement google_text=  element2.google_header;
			 wait(Searchbar);
			 Searchbar.click(); 
			 Searchbar.sendKeys("rumi");
		// ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
			 Thread.sleep(3000);
		//	 ((AndroidDriver<AndroidElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
			 wait(google_text);
			 if(google_text.isDisplayed()==true) {
				 
				 System.out.println("TC:1 Google bg is displayed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open Google bg");
				}
			 screenshot2("Google bg via searchbox");
	  }
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		//  List<MobileElement> px_layout=element1.Px_layout;
		 // MobileElement arch_tab=element1.architecture_tab;
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement close_btn=element2.back_btn;
		  MobileElement Searchbar=element2.search_bar;
		  MobileElement Searchbar1=element2.eraser;
			close_btn.click();
		  
		//  wait(Searchbar);
			Thread.sleep(10000);
		  if(Searchbar1.isDisplayed()==true) {
				 
				 System.out.println("Test case 2 is executed successfully-back to edit screen!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to close PX bg");
				}
		  
	  }
	  @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
		 
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.photo;
		  MobileElement apply_images=element2.use_btn;
		  MobileElement Searchbar=element2.search_bar;
		  MobileElement Searchbar1=element2.eraser;
		  WebDriverWait wait=new WebDriverWait(driver,30);
		 
			 wait(Searchbar);
			 Searchbar.click();
			 Searchbar.sendKeys("rome");
		//	 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.SEARCH));
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));
		  px_cat_images.get(1).click();
		 Thread.sleep(5000);
		  apply_images.click();
		  wait(Searchbar1);
			 if(Searchbar1.isDisplayed()==true) {
					System.out.println("Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		
			 screenshot2("bg applied");
	  }
	  @Test
	  public void D_Testcase4(){
	//		WebDriverWait wait=new WebDriverWait(driver,60);
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.SearchView/android.widget.LinearLayout")));
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  MobileElement Searchbar=element2.search_bar;
		 
			 wait(Searchbar);
			 Searchbar.click();
			 Searchbar.sendKeys("rumi");
		//	 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.SEARCH));
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  MobileElement Searchclosebutton=element2.cross_search;
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));
		//	((AndroidDriver)driver).pressKeyCode(66);
			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			
		Searchclosebutton.click();
		 System.out.println("text in search bar: "+Searchbar.getText());
		  String empty="Search for amazing backgrounds";
		  if(Searchbar.getText().equals(empty)) {
				 
				 System.out.println("Test case 4 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}

	  }
	  @Test
	  public void E_Testcase5() throws IOException, InterruptedException{
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement Searchbar=element2.search_bar;
		
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.M));

			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.O));
			
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.O));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.N));
		 System.out.println("text in search bar: "+Searchbar.getText());
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

		/*  if(driver.findElementById("com.vyroai.AutoCutCut:id/progress_loader").isDisplayed()) {
				 
				 System.out.println("Test case 4 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}
		 */
		 screenshot2("Moon search");
	  }
	  @Test
	  public void F_Testcase6() throws InterruptedException, IOException {
		 
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
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
			 if(Searchbar.isDisplayed()==true) {
					System.out.println("TC:05 Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
		
			 screenshot2("Moon bg applied");
	  }
	
	/*  public void G_Testcase7() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  pxbg element2=new pxbg((AndroidDriver)driver);
		  List<MobileElement> px_cat_images=element2.Px_cat_images;
		  MobileElement Searchbar=element1.search_bar;
		  List<MobileElement> px_layout=element1.Px_layout;
	//	  MobileElement gradient_tab=element1.g;
	//	  gradient_tab.click();
		  MobileElement car_tab=element2.car_tab;
		  Searchbar.click();
			 Searchbar.sendKeys("rumi");
		//	 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.SEARCH));
		  driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		
		//  px_layout.get(0).click();
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  MobileElement download_images=element2.download_img;
		car_tab.click();
		 WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));
		  px_cat_images.get(1).click();
		  wait(download_images);
		  download_images.click();
			String Empty="Image Saved";
	         
	       	  String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");	  
	       	  System.out.println(toastMessage);
	       	if(toastMessage.contains(Empty)) {
	        	System.out.println("Image is successfully saved in gallery");	
	       	  
	       	}
	       	else {
	       		AssertJUnit.assertTrue(false);
	   			System.out.println("Tch tch Failed ;(");
	       	}
		
		  
	  }*/
	  @Test
	  public void G_Testcase7() throws IOException, InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);

		  MobileElement backtotop=element2.back_to_top;
		  MobileElement dragview=element2.drag_view;
	
		  MobileElement Searchbar=element2.search_bar;
			
			 MobileElement google_text=  element2.google_header;
			 wait(Searchbar);
			 Searchbar.click(); 
			 Searchbar.sendKeys("rumi");
		//	 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.SEARCH));
			 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
			 wait(google_text);
			 Dimension size = driver.manage().window().getSize();

		        int last = (int) (size.height/3);
		        System.out.println("height :"+size.height + "less than half" + last);
		        int last1 = (int) (size.height/2);
		        System.out.println("height :"+size.height + "less than half" + last1);
		        int xvalue = (int) (size.width/2);
		TouchAction action = new TouchAction(driver);
	  action.longPress(new ElementOption().withElement(dragview))
	          .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
	         .moveTo(PointOption.point(xvalue,last))
	          .release()
	          .perform(); 
			 if(backtotop.isDisplayed()==true) {
					System.out.println("TC:09 Woohoo Success :D ");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
			 screenshot2("Back to top1");
	  }
	  @Test
	  public void H_Testcase8() throws IOException, InterruptedException {
		  
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  List<MobileElement> ocean_cat_images=element2.photo;
		 
		  MobileElement apply_images=element2.use_btn;
		  MobileElement Searchbar=element2.eraser;
			  
			   ocean_cat_images.get(1).click();
			   Thread.sleep(5000);
				  apply_images.click();
				  wait(Searchbar);
					 if(Searchbar.isDisplayed()==true) {
							System.out.println("TC:05 Woohoo Success :D ");
						}
						else {
							AssertJUnit.assertTrue(false);
							System.out.println("Tch tch Failed ;(");
						}
					 screenshot2("Bg after scroll");
	  }
	
}
