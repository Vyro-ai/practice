package Testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.EditImageScreen;
import pageobjects.Googlebg;
import pageobjects.pxbg;

public class google_bg_object_test extends baseclasstwo{
	 @Test
	  public void A_Testcase1() throws InterruptedException, IOException {
		
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement google_text=  element2.google_header;
		 
		  MobileElement gradient_tab=element1.gradient_tab;
		 
		  
		 gradient_tab.click();
			 
			 px_layout.get(2).click(); 
			 wait(google_text);
			 if(google_text.isDisplayed()==true) {
				 
				 System.out.println("TC:1 Google bg is displayed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to open Google bg");
				}
			 screenshot3("Google background");
	  }
	  @Test
	  public void B_Testcase2() throws InterruptedException {
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		//  List<MobileElement> px_layout=element1.Px_layout;
		 // MobileElement arch_tab=element1.architecture_tab;
		  Googlebg element2=new  Googlebg((AndroidDriver)driver);
		  MobileElement close_btn=element2.back_btn;
			MobileElement Searchbar=element2.eraser;
			
			close_btn.click();
		  
		//  wait(Searchbar);
			Thread.sleep(10000);
		  if(Searchbar.isDisplayed()==true) {
				 
				 System.out.println("Test case 2 is executed successfully-back to edit screen!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to close PX bg");
				}
		  
	  }
	  @Test
	  public void C_Testcase3() throws IOException, InterruptedException{
	//		WebDriverWait wait=new WebDriverWait(driver,60);
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout/android.widget.SearchView/android.widget.LinearLayout")));
	 
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  pxbg element3=new pxbg((AndroidDriver)driver);
	//	  List<MobileElement> categories=element3.categoriess;
	//	  categories.get(2).click();
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement google_text=  element2.google_header;
		  px_layout.get(2).click();
		  wait(google_text);
		  System.out.println("image view opened");
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		  
		  
		  MobileElement Searchbar=element2.search_bar;
		  MobileElement Searchclosebutton=element2.cross_search;
		  wait(Searchbar);
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));
		//	((AndroidDriver)driver).pressKeyCode(66);
			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			wait(Searchclosebutton);
		Searchclosebutton.click();
		 System.out.println("text in search bar: "+Searchbar.getText());
		  String empty="Search for amazing backgrounds";
		  System.out.println(Searchbar.getText());
		 
		  if(Searchbar.getText().equals(empty)) {
				 
				 System.out.println("Test case 3 is executed successfully!!!");
				}
				else { 
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}
		  screenshot3("Text in search bar");

	  }
	  @Test
	  public void D_Testcase4() throws IOException, InterruptedException{
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  MobileElement Searchbar=element2.search_bar;
		
		//  MobileElement Searchbutton=element2.gl_searchbutton;
			Searchbar.click();
			
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));

			Searchbar.click();
			((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.U));
			
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.M));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 System.out.println("text in search bar: "+Searchbar.getText());
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

		 screenshot2("Rumi bg's");
	/*	  if(driver.findElementById("com.vyroai.AutoCutCut:id/progress_loader").isDisplayed()) {
				 
				 System.out.println("Test case 4 is executed successfully!!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed");
				}
		 
*/
	  }
	  /*@Test
	  public void E_Testcase5() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  MobileElement cancel_images=element2.outer;
		  List<MobileElement> ocean_cat_images=element2.photo;
		  MobileElement apply_images=element2.use_btn;
		  MobileElement dragview=element2.photo_view;
		  WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/progress_loader")));
			ocean_cat_images.get(2).click();
		  wait(apply_images);
		  
		  Dimension size = driver.manage().window().getSize();

	        int last = (int) (size.height/0.7);
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
		 
	
		  
	  }*/
	  @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
		 
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
		
			 screenshot3("Bg applied");
		  
	  }
	
	
	/*  @Test
	  public void H_Testcase8() {

		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		
		  MobileElement cancel_images=element2.close_btn;
		
		  MobileElement cat_tab=element2.ocean_category;

		  cancel_images.click();
	 if(cat_tab.isDisplayed()==true) {
				 
				 System.out.println("TC:08 Category is closed !!!");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Failed to close bg category");
				}
		  
	  }*/
	  @Test
	  public void F_Testcase6() throws InterruptedException, IOException  {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		  Googlebg element2=new Googlebg((AndroidDriver)driver);
		  List<MobileElement> px_layout=element1.Px_layout;
		  MobileElement backtotop=element2.back_to_top;
		  MobileElement dragview=element2.drag_view;
		  MobileElement gradient_tab=element1.gradient_tab;
		  gradient_tab.click();
			 
		  px_layout.get(2).click();
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
			 screenshot3("Back to top");
	  }
	  @Test
	  public void G_Testcase7() throws InterruptedException, IOException  {
		  
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
					 screenshot3("Scolled image applied");
	  }
}
