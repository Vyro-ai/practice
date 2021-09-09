package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Fit_view;
import pageobjects.Structures_pg;

public class Fit_test extends baseclasstwo{

	 @Test
	  public void A_Testcase1() throws InterruptedException {
	
		Fit_view element2= new  Fit_view((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
	
		 wait(footer_options.get(2));
		 footer_options.get(5).click();
		 
		 MobileElement  close_view=element2.close_fit_view;
		 
		 if(close_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened Structures view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		 
	 }


	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 Fit_view element2= new  Fit_view((AndroidDriver) driver);
				 
		 MobileElement  close_view=element2.close_fit_view;
		

		 
		 MobileElement save_img_view=element2.save_btn;
		 close_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,fit view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close Structures");
		 	}
		 
		 
		 
	 }
	 @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
			Fit_view element2= new  Fit_view((AndroidDriver) driver);
			 List<MobileElement> footer_options=element2.footer_options;
			 List<MobileElement> color_options=element2.colors;
		
			 MobileElement reset=element2.reset;
			
		//	 wait(footer_options.get(2));
			 footer_options.get(5).click();
			 color_options.get(0).click();
			 
			 reset.click();
			 screenshot("Reset fit");
			 
		 
	 }
	 @Test
	  public void D_Testcase4() throws InterruptedException, IOException {
		 
		 Fit_view element2= new  Fit_view((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 List<MobileElement> color_options=element2.colors;
		 List<MobileElement> grid_options=element2.grids;
		 MobileElement apply=element2.apply_structure;
		 MobileElement close_fit=element2.close_fit_view;
		 MobileElement save_img_view=element2.save_btn;
		 MobileElement undo=element2.undo;
		 
	 for(int i=0;i<3;i++) {
		 grid_options.get(i).click();
		
		 apply.click();
		 
		 wait(save_img_view);
		 screenshot("Fit Grid "+(i+1));
		 undo(i,undo);

		 footer_options.get(5).click();
//		 if(i!=0 && i % 4 == 0) {
			 System.out.println("i="+i); 

		 		 
	 }
	 
	 for(int j=0;j<3;j++) {
		
scroll();
	 
		 grid_options.get(j).click();
		
		 apply.click();
		 
		 wait(save_img_view);
		 screenshot("Fit Grid "+(j+4));
		 undo(j+3,undo);

		 
	 footer_options.get(5).click();
	 }
	 System.out.println("first time all done"); 
	 for(int j=0;j<3;j++) {
			
		 scroll();
		 scroll();
		 	 
		 	 
		 		 grid_options.get(j).click();
		 		
		 		 apply.click();
		 		 
		 		 wait(save_img_view);
		 		screenshot("Fit Grid "+(j+7));
		 		 undo(j+6,undo);

		 		
		 	footer_options.get(5).click();
		 	 }
	 
	 for(int i=0;i<3;i++) {
			
		 scroll();
		 scroll();
		 scroll();
		 	 
		 	 
		 		 grid_options.get(i+2).click();
		 		
		 		 apply.click();
		 		 
		 		 wait(save_img_view);
		 		screenshot("Fit Grid "+(i+10));
		 		 undo(i+9,undo);

		 		 
		 	footer_options.get(5).click();
		 	 }
		 
	 
	 close_fit.click();
/*	 if(j==2) {
		 
		 for(int i=0;i<3;i++) {
			 grid_options.get(i+2).click();
			
			 apply.click();
			 
			 wait(save_img_view);
			 undo(i+3,undo);

			 footer_options.get(5).click();
//			 if(i!=0 && i % 4 == 0) {
				 System.out.println("i="+i); 

			 		 
		 }
	 }
	 else if (j==0){
		 
	 
	 for(int i=0;i<3;i++) {
		 grid_options.get(i).click();
		
		 apply.click();
		 
		 wait(save_img_view);
		 undo(i+3,undo);

		 footer_options.get(5).click();
//		 if(i!=0 && i % 4 == 0) {
			 System.out.println("i="+i); 
			 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/featureThumb\")"));
			 AndroidElement firdelement1=e1.get(0);	
			 AndroidElement fourthElement1=e1.get(3);	
			 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
			 int fromXLocation1=fourthElement1.getLocation().x;
			 int toXLocation1=firdelement1.getLocation().x;
			 						
			 TouchAction  action1 =new TouchAction(driver);
			 action1.press(PointOption.point(fromXLocation1+60, midOfY1))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation1, midOfY1))
			 .release()
			 .perform();
			 System.out.println(" scroll2 done");

		 		 
	 }
	 }
	 
	 else if (j==1){
		 
		 
	 for(int i=0;i<3;i++) {
		 grid_options.get(i).click();
		
		 apply.click();
		 
		 wait(save_img_view);
		 undo(i+3,undo);

		 footer_options.get(5).click();
//		 if(i!=0 && i % 4 == 0) {
		 
			 System.out.println("i="+i); 
			
 scroll();
 scroll();
 
		 		 
	 }
	 }*/
	 
	 
	 }
	 
/*	 @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
		 
		 Fit_view element2= new  Fit_view((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 List<MobileElement> color_options=element2.colors;
		 List<MobileElement> grid_options=element2.grids;
		 MobileElement apply=element2.apply_structure;
		 MobileElement close_fit=element2.close_fit_view;
		 MobileElement save_img_view=element2.save_btn;
		 MobileElement undo=element2.undo;
		 
	 for(int i=0;i<3;i++) {
		 color_options.get(i).click();
		
		 apply.click();
		 
		 wait(save_img_view);
		 screenshot("Fit Color "+(i+1));
		 undo(i,undo);

		 footer_options.get(5).click();
//		 if(i!=0 && i % 4 == 0) {
			 System.out.println("i="+i); 

		 		 
	 }
	 
	 for(int j=0;j<6;j++) {
		

	 
		 color_options.get(j+3).click();
		 screenshot("Fit Color "+(j+4));
		 
		
		 
	
	 }
	 scroll2();
	 for(int i=0;i<7;i++) {
	 for(int j=0;j<9;j++) {
			

		 
		 color_options.get(j).click();
		 Thread.sleep(2000);
		 screenshot("Fit Color "+(j+10)+" in "+j+" scroll");
		
	
	 }
	 scroll2();
	 }
	 
	 
	 apply.click();
	 
	 wait(save_img_view);
	 
	 
	 }*/
	 public void scroll() {
		 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/featureThumb\")"));
		 AndroidElement firdelement1=e1.get(0);	
		 AndroidElement fourthElement1=e1.get(3);	
		 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
		 int fromXLocation1=fourthElement1.getLocation().x;
		 int toXLocation1=firdelement1.getLocation().x;
		 						
		 TouchAction  action1 =new TouchAction(driver);
		 action1.press(PointOption.point(fromXLocation1+60, midOfY1))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation1, midOfY1))
		 .release()
		 .perform();
		 System.out.println(" scroll done");
	 }
	 
	 public void scroll2() {
		 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
		 AndroidElement firdelement1=e1.get(0);	
		 AndroidElement fourthElement1=e1.get(8);	
		 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
		 int fromXLocation1=fourthElement1.getLocation().x;
		 int toXLocation1=firdelement1.getLocation().x;
		 						
		 TouchAction  action1 =new TouchAction(driver);
		 action1.press(PointOption.point(fromXLocation1+60, midOfY1))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation1, midOfY1))
		 .release()
		 .perform();
		 System.out.println(" scroll2 done");
	 }
public void undo(int i,MobileElement undo) {
	 for(int j=0;j<=i;j++) {
		 undo.click();
		 System.out.println("undodone"+i+"times"); 
	 }
}
}