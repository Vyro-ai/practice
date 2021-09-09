package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.EditImageScreen;
import pageobjects.Filter_view;
import pageobjects.Overlay_view_Test;
import pageobjects.adjustment_view_pg;

public class Overlay_view extends baseclasstwo {

/*	@BeforeClass
	 public void auto_set_up() throws InterruptedException
	 {
	 eyes.open(driver, APP_NAME, TEST_NAME);
	 System.out.println("Eyes open");
	 Thread.sleep(10000);
	 }*/
	 @Test
	  public void A_Testcase1() throws InterruptedException {
	
		
		 Overlay_view_Test element2= new   Overlay_view_Test((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement undo=element2.undo;
		
		 wait(footer_options.get(2));
		 footer_options.get(2).click();
		 
		 MobileElement  close_overlay_view=element2.close_overlay_view;
		 
		 if( close_overlay_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened Overlay view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		 
		 
	 }
	 
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 Overlay_view_Test element2= new   Overlay_view_Test((AndroidDriver) driver);
				 MobileElement  close_overlay_view=element2.close_overlay_view;
		

		 
		 MobileElement save_img_view=element2.save_img_view;
		 close_overlay_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,Overlay view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close crop");
		 	}
		 
		 
		 
	 }
	
	 @Test
	  public void C_Testcase3() throws InterruptedException, URISyntaxException, IOException {
		
		 
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
		
		 MobileElement undo=element2.undo;
		 List<MobileElement> footer_options=element2.footer_options;
		 
		 footer_options.get(2).click();
	//	 rotate_view.click();
		 System.out.println("Clicked on Overlay");
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 
		
		 for(int i=0;i<5;i++) {
			 overlay_options.get(i).click();
			
		
			 apply_overlay.click();
			 
			 wait(save_img_view);
			 screenshot("Overlay "+(i+1)+" applied");
		//	 eyes.checkWindow("Filter "+i+" Screen");
            undo(i,undo);
            footer_options.get(2).click();

				 System.out.println("i="+i); 	 
		 }  

	 }
	 @Test
	  public void D_Testcase4() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
		
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 for(int i=0;i<5;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
			 AndroidElement firdelement=e.get(0);
		
			 AndroidElement thirdElement=e.get(2);
		
			 AndroidElement sixthElement=e.get(5);	
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=sixthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("1st scroll done"); 
			 
			 overlay_options.get(i).click();
			
			
			 apply_overlay.click();
			 wait(save_img_view);
			 screenshot("Overlay "+(i+6)+" applied");
		//	 eyes.checkWindow(i+" filter after 1st scroll");
			 undo(i+6,undo);
			 footer_options.get(2).click();
				 System.out.println("i="+i); 
				 
		 }
	 }
	 @Test
	  public void E_Testcase5() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		
		 MobileElement save_img_view=element2.save_img_view;
		 System.out.println("reached till initialiation"); 
		 for(int i=0;i<5;i++) {
				
			 for(int j=0;j<2;j++) {
				 System.out.println("start of loop"); 
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
			 AndroidElement firdelement=e.get(0);
			
			 AndroidElement thirdElement=e.get(2);
			 
			 AndroidElement sixthElement=e.get(5);
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=sixthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 System.out.println("got scroll element");
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("2nd time scroll done"); 
			 }
			 overlay_options.get(i).click();
		//	 Actions crop = new Actions(driver);
		//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
		//	 Thread.sleep(10000);
			
			 apply_overlay.click();
			 wait(save_img_view);
			 screenshot("Overlay "+(i+11)+" applied");
		//	 eyes.checkWindow(i+" filter after 2nd scroll");
			 undo(i+11,undo);
			 footer_options.get(2).click();
				 System.out.println("i="+i); 

			 		 
		 } 
	 }
	 @Test
	  public void F_Testcase6() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		 MobileElement close_editor=element2.back_view;
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 MobileElement forward_icon=element1.forward_icon;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 MobileElement close_overlay_view=element2.close_overlay_view;
		 close_overlay_view.click();
		 
		 discard_changes();
		 forward_icon.click();
		wait(footer_options.get(2));
		 footer_options.get(2).click();
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<3;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
			
				 AndroidElement thirdElement=e.get(2);
				
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("3rd scroll done"); 
			 }
			 overlay_options.get(i).click();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+16)+" applied");
				//	 eyes.checkWindow(i+" filter after 3rd scroll");
					 undo(i,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 }  
	 }
	 @Test
	  public void G_Testcase7() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
		 List<MobileElement> footer_options=element2.footer_options;

		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<4;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
			
				 AndroidElement thirdElement=e.get(2);
				
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("4th scroll done"); 
			 }
			 overlay_options.get(i).click();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+21)+" applied");
			//		 eyes.checkWindow(i+" filter after 4th scroll");
					 undo(i+6,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
	 }
	 @Test
	  public void H_Testcase8() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<5;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
				
				 AndroidElement thirdElement=e.get(2);
			
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("5th scroll done"); 
			 }
			 overlay_options.get(i).click();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+26)+" applied");
			//		 eyes.checkWindow(i+" filter after 5th scroll");
					 undo(i+11,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
	 }
	 @Test
	  public void I_Testcase9() throws InterruptedException, URISyntaxException, IOException {
		 
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		 MobileElement close_editor=element2.back_view;
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 MobileElement forward_icon=element1.forward_icon;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 MobileElement close_overlay_view=element2.close_overlay_view;
		 close_overlay_view.click();
		 
		 discard_changes();
		 forward_icon.click();
		 wait( footer_options.get(2));
		 footer_options.get(2).click();
		 for(int i=0;i<6;i++) {
			 for(int j=0;j<6;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
				
				 AndroidElement thirdElement=e.get(2);
				 
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("6th scroll done"); 
			 }
			 overlay_options.get(i).click();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+31)+" applied");
		//			 eyes.checkWindow(i+" filter after 6th scroll");
					 undo(i,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
		 
		 MobileElement close_overlay_view1=element2.close_overlay_view;

		 close_overlay_view1.click();
	 }
	 
	 // ________________________________________________________
	 
	 @Test
	  public void J_Testcase10() throws InterruptedException, URISyntaxException, IOException {
		
		 
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
		
		 MobileElement undo=element2.undo;
		 List<MobileElement> footer_options=element2.footer_options;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
		
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
		 footer_options.get(2).click();
	//	 rotate_view.click();
		 System.out.println("Clicked on Overlay");
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 
		
		 for(int i=0;i<5;i++) {
			 overlay_options.get(i).click();
			
			  int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
			 apply_overlay.click();
			 
			 wait(save_img_view);
			 screenshot("Overlay "+(i+1)+" LB");
		//	 eyes.checkWindow("Filter "+i+" Screen");
           undo(i+6,undo);
           footer_options.get(2).click();

				 System.out.println("i="+i); 	 
		 }  

	 }
	 @Test
	  public void K_Testcase11() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
		
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
			
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 for(int i=0;i<5;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
			 AndroidElement firdelement=e.get(0);
			
			 AndroidElement thirdElement=e.get(2);
		
			 AndroidElement sixthElement=e.get(5);	
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=sixthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("1st scroll done"); 
			 
			 overlay_options.get(i).click();
			 int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
			
			 apply_overlay.click();
			 wait(save_img_view);
			 screenshot("Overlay "+(i+6)+" LB");
		//	 eyes.checkWindow(i+" filter after 1st scroll");
			 undo(i+12,undo);
			 footer_options.get(2).click();
				 System.out.println("i="+i); 
				 
		 }
	 }
	 @Test
	  public void L_Testcase12() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
		 MobileElement save_img_view=element2.save_img_view;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
			
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
		 System.out.println("reached till initialiation"); 
		 for(int i=0;i<5;i++) {
				
			 for(int j=0;j<2;j++) {
				 System.out.println("start of loop"); 
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
			 AndroidElement firdelement=e.get(0);
		
			 AndroidElement thirdElement=e.get(2);
		
			 AndroidElement sixthElement=e.get(5);
			 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
			 int fromXLocation=sixthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 System.out.println("got scroll element");
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("2nd time scroll done"); 
			 }
			 overlay_options.get(i).click();
			 int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
		//	 Actions crop = new Actions(driver);
		//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
		//	 Thread.sleep(10000);
			
			 apply_overlay.click();
			 wait(save_img_view);
			 screenshot("Overlay "+(i+11)+" LB");
		//	 eyes.checkWindow(i+" filter after 2nd scroll");
			 undo(i+17,undo);
			 footer_options.get(2).click();
				 System.out.println("i="+i); 

			 		 
		 } 
	 }
	 @Test
	  public void M_Testcase13() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		 MobileElement close_editor=element2.back_view;
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 MobileElement forward_icon=element1.forward_icon;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 MobileElement close_overlay_view=element2.close_overlay_view;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
			
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
		 close_overlay_view.click();
		
		 discard_changes();
		 forward_icon.click();
		 wait(footer_options.get(2));
		 footer_options.get(2).click();
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<3;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
	Thread.sleep(2000);
				 AndroidElement firdelement=e.get(0);
			
				 AndroidElement thirdElement=e.get(2);
				
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("3rd scroll done"); 
			 }
			 overlay_options.get(i).click();
			 int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+16)+" LB");
				//	 eyes.checkWindow(i+" filter after 3rd scroll");
					 undo(i,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 }  
	 }
	 @Test
	  public void N_Testcase14() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
		 List<MobileElement> footer_options=element2.footer_options;

		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
			
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<4;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
				
				 AndroidElement thirdElement=e.get(2);
			
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("4th scroll done"); 
			 }
			 overlay_options.get(i).click();
			 int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+21)+" LB");
			//		 eyes.checkWindow(i+" filter after 4th scroll");
					 undo(i+6,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
	 }
	 @Test
	  public void O_Testcase15() throws InterruptedException, URISyntaxException, IOException {
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
			
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<5;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
			
				 AndroidElement thirdElement=e.get(2);
				
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("5th scroll done"); 
			 }
			 overlay_options.get(i).click();
			 int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+26)+" LB");
			//		 eyes.checkWindow(i+" filter after 5th scroll");
					 undo(i+11,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
	 }
	 @Test
	  public void P_Testcase16() throws InterruptedException, URISyntaxException, IOException {
		 
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;
	
		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		 MobileElement close_editor=element2.back_view;
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 MobileElement forward_icon=element1.forward_icon;
		 adjustment_view_pg  element3= new  adjustment_view_pg ((AndroidDriver) driver);
			
			
		 MobileElement intensity_slider=(MobileElement) element3.intensity_slider;
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 MobileElement close_overlay_view=element2.close_overlay_view;
		 close_overlay_view.click();
		 discard_changes();
		 forward_icon.click();
		 Thread.sleep(5000);
		 footer_options.get(2).click();
		 for(int i=0;i<6;i++) {
			 for(int j=0;j<6;j++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
				 AndroidElement thirdElement=e.get(2);
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("6th scroll done"); 
			 }
			 overlay_options.get(i).click();
			 int start=intensity_slider.getLocation().getX();
	            System.out.println("start :"+start);
	            //Get width of seekbar
	            int end=intensity_slider.getSize().getWidth();
	            System.out.println("end :"+end);
	            //get location of seekbar vertically
	            int y=intensity_slider.getLocation().getY();
	            System.out.println("y:"+y);
	        // Select till which position you want to move the seekbar
	        TouchAction action1=new TouchAction(driver);

	        //Move it will the end
	/*        action.press(PointOption.point(start,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	        .moveTo(PointOption.point(end, y)).release().perform();
	  //      action.press(start,y).moveTo(end,y).release().perform();
*/
	        //Move it 40%
	        int moveTo=(int)(end*0.7);
	        System.out.println("move to:"+moveTo);
	        action1.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo, y)).release().perform();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
					 screenshot("Overlay "+(i+31)+" LB");
		//			 eyes.checkWindow(i+" filter after 6th scroll");
					 undo(i,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
		 
		 MobileElement close_overlay_view1=element2.close_overlay_view;

		 close_overlay_view1.click();
	 }
	/* @Test
	  public void J_Testcase10() throws MalformedURLException, InterruptedException, URISyntaxException {
		 System.out.println("initialization"); 
		 Overlay_view_Test element2= new  Overlay_view_Test((AndroidDriver) driver);
			
			
		 List<MobileElement> footer_options=element2.footer_options;

		 //Open Eyes and start visual testing
		
		 List<MobileElement> overlay_options=element2.overlay_options;
		 MobileElement undo=element2.undo;
//		 MobileElement cropTracker=element2.image_view;
		 MobileElement apply_overlay=element2.apply_overlay;
		 MobileElement close_editor=element2.back_view;
		 System.out.println("initialization 2"); 
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 MobileElement forward_icon=element1.forward_icon;
	
		// TouchAction actions=new TouchAction(driver);
		 //actions.cr
		 MobileElement save_img_view=element2.save_img_view;
	//	 MobileElement crop_recycler_view=element2.crop_recyclerview;
		 System.out.println("before  loop"); 
		 Thread.sleep(10000);
		 for(int i=0;i<6;i++) {
			 for(int j=0;j<7;j++) {
				 System.out.println("inside loop"); 
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemName\")"));
				 AndroidElement firdelement=e.get(0);
				 AndroidElement secondElement=e.get(1);
				 AndroidElement thirdElement=e.get(2);
				 AndroidElement fourthElement=e.get(3);	
				 AndroidElement fifthElement=e.get(4);
				 AndroidElement sixthElement=e.get(5);
				 int midOfY =thirdElement.getLocation().y +(thirdElement.getSize().height/2);
				 int fromXLocation=sixthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 System.out.println("scroll tried"); 
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println("7th scroll done"); 
			 }
			 overlay_options.get(i).click();
				//	 Actions crop = new Actions(driver);
				//	 ((Actions) crop).clickAndHold(cropTracker).moveByOffset(0,100).release().build().perform();
				//	 Thread.sleep(10000);
					
					 apply_overlay.click();
					 wait(save_img_view);
				
					 eyes.checkWindow(i+" filter after 7th scroll");
					 undo(i+6,undo);
					 footer_options.get(2).click();
						 System.out.println("i="+i); 

			 		 
		 } 
		 
		 MobileElement close_overlay_view=element2.close_overlay_view;

		 close_overlay_view.click();
	 }*/
	 public void undo(int i,MobileElement undo) {
		 for(int j=0;j<=i;j++) {
			 undo.click();
			 System.out.println("undodone"+i+"times"); 
		 }
		
	 }
	
	/*  @AfterClass
	    public void teardown() {
		  eyes.close();
	        System.out.println("closed window");
	        //Abort eyes if it is not closed
	        eyes.abortIfNotClosed();
	    }*/
}
