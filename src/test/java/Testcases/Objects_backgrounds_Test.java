package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Magazine_pageobject;
import pageobjects.Objects_bg_pageobject;
import pageobjects.gradient_pg;

public class Objects_backgrounds_Test extends baseclasstwo{

	/*@BeforeClass
	 public void auto_set_up() throws InterruptedException
	 {
		 eyes = new Eyes();
	   	 //Set API Key of Eyes
	        eyes.setApiKey("O8mySvOh0cPJVp7b2PlkaYEq1065dKKz8sDsSEkMi106hBU110");
	        //Set Match Level
	        eyes.setMatchLevel(MatchLevel.STRICT);
	        //Set host operating System as our device
	        eyes.setHostOS(DEVICE);
		  //  return driver;
	 eyes.open(driver, APP_NAME, TEST_NAME);
	 System.out.println("Eyes open");
	
	 
	 }*/
	 @Test
	  public void A_Testcase1() throws InterruptedException, IOException {
		 
		 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 MobileElement gradient_tab=element2.gradient_tab;
		 wait(gradient_tab);
		  gradient_tab.click();
		 //com.vyroai.AutoCutCut:id/thumbnailIV
		  for(int j=0;j<3;j++) {
				 
				 bg_options.get(j).click();
				 Thread.sleep(3000);
				 screenshot3("object:Gradient bg "+(j+1));
				 if(j==0) {
					 Thread.sleep(10000);}
					 else {
						 System.out.println("Don't wait");
					 }
				 
			
	}
		 for(int i=0;i<6;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
			 int fromXLocation=fourthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 System.out.println(fromXLocation +" fromXLocation"); 	
			 System.out.println(fromXLocation*1 +" fromXLocation"); 
			 System.out.println(fromXLocation+1000 +" fromXLocation"); 
			 System.out.println(midOfY+" mid of y"); 
			 System.out.println(midOfY*2+" mid of y"); 
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println(i +" scroll done"); 
			 if(i==5) {
				 for(int j=0;j<3;j++) {
					 
					 bg_options.get(j+2).click();
					 Thread.sleep(3000);
					 screenshot3("object: Gradient bg "+(17+j));
					 
					 if(j==2) {
						 last_bg();
						 screenshot("Gradient's last bg");
					 }
					 else {
						 System.out.println("No last background");
					 }
					 
					
					
			 }
			 }
			 else {
				 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object: Gradient bg "+((3*i)+4+j));
			
			
		
				 }
			 }
			 
				 System.out.println("i="+i); 
	 }
		
	 

}
	 @Test
	  public void B_Testcase2() throws InterruptedException, IOException {
		Thread.sleep(15000);
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		MobileElement shadows=element2.Shadows_cat;
		shadows.click();
for(int j=0;j<4;j++) {
	bg_options.get(j).click();

	 if(j==0) {
		 Thread.sleep(10000);}
		 else {
			 System.out.println("Don't wait");
		 }
	 Thread.sleep(3000);
	screenshot3("object:Shadows bg "+(j+1));
			
	//		 eyes.checkWindow("Bg "+j+" in shadows cat");
}
		 for(int i=0;i<1;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/2);
			 int fromXLocation=fifthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println(i +" scroll done"); 
		
				 for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object:Shadows bg "+(j+5));
			 if(j==4) {
				 last_bg();
				 screenshot("Shadows last bg");
			 }
			 else {
				 System.out.println("No last background");
			 }
	//		 eyes.checkWindow("Bg "+j+" in 2nd set of shadows cat");
				 }
			 
			 
				 System.out.println("i="+i); 
	 }
	 

}
	 @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
		
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 MobileElement shadows=element2.Shadows_cat;
			shadows.click();
		MobileElement studio_cat=element2.studio_cat;
		studio_cat.click();
		for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object:studio bg "+(j+1));
			 if(j==0) {
				 Thread.sleep(10000);}
				 else {
					 System.out.println("Don't wait");
				 }
			
	//		 eyes.checkWindow("Bg "+j+" in Studio Cat");
}
		 for(int i=0;i<2;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
		
			 AndroidElement fourthElement=e.get(3);	
			
			 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
			 int fromXLocation=fourthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println(i +" scroll done"); 
			 if(i==1) {
				 for(int j=0;j<5;j++) {
					 
					 bg_options.get(j).click();
					 Thread.sleep(3000);
					 screenshot3("object:studio bg "+(j+7));
					 if(j==4) {
						 last_bg();
						 screenshot("Studio's last bg");
					 }
					 else {
						 System.out.println("No last background");
					 }
		//			 eyes.checkWindow("Bg "+j+"in "+i+" set Studio Cat");
			 }
			 }
			 else {
				 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object:studio bg "+(j+4));
			
	//		 eyes.checkWindow("Bg "+j+"in "+i+" set Studio Cat");
				 }
			 }
			 
				 System.out.println("i="+i); 
	 }
	 
}
	 @Test
	  public void D_Testcase4() throws InterruptedException, IOException {
		
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 MobileElement shadows=element2.Shadows_cat;
			shadows.click();
		MobileElement studio_cat=element2.studio_cat;
		studio_cat.click();
		MobileElement Split_Color=element2.Split_Color;
		Split_Color.click();
		for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			
			 if(j==0) {
				 Thread.sleep(10000);}
				 else {
					 System.out.println("Don't wait");
				 }
			 Thread.sleep(3000);
			 screenshot3("object: Split_Color bg "+(j+1));
			
//		 eyes.checkWindow("Bg "+j+" in Split_Color Cat");
}
		 for(int i=0;i<2;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
			 int fromXLocation=fourthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println(i +" scroll done"); 
			 if(i==1) {
				 for(int j=0;j<5;j++) {
					 
					 bg_options.get(j).click();
					 Thread.sleep(3000);
					 screenshot3("object: Split_Color bg "+(j+7));
					 if(j==4) {
						 last_bg();
						 screenshot("Split color last bg");
					 }
					 else {
						 System.out.println("No last background");
					 }
	//				 eyes.checkWindow("Bg "+j+"in "+i+" set Split_Color Cat");
			 }
			 }
			 else {
				 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object: Split_Color bg "+(j+4));
			
	//		 eyes.checkWindow("Bg "+j+"in "+i+" set Split_Color Cat");
				 }
			 }
			 
				 System.out.println("i="+i); 
	 }
	 
}
	 @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
		
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 MobileElement shadows=element2.Shadows_cat;
			shadows.click();
		MobileElement studio_cat=element2.studio_cat;
		studio_cat.click();
		MobileElement Split_Color=element2.Split_Color;
		Split_Color.click();
		MobileElement Artistic=element2.Artistic;
		Artistic.click();
	
			 System.out.println("Artistic Cat being selected"); 
			 for(int j=0;j<3;j++) {
				 
			
				 if(j==0) {
					 Thread.sleep(10000);}
					 else {
						 System.out.println("Don't wait");
					 }
				 bg_options.get(j).click();
				 Thread.sleep(3000);
				 screenshot3("object: Artistic bg "+(j+1));
				 System.out.println(" bg being selected"); 
				
	//		 eyes.checkWindow("Bg "+j+" in Artistic Cat");
		}
			 
			 for(int i=0;i<3;i++) {
				 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
				 AndroidElement firdelement=e.get(0);
			
				 AndroidElement fourthElement=e.get(3);	

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
				 if(i==2) {
					 for(int j=0;j<4;j++) {
						 
						 bg_options.get(j+1).click();
						 Thread.sleep(3000);
						 screenshot3("object: Artistic bg "+(j+10));
						 if(j==3) {
							 last_bg();
							 screenshot("Artistic last bg");
						 }
						 else {
							 System.out.println("No last background");
						 }
			//			 eyes.checkWindow("Bg "+j+" in "+i+"set of Artistic Cat");
				 }
				 }
				 else {
				 for(int j=0;j<3;j++) {
					 
					 bg_options.get(j).click();
					 Thread.sleep(3000);
					 screenshot3("object: Artistic bg "+(j+4+(3*i)));
					 
		//			 eyes.checkWindow("Bg "+j+"in "+i+"2nd set Screen of Artistic Cat");
			 }
				 
				 }
			 }
			 }
	 @Test
	 public void F_Testcase6() throws InterruptedException, IOException {
	
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
	 	 List<MobileElement> bg_options=element2.gradient_option;
	 	 MobileElement shadows=element2.Shadows_cat;
			shadows.click();
		MobileElement studio_cat=element2.studio_cat;
		studio_cat.click();
		MobileElement Split_Color=element2.Split_Color;
		Split_Color.click();
		MobileElement Artistic=element2.Artistic;
		Artistic.click();
	
	 	 MobileElement solid=(MobileElement) element2.Solid;
	 	 solid.click();
	 	 System.out.println("Solid Cat being selected"); 
	 	 for(int j=0;j<3;j++) {
	 		 
	 		 bg_options.get(j).click();
	 	
	 		 if(j==0) {
	 			 Thread.sleep(10000);}
	 			 else {
	 				 System.out.println("Don't wait");
	 			 }
	 		 Thread.sleep(3000);
			 screenshot3("object: Solid bg "+(j+1));
	 		 System.out.println(" bg being selected"); 
	 		
//	 		 eyes.checkWindow("Bg "+j+" in Solid Cat");
	 }
	 	 
	 	 for(int i=0;i<2;i++) {
	 		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 		 AndroidElement firdelement=e.get(0);

	 		 AndroidElement fourthElement=e.get(3);	

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
	 		 if(i==1) {
	 			 for(int j=0;j<5;j++) {
	 				 
	 				 bg_options.get(j).click();
	 				 Thread.sleep(3000);
	 				 screenshot3("object: Solid bg "+(j+7));
	 				 if(j==4) {
						 last_bg();
						 screenshot("Artistic last bg");
					 }
					 else {
						 System.out.println("No last background");
					 }
	// 				 eyes.checkWindow("Bg "+j+" in "+i+" set of Solid Cat");
	 		 }
	 		 }
	 		 else {
	 	
	 		 for(int j=0;j<3;j++) {
	 			 
	 			 bg_options.get(j).click();
	 			 Thread.sleep(3000);
				 screenshot3("object: Solid bg "+(j+4));
	 			
	 			 
	 //			 eyes.checkWindow("Bg "+j+" in "+i+" set of Solid Cat");
	 	 }
	 		 }
	 		 }
	 	 
	 }
	 @Test
	  public void G_Testcase7() throws InterruptedException, IOException {
		
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 MobileElement shadows=element2.Shadows_cat;
			shadows.click();
		MobileElement studio_cat=element2.studio_cat;
		studio_cat.click();
		MobileElement Split_Color=element2.Split_Color;
		Split_Color.click();
		MobileElement Artistic=element2.Artistic;
		Artistic.click();
	
	 	 MobileElement solid=(MobileElement) element2.Solid;
	 	 solid.click();
		MobileElement hanger=element2.hanger;
		hanger.click();
		for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			
			 if(j==0) {
				 Thread.sleep(10000);}
				 else {
					 System.out.println("Don't wait");
				 }
			 Thread.sleep(3000);
			 screenshot3("object: hanger bg "+(j+1));
			
	//		 eyes.checkWindow("Bg "+j+" in hanger Cat");
}
		 for(int i=0;i<1;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
			 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
			 int fromXLocation=fourthElement.getLocation().x;
			 int toXLocation=firdelement.getLocation().x;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(fromXLocation+60, midOfY))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(toXLocation, midOfY))
			 .release()
			 .perform();
			 System.out.println(i +" scroll done"); 
			 
				 for(int j=0;j<4;j++) {
					 
					 bg_options.get(j+1).click();
					 Thread.sleep(3000);
					 screenshot3("object: hanger bg "+(j+4));
					 if(j==3) {
						 last_bg();
						 screenshot("Hanger last bg");
					 }
					 else {
						 System.out.println("No last background");
					 }
	//				 eyes.checkWindow("Bg "+j+"in "+i+" set hanger Cat");
		/*	 }
			 }
			 else {
				 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object: hanger bg "+(j+4));
			
	//	 eyes.checkWindow("Bg "+j+"in "+i+" set hanger Cat");
				 }*/
			 }
			 
				 System.out.println("i="+i); 
	 }
	 
}
	 @Test
	  public void H_Testcase8() throws InterruptedException, IOException {
		
		 Objects_bg_pageobject element2= new Objects_bg_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		 MobileElement shadows=element2.Shadows_cat;
			shadows.click();
		MobileElement studio_cat=element2.studio_cat;
		studio_cat.click();
		MobileElement Split_Color=element2.Split_Color;
		Split_Color.click();
		MobileElement Artistic=element2.Artistic;
		Artistic.click();
	
	 	 MobileElement solid=(MobileElement) element2.Solid;
	 	 solid.click();
		MobileElement hanger=element2.hanger;
		hanger.click();
		MobileElement wood=element2.wood;
		wood.click();
		for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			
			 if(j==0) {
				 Thread.sleep(15000);}
				 else {
					 System.out.println("Don't wait");
				 }
			 Thread.sleep(3000);
			 screenshot3("object: wood bg "+(j+1));
	//		 eyes.checkWindow("Bg "+j+" in wood Cat");
}
		 for(int i=0;i<2;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 AndroidElement secondElement=e.get(1);
			 AndroidElement thirdElement=e.get(2);
			 AndroidElement fourthElement=e.get(3);	
			 AndroidElement fifthElement=e.get(4);	
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
		 if(i==1) {
				 for(int j=0;j<3;j++) {
					 
					 bg_options.get(j+2).click();
					 Thread.sleep(3000);
					 screenshot3("object: wood bg "+(j+7));
					 if(j==2) {
						 last_bg();
						 screenshot("Wood last bg");
					 }
					 else {
						 System.out.println("No last background");
					 } 
	//				 eyes.checkWindow("Bg "+j+"in "+i+" set wood Cat");
			 }
			 }
			 else {
				 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot3("object: wood bg "+(j+4));
			
	//		 eyes.checkWindow("Bg "+j+"in "+i+" set wood Cat");
				 }
			 }
			 
				// System.out.println("i="+i); 
	 }
	 

	 
	/*@AfterClass
	    public void teardown() {
		  eyes.close();
	        System.out.println("closed window");
	        //Abort eyes if it is not closed
	        eyes.abortIfNotClosed();
	    }*/
}
}