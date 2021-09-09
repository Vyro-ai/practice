package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Stickres_pg;
import pageobjects.Structures_pg;

public class Stickers_test extends baseclasstwo {

	 @Test
	  public void A_Testcase1() throws InterruptedException {
		
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 List<MobileElement> footer_options=element2.footer_options;
		 wait(footer_options.get(2));
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
		 footer_options.get(4).click();
		 
	//	 List<MobileElement>  footer=driver.findElementsById("com.vyroai.AutoCutCut:id/footerView");
	//	System.out.println("no.of items : "+ footer.size()); 
		 
		 MobileElement  close_structure_view=element2.close_structure_view;
		 
		 if( close_structure_view.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened Stickers view :D ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
		 
		
		 
	 }
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
				 
		 MobileElement  close_structure_view=element2.close_structure_view;
		

		 
		 MobileElement save_img_view=element2.save_btn;
		 close_structure_view.click();
		 wait(save_img_view);
		 if(save_img_view.isDisplayed()==true) {
		 	 
		 	 System.out.println("TC:2 Editor is displayed,Structures view closed !!!");
		 	}
		 	else {
		 		AssertJUnit.assertTrue(false);
		 		System.out.println("Failed to close Structures");
		 	}
		 
		 
		 
	 }
	 @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
		 footer_options.get(4).click();
		 stickers.get(1).click();
		 Thread.sleep(10000);
		 screenshot("stickers 1 applied");
		    System.out.println("TC:3 Executed !!!");
	 }
	 @Test
	  public void D_Testcase4() throws InterruptedException, IOException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);

		 List<MobileElement> stickers=element2.stickers;
	
		 List<MobileElement> sticker_options=element2.sticker_options;
		 
		 sticker_options.get(2).click();
		 stickers.get(0).click();
		 screenshot("stickers 1 of 3rd cat");
		 Thread.sleep(10000);
		    System.out.println("TC:4 Executed !!!");
	 }
	 @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 List<MobileElement> stickers=element2.stickers;
	
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/itemIcon\")"));
		 AndroidElement firdelement=e.get(0);	
		 AndroidElement fourthElement=e.get(2);	
		 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
		 int fromXLocation=fourthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation+60, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 System.out.println(" scroll done"); 
		 stickers.get(2).click();
		 System.out.println("TC:5 Executed !!!");
		 screenshot("stickers 3 of 3rd cat");
	 }
	 @Test
	  public void F_Testcase6() throws InterruptedException, IOException {
		 
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 List<MobileElement> stickers=element2.stickers;
		
		 Thread.sleep(5000);
	//	 footer_options.get(3).click();
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
    
    stickers.get(6).click();
    Thread.sleep(10000);
    System.out.println("TC:6 Executed !!!");
    screenshot("stickers 6 of 3rd cat");
    
}
/*	 @Test
	  public void C_Testcase7() throws InterruptedException {
		 
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
		 MobileElement footerview=element2.footer_view;
	//	 footer_options.get(4).click();
		 Thread.sleep(10000);
		 Dimension size = footerview.getSize();

	        int startX = size.width / 2;
	        int endX = startX;
	        int startY = (int) (size.height * 0.2);
	        int endY = (int) (size.height * 0.8);
System.out.println("startX :" + endX);
	        TouchAction t = new TouchAction(driver);
	        t.press(PointOption.point(startX, startY))
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	                .moveTo(PointOption.point(endX, endY))
	                .release()
	                .perform(); 
		 
	 }*/
	 @Test
	  public void G_Testcase7() throws InterruptedException, IOException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement apply=element2.apply_imageview;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
sticker_options.get(0).click();
sticker_options.get(0).click();

		 for (int i=0;i<2;i++) {
		
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
			 stickers.get(i).click(); 

			 System.out.println(i + "sticker applied !!!");
			 Thread.sleep(10000);
			 apply.click();
//			 eyes.checkWindow("Filter "+i+" Screen");
			 screenshot("sticker "+ (i+1)+ " of 1st cat");
			 undo(i,undo);
			 footer_options.get(4).click();
			 
		 }
		 for (int i=0;i<2;i++) {
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
         
 MobileElement ele=(MobileElement) driver.findElementById("com.vyroai.AutoCutCut:id/stickerViewpager");
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
	 
	 stickers.get(i).click(); 

	 System.out.println(i + "sticker applied");
	 Thread.sleep(10000);
	 apply.click();
	 screenshot("sticker "+ (i+3)+ " of 1st cat");
//	 eyes.checkWindow("Filter "+i+" Screen");
	 undo(i+2,undo);
	 footer_options.get(4).click();
	 
}
		 System.out.println("TC:7 Executed !!!");
	 }
	 @Test
	  public void H_Testcase8() throws InterruptedException, IOException {
		 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
		 MobileElement dragview=element2.drag_view;
		 MobileElement apply=element2.apply_imageview;
		 List<MobileElement> stickers=element2.stickers;
		 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();


		 for (int i=0;i<2;i++) {
			 sticker_options.get(1).click();
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
			 stickers.get(i).click(); 

			 System.out.println(i + "sticker applied !!!");
			 Thread.sleep(10000);
			 apply.click();
//			 eyes.checkWindow("Filter "+i+" Screen");
			 screenshot("sticker "+ (i+1)+ " of 2nd cat");
			 undo(i+4,undo);
			 footer_options.get(4).click();
			 
		 }
		
for (int i=0;i<2;i++) {
	sticker_options.get(1).click();
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
 
MobileElement ele=(MobileElement) driver.findElementById("com.vyroai.AutoCutCut:id/stickerViewpager");
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

	 stickers.get(i).click(); 

	 System.out.println(i + "sticker applied");
	 Thread.sleep(10000);
	 apply.click();
	 screenshot("sticker "+ (i+3)+ "of 2nd cat");
//	 eyes.checkWindow("Filter "+i+" Screen");
	 undo(i+6,undo);
	 footer_options.get(4).click();
	 
}
System.out.println("TC:8 Executed !!!");
}
	 
@Test
public void I_Testcase9() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
	 for (int i=0;i<3;i++) {
	sticker_options.get(2).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 screenshot("sticker "+ (i+1)+ "of 3rd cat");
		 undo(i+8,undo);
		 footer_options.get(4).click();
		 
	 }
	/* Dimension size = driver.manage().window().getSize();

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
  
MobileElement ele=(MobileElement) driver.findElementById("com.vyroai.AutoCutCut:id/stickerViewpager");
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
}
for (int i=0;i<2;i++) {

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
stickers.get(i).click(); 

System.out.println(i + "sticker applied");
Thread.sleep(5000);
apply.click();
//eyes.checkWindow("Filter "+i+" Screen");
undo(i,undo);
footer_options.get(4).click();

}*/
	 System.out.println("TC:9 Executed !!!");
	}

@Test
public void J_Testcase10() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
	 for (int i=0;i<3;i++) {
	sticker_options.get(3).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 screenshot("sticker "+ (i+1)+ " of 4th cat");
		 undo(i+11,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:10 Executed !!!");
	 }

@Test
public void K_Testcase11() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
	 for (int i=0;i<3;i++) {
	sticker_options.get(4).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 screenshot("sticker "+ (i+1)+ " of 5th cat");
		 undo(i+14,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:11 Executed !!!");
	 }

@Test
public void L_Testcase12() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
	 for (int i=0;i<3;i++) {
	sticker_options.get(5).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 screenshot("sticker "+ (i+1)+ " of 6th cat");
		 undo(i+17,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:12 Executed !!!");
	 }
@Test
public void M_Testcase13() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
	 for (int i=0;i<3;i++) {
		 
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/tabIconView\")"));
		 AndroidElement firdelement=e.get(0);

		 AndroidElement fifthElement=e.get(5);	
		 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
		 int fromXLocation=fifthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action1 =new TouchAction(driver);
		 action1.press(PointOption.point(fromXLocation+60, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 
		 
	
sticker_options.get(1).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 screenshot("sticker "+ (i+1)+ " of 7th cat");
		 undo(i+20,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:13 Executed !!!");
	 }

@Test
public void N_Testcase14() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
for (int i=0;i<3;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/tabIconView\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fifthElement=e.get(5);	
	 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
	 int fromXLocation=fifthElement.getLocation().x;
	 int toXLocation=firdelement.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation+60, midOfY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation, midOfY))
	 .release()
	 .perform();
	 
	sticker_options.get(2).click();

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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
		 screenshot("sticker "+ (i+1)+ " of 8th cat");
//		 eyes.checkWindow("Filter "+i+" Screen");
		 undo(i+23,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:14 Executed !!!");}
@Test
public void O_Testcase15() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
for (int i=0;i<3;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/tabIconView\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fifthElement=e.get(5);	
	 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
	 int fromXLocation=fifthElement.getLocation().x;
	 int toXLocation=firdelement.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation+60, midOfY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation, midOfY))
	 .release()
	 .perform();
	 
sticker_options.get(3).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 screenshot("sticker "+ (i+1)+ " of 9th cat");
		 undo(i+26,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:15 Executed !!!");
//sticker_options.get(0).click();

/*sticker_options.get(4).click();
//for(int j=0;j<2;j++) {
	 for (int i=0;i<4;i++) {
	for (int i=0;i<2;i++) {
	sticker_options.get(5).click();
	
}
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 undo(i,undo);
		 footer_options.get(4).click();
		 
	 }*/}
@Test
public void P_Testcase16() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
for (int i=0;i<3;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/tabIconView\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fifthElement=e.get(5);	
	 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
	 int fromXLocation=fifthElement.getLocation().x;
	 int toXLocation=firdelement.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation+60, midOfY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation, midOfY))
	 .release()
	 .perform();
	 
sticker_options.get(4).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
		 screenshot("sticker "+ (i+1)+ " of 9th cat");
//		 eyes.checkWindow("Filter "+i+" Screen");
		 undo(i+29,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:16 Executed !!!");
/*
//sticker_options.get(0).click();

//for(int j=0;j<2;j++) {
	 for (int i=0;i<4;i++) {
	for (int i=0;i<3;i++) {
sticker_options.get(5).click();
}
sticker_options.get(4).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 undo(i,undo);
		 footer_options.get(4).click();
		 
	 }*/}
@Test
public void Q_Testcase17() throws InterruptedException, IOException {
	 Stickres_pg element2= new  Stickres_pg((AndroidDriver) driver);
	 MobileElement dragview=element2.drag_view;
	 MobileElement apply=element2.apply_imageview;
	 List<MobileElement> stickers=element2.stickers;
	 List<MobileElement> footer_options=element2.footer_options;
List<MobileElement> sticker_options=element2.sticker_options;
MobileElement undo=element2.undo;
for (int i=0;i<3;i++) {
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/tabIconView\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fifthElement=e.get(5);	
	 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
	 int fromXLocation=fifthElement.getLocation().x;
	 int toXLocation=firdelement.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation+60, midOfY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation, midOfY))
	 .release()
	 .perform();
	 
sticker_options.get(5).click();
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
		 screenshot("sticker "+ (i+1)+ " of 10th cat");
//		 eyes.checkWindow("Filter "+i+" Screen");
		 undo(i+32,undo);
		 footer_options.get(4).click();
		 
	 }
	 System.out.println("TC:17 Executed !!!");
	 
	 MobileElement close_structure_view=element2.close_structure_view;

	 close_structure_view.click();
/*
//for(int j=0;j<2;j++) {
	 for (int i=0;i<4;i++) {
	
	for (int i=0;i<4;i++) {
sticker_options.get(5).click();
}
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
		 stickers.get(i).click(); 

		 System.out.println(i + "sticker applied !!!");
		 Thread.sleep(10000);
		 apply.click();
//		 eyes.checkWindow("Filter "+i+" Screen");
		 undo(i,undo);
		 footer_options.get(4).click();
		 
	 }*/
}
	 public void undo(int i,MobileElement undo) {
		 for(int j=0;j<=i;j++) {
			 undo.click();
			 System.out.println("undodone"+i+"times"); 
		 }
		
	 }
}