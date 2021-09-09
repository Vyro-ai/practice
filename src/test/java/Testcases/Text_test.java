package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
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
import pageobjects.Stickres_pg;
import pageobjects.Textview;

public class Text_test extends baseclasstwo{

	 @Test
	  public void A_Testcase1() throws InterruptedException {
		 
		 Textview element2= new   Textview((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 wait(footer_options.get(2));
		 MobileElement undo=element2.undo;
		 MobileElement  close_text_view=element2.close_text_view;
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/iconImage\")"));
		 AndroidElement firdelement=e.get(0);	
		 AndroidElement fourthElement=e.get(4);	
		 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
		 int fromXLocation=fourthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 System.out.println(" scroll done"); 
	//	 wait(footer_options.get(2));
		 footer_options.get(5).click();
		 
	//	 List<MobileElement>  footer=driver.findElementsById("com.vyroai.AutoCutCut:id/footerView");
	//	System.out.println("no.of items : "+ footer.size()); 
		
		 
		 wait(close_text_view);
		 if(close_text_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened text view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		
		 
	 }
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 Textview element2= new   Textview((AndroidDriver) driver);
				 
		 MobileElement  close_text_view=element2.close_text_view;
		

		 
		 MobileElement save_img_view=element2.save_btn;
		 close_text_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,text view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close Structures");
		 	}
		 
		 
		 
	 }
	 @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
		 Textview element2= new   Textview((AndroidDriver) driver);
		
		 MobileElement add_text=element2.add_text;
		 List<MobileElement> footer_options=element2.footer_options;
		 footer_options.get(5).click();
		 add_text.click();
		    Thread.sleep(10000);
		    
		    MobileElement done_img_view=element2.done_button;
		    screenshot("Add Text View");
		
			 if(done_img_view.isDisplayed()==true) {
			 	 
			 	 System.out.println("TC:3 Add text is displayed !!!");
			 	}
			 	else {
			 		AssertJUnit.assertTrue(false);
			 		System.out.println("Failed to open add text");
			 	}
			 
	 }
	 @Test
	  public void D_Testcase4() throws InterruptedException {
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		 Textview element2= new   Textview((AndroidDriver) driver);
		 MobileElement add_text=element2.add_text;
		
		 add_text.click();
	 }
	 @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.M));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.R));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.A));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.C));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.L));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.E));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.S));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.SPACE));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.D));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.W));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.E));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.L));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.L));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.N));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.SPACE));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.N));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.V));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.S));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.B));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.L));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.E));
		 
		 Textview element2= new   Textview((AndroidDriver) driver);
		 MobileElement text_alignment=element2.text_alignment;
		 text_alignment.click();
		 screenshot("Text left aligned");
		 text_alignment.click();
		 screenshot("Text right aligned");
		 text_alignment.click();
		 screenshot("Text center aligned");
		
	 }
	 @Test
	  public void F_Testcase6() throws InterruptedException, IOException {
		 
		 Textview element2= new   Textview((AndroidDriver) driver);
		List<MobileElement> font_style=element2.font_style;
	/*	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/fontTextView\")"));
		 AndroidElement firdelement=e.get(0);

		 AndroidElement fifthElement=e.get(2);	
		 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
		 int fromXLocation=fifthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation+60, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 
		 System.out.println(" scroll done");*/
		for(int i=0;i<4;i++) {
			font_style.get(i).click();
			Thread.sleep(2000);
			 screenshot("font style "+ (i+1));
			System.out.println("font no "+i +" is applied");
			
			
		}
		int l=font_style.size();
		System.out.println("size is equal to  " + l );
		
		for(int j=0;j<17;j++) {
		font_style.get(4).click();
		Thread.sleep(2000);
		 screenshot("font style "+ (j+5));
		System.out.println("font no "+ (j+4) +" is applied");
		System.out.println("size is equal to  " + font_style.size());
		

		}
	/*	 for(int j=0;j<5;j++) {
		for(int i=0;i<3;i++) {
			font_style.get(4).click();
			Thread.sleep(2000);
			System.out.println("font no "+i +" is applied");
			
			
		}
		 }
		 for(int i=0;i<2;i++) {
				font_style.get(4).click();
				Thread.sleep(2000);
				System.out.println("font no "+i +" is applied");
				
				
			}
		 */
		 
	 }
	 @Test
	  public void G_Testcase7() throws InterruptedException, IOException {
		 
		 Textview element2= new   Textview((AndroidDriver) driver);
			List<MobileElement> font_color_style=element2.font_color_options;
			MobileElement font_color=element2.font_color;
			font_color.click();
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/color_picker_view\")"));
			 AndroidElement firdelement=e.get(0);

			 AndroidElement fifthElement=e.get(3);	
			 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 
			 System.out.println(" scroll done");
			 for(int j=0;j<9;j++) {
			for(int i=0;i<3;i++) {
				font_color_style.get(4).click();
				Thread.sleep(2000);
				 screenshot("font color "+ (i+1) +" in "+ j+ " loop");
				System.out.println("font color "+i +" is applied");
				
				
			}
			 }
			
				 font_color_style.get(4).click();
			
	 }
/*	 @Test
	  public void H_Testcase8() throws InterruptedException {
		 
		 Textview element2= new   Textview((AndroidDriver) driver);
			List<MobileElement> font_bg_color_style=element2.font_color_options;
			MobileElement font_bg=element2.font_background;
			font_bg.click();
			System.out.println(font_bg_color_style.size()); 
		//	int size=font_bg_color_style.size();
		//	font_bg_color_style.get(4).click();
			int size=font_bg_color_style.size();
			System.out.println(font_bg_color_style.size()); 
		/*	List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/color_picker_view\")"));
			 AndroidElement firdelement=e.get(0);

			 AndroidElement fifthElement=e.get(3);	
			 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(toXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(fromXLocation+60, midOfY))
			 .release()
			 .perform();
			 
			 System.out.println(" scroll done");*/
	/*		for(int j=0;j<15;j++) {
			for(int i=size-1;i>0;i--) {
				font_bg_color_style.get(i).click();
				Thread.sleep(2000);
				System.out.println("font bg color "+i +" is applied");
			}
			}
			font_bg_color_style.get(0).click();
			__________________
			*/
	/*		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/color_picker_view\")"));
			 AndroidElement firdelement=e.get(0);

			 AndroidElement fifthElement=e.get(3);	
			 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(toXLocation, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(fromXLocation+60, midOfY))
			 .release()
			 .perform();
			 
			 System.out.println(" scroll done");
			 for(int j=0;j<9;j++) {
			for(int i=0;i<3;i++) {
				font_bg_color_style.get(4).click();
				Thread.sleep(2000);
				System.out.println("font bg color "+i +" is applied");
				
				
			}
			 }
			 for(int i=0;i<2;i++) {
			 font_bg_color_style.get(4).click();
			 Thread.sleep(2000);
				System.out.println("font bg color "+i +" is applied");
			 }*/
//	 }
	 @Test
	  public void I_Testcase9() throws InterruptedException {
		 Textview element2= new   Textview((AndroidDriver) driver);
			MobileElement done=element2.done_button;
			
			done.click();
	 }
		
	
	
	 
	 @Test
	  public void J_Testcase10() throws InterruptedException, IOException {
		 Textview element2= new   Textview((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement donebutton=element2.done_button;
		 MobileElement apply_button=element2.apply_text;
		 List<MobileElement> texts=element2.texts;
		 List<MobileElement> footer_options=element2.footer_options;
		 
		
    for(int i=0;i<6;i++) {
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
    	texts.get(i+i).click();
    	donebutton.click();
    	apply_button.click();
    	 screenshot("Text "+i+" added from phrases ");
    	MobileElement undo=element2.undo;
   	 undo(i,undo);
	 footer_options.get(5).click();
    	
    	
    }
	 }
	 @Test
	  public void K_Testcase11() throws InterruptedException, IOException {
		 Textview element2= new   Textview((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement donebutton=element2.done_button;
		 MobileElement apply_button=element2.apply_text;
		 List<MobileElement> texts=element2.texts;
		 List<MobileElement> footer_options=element2.footer_options;
		 List<MobileElement> font_options=element2.font_style;
		 List<MobileElement> text_options=element2.textoptions_options;
		 List<MobileElement> font_color_style=element2.font_color_options;
			List<MobileElement> font_bg_color_style=element2.font_color_options;
			MobileElement font_bg=element2.font_background;
			MobileElement font_color=element2.font_color;
		 
			
		    for(int i=0;i<6;i++) {
		    	text_options.get(1).click();
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
		    	texts.get(i+i).click();
		   if(i==0) {
		    	font_options.get(0).click();
		    	font_color.click();
		    	font_color_style.get(2).click();
		    	font_bg.click();
		    	font_bg_color_style.get(1).click();
		   }
		   else {
			   System.out.println("no editing please !!!"); 
		   }
		    	donebutton.click();
		    	
		    	apply_button.click();
		    	 screenshot("Text "+i+" from Captions cat");
		    	MobileElement undo=element2.undo;
		   	 undo(i+6,undo);
			 footer_options.get(5).click();
		    	
		    	
		    }
		 
		 
	 }
	 @Test
	  public void L_Testcase12() throws InterruptedException, IOException {
		 Textview element2= new   Textview((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement donebutton=element2.done_button;
		 MobileElement apply_button=element2.apply_text;
		 List<MobileElement> texts=element2.texts;
		 List<MobileElement> footer_options=element2.footer_options;
		
		 List<MobileElement> text_options=element2.textoptions_options;
		 List<MobileElement> font_color_style=element2.font_color_options;
			List<MobileElement> font_bg_color_style=element2.font_color_options;
			MobileElement font_bg=element2.font_background;
			MobileElement font_color=element2.font_color;
		 
			
		    for(int i=0;i<2;i++) {
		    	text_options.get(2).click();
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
		    	texts.get(i).click();
		   if(i==0) {
		    //	font_options.get(0).click();
		    	font_color.click();
		    	font_color_style.get(2).click();
		    	font_bg.click();
		    	font_bg_color_style.get(1).click();
		   }
		   else {
			   System.out.println("no editing please !!!"); 
		   }
		    	donebutton.click();
		    	
		    	apply_button.click();
		    	 screenshot("Text "+i+" from Qoutes cat");
		    	MobileElement undo=element2.undo;
		   	 undo(i+12,undo);
			 footer_options.get(5).click();
		    	
		    	
		    }
		 
		 
	 }
	 @Test
	  public void M_Testcase13() throws InterruptedException, IOException {
		 Textview element2= new   Textview((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement donebutton=element2.done_button;
		 MobileElement apply_button=element2.apply_text;
		 List<MobileElement> texts=element2.texts;
		 List<MobileElement> footer_options=element2.footer_options;
		 List<MobileElement> font_options=element2.font_style;
		 List<MobileElement> text_options=element2.textoptions_options;
		 List<MobileElement> font_color_style=element2.font_color_options;
			List<MobileElement> font_bg_color_style=element2.font_color_options;
			MobileElement font_bg=element2.font_background;
			MobileElement font_color=element2.font_color;
		 
			
		    for(int i=0;i<2;i++) {
		    	text_options.get(3).click();
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
		 Dimension size1 = driver.manage().window().getSize();

		 int startX = size1.width / 2;
		 int endX = startX;
		 int startY = (int) (size1.height * 0.8);
		 int endY = (int) (size1.height * 0.1);
 
		 TouchAction t = new TouchAction(driver);
		 t.press(PointOption.point(startX, startY))
		         .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		         .moveTo(PointOption.point(endX, endY))
		         .release()
		         .perform();
		    	texts.get(i+i).click();
		   if(i==0) {
		    	font_options.get(0).click();
		    	font_color.click();
		    	font_color_style.get(2).click();
		    	font_bg.click();
		    	font_bg_color_style.get(1).click();
		   }
		   else {
			   System.out.println("no editing please !!!"); 
		   }
		    	donebutton.click();
		    	
		    	apply_button.click();
		    	 screenshot("Text "+i+" from paragraph cat");
		    	MobileElement undo=element2.undo;
		   	 undo(i+14,undo);
			 footer_options.get(5).click();
		    	
		    	
		    }
		    
		    MobileElement close_structure_view=element2.close_text_view;

			 close_structure_view.click();
		 
		 
	 }
	 public void undo(int i,MobileElement undo) {
		 for(int j=0;j<=i;j++) {
			 undo.click();
			 System.out.println("undodone"+i+"times"); 
		 }
		
	 }
}
