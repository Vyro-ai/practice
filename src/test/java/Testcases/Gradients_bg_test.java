package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

import Baseclass.baseclasstwo;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.Crop_view;
import pageobjects.Magazine_pageobject;
import pageobjects.gradient_pg;

public class Gradients_bg_test extends baseclasstwo{
	
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
				 screenshot2("Gradient bg "+(j+1));
				 if(j==0) {
					 Thread.sleep(10000);}
					 else {
						 System.out.println("Don't wait");
					 }
				 
			
	}
		 for(int i=0;i<6;i++) {
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
			 AndroidElement firdelement=e.get(0);
			 
			 AndroidElement fourthElement=e.get(3);	
			
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
					 screenshot2("Gradient bg "+(18+j));
					 if(j==2) {
						 last_bg();
						 screenshot2("Gradient's last bg");
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
			 screenshot2("Gradient bg "+((3*i)+5+j));
			
			
		
				 }
			 }
			 
				 System.out.println("i="+i); 
				 
	 }
		
	 

}
	 @Test
	  public void B_Testcase2() throws InterruptedException, IOException {
		
		 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		
		 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
		  MobileElement gradient_tab=element3.magazine_tab;
		  gradient_tab.click();
for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot2("Magazine bg "+(j+1));
			 if(j==0) {
				 Thread.sleep(10000);}
				 else {
					 System.out.println("Don't wait");
				 }
			
		
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
					 screenshot2("Magazine bg "+(j+10));
					 if(j==4) {
						 last_bg();
						 screenshot2("Magazine's last bg");
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
			 screenshot2("Magazine bg "+(j+4+(3*i)));
			
			
				 }
			 }
			 
				 System.out.println("i="+i); 
	 }
	 

}
	 @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
		
		 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		
		 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
		 MobileElement gradient_tab=element3.magazine_tab;
		  gradient_tab.click();
		  MobileElement gradient_tab1=element3.neon_tab;
		  
		  gradient_tab1.click();
		
for(int j=0;j<4;j++) {
	bg_options.get(j).click();
	Thread.sleep(3000);
	screenshot2("Neon bg "+(j+1));
	 if(j==0) {
		 Thread.sleep(10000);}
		 else {
			 System.out.println("Don't wait");
		 }
			 
			
		//	 eyes.checkWindow("Bg "+j+" in Neon cat");
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
		
				 for(int j=0;j<4;j++) {
			 
			 bg_options.get(j+1).click();
			 Thread.sleep(3000);
			 screenshot2("Neon bg "+(j+5));
			
			 if(j==3) {
				 last_bg();
				 screenshot2("Neon's last bg");
			 }
			 else {
				 System.out.println("No last background");
			 }
		
				 }
			 
			 
				 System.out.println("i="+i); 
	 }
	 

}
	 @Test
	  public void D_Testcase4() throws InterruptedException, IOException {
		 
		 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
		
		 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
		 MobileElement gradient_tab1=element3.magazine_tab;
		 gradient_tab1.click();
		  MobileElement gradient_tab2=element3.neon_tab;
		 
		  gradient_tab2.click();
		  MobileElement gradient_tab=element3.quotes_tab;
		  gradient_tab.click();
for(int j=0;j<3;j++) {
	 bg_options.get(j).click();
	 Thread.sleep(3000);
	 screenshot2("Qoutes bg "+(j+1));
	 if(j==0) {
		 Thread.sleep(10000);}
		 else {
			 System.out.println("Don't wait");
		 }
			
			
		
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
					 screenshot2("Qoutes bg "+(j+7));
					
					 if(j==4) {
						 last_bg();
						 screenshot2("Qoutes last bg");
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
			 screenshot2("Qoutes bg "+(j+4+(3*i)));
			
			 
			
				 }
			 }
			 
				 System.out.println("i="+i); 
	 }
	 

}
	 @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
	//	 Thread.sleep(10000);
			 System.out.println("TC 5 started executing"); 
			 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
			 List<MobileElement> bg_options=element2.gradient_option;
			 
		//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
			
			
		/*		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/categoryTV\")"));
					
				 
				 AndroidElement firdelement=e.get(0);
				 
				 AndroidElement fourthElement=e.get(3);	
			//	 AndroidElement fifthElement=e.get(4);	
				 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
				 int fromXLocation=fourthElement.getLocation().x;
				 int toXLocation=firdelement.getLocation().x;
				 						
				 TouchAction  action =new TouchAction(driver);
				 action.press(PointOption.point(fromXLocation, midOfY))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation, midOfY))
				 .release()
				 .perform();
				 System.out.println(" scroll done"); */
			 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
			 MobileElement gradient_tab1=element3.magazine_tab;
			 gradient_tab1.click();
			  MobileElement gradient_tab2=element3.neon_tab;
			 
			  gradient_tab2.click();
			  MobileElement gradient_tab=element3.quotes_tab;
			  gradient_tab.click();
				 MobileElement recording=(MobileElement) element2.recording;
				 recording.click();
			 System.out.println("Recording cat being selected"); 
	for(int j=0;j<5;j++) {
				 
				 bg_options.get(j).click();
				 
				 if(j==0) {
					 Thread.sleep(7000);}
					 else {
						 System.out.println("Don't wait");
					 }
				 Thread.sleep(3000);
				 screenshot2("Recording bg "+(j+1));
				 System.out.println(" bg being selected"); 
				 
				 if(j==4) {
					 last_bg();
					 screenshot2("Recording last bg");
				 }
				 else {
					 System.out.println("No last background");
				 }
			
	}
	/*		Thread.sleep(10000);
				 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
				 AndroidElement firdelement1=e1.get(0);
				 AndroidElement secondElement1=e1.get(1);
				 AndroidElement thirdElement1=e1.get(2);
				 AndroidElement fourthElement1=e1.get(3);	
				 AndroidElement fifthElement1=e1.get(4);	
				 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
				 int fromXLocation1=fourthElement1.getLocation().x;
				 int toXLocation1=firdelement1.getLocation().x;
				 						
				 TouchAction  action1 =new TouchAction(driver);
				 action1.press(PointOption.point(fromXLocation1, midOfY1))
				 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
				 .moveTo(PointOption.point(toXLocation1, midOfY1))
				 .release()
				 .perform();
				 System.out.println(" scroll done"); 
		
					 for(int j=0;j<4;j++) {
				 
				 bg_options.get(j).click();
				
			//	 eyes.checkWindow("Bg "+j+"in 2nd set Screen");
					 }
				
		 }*/
		 

}
	 
@Test
public void F_Testcase6() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	 List<MobileElement> categories=element2.categories;
	 List<MobileElement> bg_options=element2.gradient_option;
	 
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	  
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 System.out.println("Frames cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		 screenshot2("Frames bg "+(j+1));
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 

}
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
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j+2).click();
		 Thread.sleep(3000);
		 screenshot2("Frames bg "+(j+4));
		 if(j==2) {
			 last_bg();
			 screenshot2("Frames last bg");
		 }
		 else {
			 System.out.println("No last background");
		 }
		
		 
}
	 
	
}
@Test
public void G_Testcase7() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
//	 List<MobileElement> categories=element2.categories;
	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	  
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	 
	 System.out.println("Stroke cat being selected"); 
	 for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
		 Thread.sleep(7000);}
		 else {
			 System.out.println("Don't wait");
		 }
		 Thread.sleep(3000);
		 screenshot2("Stroke bg "+(j+1));
		 if(j==4) {
			 last_bg();
			 screenshot2("Stroke last bg");
		 }
		 else {
			 System.out.println("No last background");
		 }
		 System.out.println(" bg being selected"); 
		
		
}
	/* List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement fe=e1.get(0);
	
	 AndroidElement foue=e1.get(3);	
		
	 int middleofY =foue.getLocation().y +(foue.getSize().height/2);
	 int fromX=foue.getLocation().x;
	 int toXn=fe.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromX+60, middleofY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXn, middleofY))
	 .release()
	 .perform();
	 
	 System.out.println(" scroll done"); 
	 for(int j=0;j<2;j++) {
		 
		 bg_options.get(j+3).click();
		
		 
	//	 eyes.checkWindow("Bg "+j+"in "+i+"2nd set Screen");
}
	*/ 
	
}

@Test
public void H_Testcase8() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	
	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	  
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 System.out.println("Space Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		 screenshot2("Space bg "+(j+1));
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
		
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
	 
	 System.out.println(" scroll done"); 
for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		 screenshot2("Space bg "+(j+5));
		
		 if(j==4) {
			 last_bg();
			 screenshot2("Space last bg");
		 }
		 else {
			 System.out.println("No last background");
		 }

	 
	 }
	 
	 }
}

@Test
public void I_Testcase9() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	
	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 System.out.println("Walls Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Walls bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
		
}
	
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);
		
	 AndroidElement fifthElement=e.get(4);	
	 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/3);
	 int fromXLocation=fifthElement.getLocation().x;
	 int toXLocation=firdelement.getLocation().x;
	 						
	 TouchAction  action =new TouchAction(driver);
	 action.press(PointOption.point(fromXLocation+60, midOfY))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation, midOfY))
	 .release()
	 .perform();
	 
	 System.out.println(" scroll done"); 

for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		
		 screenshot2("Walls bg "+(j+5));
		 if(j==4) {
			 last_bg();
			 screenshot2("Walls last bg");
		 }
		 else {
			 System.out.println("No last background");
		 }

	 
	 }
	 
}

@Test
public void J_Testcase10() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	 
	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 System.out.println("Creative Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Creative bg "+(j+1));
		 System.out.println(" bg being selected"); 

}
	 
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
	 
		 for(int j=0;j<4;j++) {
			 
			 bg_options.get(j+1).click();
			 Thread.sleep(3000);
			 screenshot2("Creative bg "+(j+4));
			 if(j==3) {
				 last_bg();
				 screenshot2("Creative last bg");
			 }
			 else {
				 System.out.println("No last background");
			 }
	
	 }
	
	 
	 }

@Test
public void K_Testcase11() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	
	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 System.out.println("Grafitti Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Grafitti bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
	
}
	 
	
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
		 AndroidElement firdelement=e.get(0);
		
		
		 AndroidElement fifthElement=e.get(4);
		 int midOfY =fifthElement.getLocation().y +(fifthElement.getSize().height/3);
		 int fromXLocation=fifthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation+60, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 
		 System.out.println(" scroll done"); 
		 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j+2).click();
			 Thread.sleep(3000);
			 screenshot2("Grafitti bg "+(j+4));
			
			 if(j==2) {
				 last_bg();
				 screenshot2("Graffitti last bg");
			 }
			 else {
				 System.out.println("No last background");
			 }
		 
		 }
		 
		 
	 
	 }
@Test
public void L_Testcase12() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
	 
	 List<MobileElement> bg_options=element2.gradient_option;
/*	 List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/categoryTV\")"));
	 AndroidElement firdelement1=e1.get(0);
	
	 AndroidElement fourthElement1=e1.get(3);	
	// AndroidElement fifthElement=e.get(4);	
	 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/2);
	 int fromXLocation1=fourthElement1.getLocation().x;
	 int toXLocation1=firdelement1.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation1, midOfY1))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation1, midOfY1))
	 .release()
	 .perform();*/
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	  
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 System.out.println("Texture Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Texture  bg "+(j+1));
		 System.out.println(" bg being selected"); 

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
				 screenshot2("Texture  bg "+(j+10));
				 if(j==3) {
					 last_bg();
					 screenshot2("Texture last bg");
				 }
				 else {
					 System.out.println("No last background");
				 }
				 
		 }
		 }
		 else
		 for(int j=0;j<3;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot2("Texture  bg "+(j+4+i+i+i));
			
			 
			 
	 }
		 
		 }
	 
	 }
@Test
public void M_Testcase13() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	  gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 System.out.println("Split Up Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
	
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Split  bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
	
}
	 
	 
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
	
		 for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot2("Split up bg "+(j+4));
			 if(j==4) {
				 last_bg();
				 screenshot2("Split up last bg");
			 }
			 else {
				 System.out.println("No last background");
			 }
			
	
	 }
		 
		 }
	 
@Test
public void N_Testcase14() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	  gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 System.out.println("Drip Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Drip  bg "+(j+1));
		 System.out.println(" bg being selected"); 
		

}
	 
	 for(int i=0;i<2;i++) {
		 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
		 AndroidElement firdelement=e.get(0);

		 AndroidElement fourthElement=e.get(3);	
	
		 int midOfY =fourthElement.getLocation().y +(fourthElement.getSize().height/2);
		 int fromXLocation=fourthElement.getLocation().x;
		 int toXLocation=firdelement.getLocation().x;
		 						
		 TouchAction  action =new TouchAction(driver);
		 action.press(PointOption.point(fromXLocation+80, midOfY))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		 .moveTo(PointOption.point(toXLocation, midOfY))
		 .release()
		 .perform();
		 
		 System.out.println(" scroll done"); 
		 if(i==1) {
			 for(int j=0;j<5;j++) {
				 
				 bg_options.get(j).click();
				 Thread.sleep(3000);
				 screenshot2("Drip  bg "+(j+7));
				 if(j==4) {
					 last_bg();
					 screenshot2("Drip last bg");
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
			 screenshot2("Drip  bg "+(j+4));
			
			
	 }
		 }
		 }
	 
}
@Test
public void O_Testcase15() throws InterruptedException, IOException {
	 
	
		 System.out.println("TC 2 started executing"); 
		 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);
		 List<MobileElement> bg_options=element2.gradient_option;
		 
	//	 gradient_pg element2= new gradient_pg((AndroidDriver) driver);

		 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
		 MobileElement gradient_tab1=element3.magazine_tab;
		 gradient_tab1.click();
		  MobileElement gradient_tab2=element3.neon_tab;
		  
		  gradient_tab2.click();
		  MobileElement gradient_tab=element3.quotes_tab;
		  gradient_tab.click();
			 MobileElement recording=(MobileElement) element2.recording;
			 recording.click();
			 
		 MobileElement Frames=(MobileElement) element2.Frames;
		 Frames.click();
		 MobileElement stroke=(MobileElement) element2.Stroke;
		 stroke.click();	
		 MobileElement space=(MobileElement) element2.Space;
		 space.click();
		 MobileElement wall=(MobileElement) element2.Walls;
		 wall.click();
		 MobileElement creative=(MobileElement) element2.Creative;
		 creative.click();
		 MobileElement graffiti=(MobileElement) element2.Graffiti;
		 graffiti.click();
		 MobileElement texture=(MobileElement) element2.texture_cat;
		 texture.click();
		 MobileElement splitup=(MobileElement) element2.SplitUp;
		 splitup.click();
		 MobileElement drip=(MobileElement) element2.Drip;
		 drip.click();
		 MobileElement walls=(MobileElement) element2.Wall;
		 walls.click();
		 System.out.println("Wall cat being selected"); 
for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			
			 if(j==0) {
				 Thread.sleep(7000);}
				 else {
					 System.out.println("Don't wait");
				 }
			 Thread.sleep(3000);
			 screenshot2("Wall bg "+(j+1));
			 if(j==4) {
				 last_bg();
				 screenshot2("Wall last bg");
			 }
			 else {
				 System.out.println("No last background");
			 }
			 System.out.println(" bg being selected"); 
	
}

	 

}
@Test
public void P_Testcase16() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	/* List<AndroidElement> e1=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/categoryTV\")"));
	 AndroidElement firdelement1=e1.get(0);
	 AndroidElement secondElement1=e1.get(1);
	 AndroidElement thirdElement1=e1.get(2);
	 AndroidElement fourthElement1=e1.get(3);	
	// AndroidElement fifthElement=e.get(4);	
	 int midOfY1 =fourthElement1.getLocation().y +(fourthElement1.getSize().height/3);
	 int fromXLocation1=fourthElement1.getLocation().x;
	 int toXLocation1=firdelement1.getLocation().x;
	 						
	 TouchAction  action1 =new TouchAction(driver);
	 action1.press(PointOption.point(fromXLocation1, midOfY1))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	 .moveTo(PointOption.point(toXLocation1, midOfY1))
	 .release()
	 .perform();*/
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 System.out.println("Newspaper Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		 screenshot2("Newspaper bg "+(j+1));
		 if(j==0) {
			 Thread.sleep(5000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
	
}
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fourthElement=e.get(4);	

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
	
	 for(int j=0;j<2;j++) {
		 
		 bg_options.get(j+3).click();
		 Thread.sleep(3000);
		 screenshot2("Newspaper bg "+(j+5));
		 if(j==1) {
			 last_bg();
			 screenshot2("Newspaper last bg");
		 }
		 else {
			 System.out.println("No last background");
		 }
		
		
 }
	 }
	 

@Test
public void Q_Testcase17() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 System.out.println("Solid Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		 
		 if(j==0) {
			 Thread.sleep(15000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Solid bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
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
				 screenshot2("Solid bg "+(j+16));
				 if(j==4) {
					 last_bg();
					 screenshot2("Solid last bg");
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
			 screenshot2("Solid bg "+(j+4+(3*i)));
			
			 
	 }
		 }
		 }
	 
}
@Test
public void R_Testcase18() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 System.out.println("Clouds Cat being selected"); 
for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Clouds bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
		
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
	 
	 System.out.println(" scroll done"); 
for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot2("Clouds bg "+(j+5));
			 if(j==4) {
				 last_bg();
				 screenshot2("Clouds last bg");
			 }
			 else {
				 System.out.println("No last background");
			 } 
			 
		//	 eyes.checkWindow("Bg"+j+" in 2nd set of Clouds Cat");
	 
		 
		 }
		 }
	 
}
@Test
public void S_Testcase19() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	  
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 MobileElement colorcombo_cat=(MobileElement) element2.colorcombo_cat;
	 colorcombo_cat.click();
	 System.out.println("ColorCombo Cat being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("ColorCombo bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
	//	 eyes.checkWindow("Bg "+j+" in ColorCombo Cat");
}
	 
	 
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
		 for(int j=0;j<5;j++) {
			 
			 bg_options.get(j).click();
			 Thread.sleep(3000);
			 screenshot2("ColorCombo bg "+(j+4)); 
			 if(j==4) {
				 last_bg();
				 screenshot2("ColorCombo last bg");
			 }
			 else {
				 System.out.println("No last background");
			 } 
			
			 
	//		 eyes.checkWindow("Bg"+j+" in 2nd set of ColorCombo Cat");
	 
		 
		 }
		 }
	 

@Test
public void T_Testcase20() throws InterruptedException, IOException {
	
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	  gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 MobileElement colorcombo_cat=(MobileElement) element2.colorcombo_cat;
	 colorcombo_cat.click();
	 MobileElement window=(MobileElement) element2.window;
	 window.click();
	 System.out.println("Window being selected"); 
	 for(int j=0;j<3;j++) {
		 
		 bg_options.get(j).click();
	
		 if(j==0) {
			 Thread.sleep(10000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Window  bg "+(j+1));
		 System.out.println(" bg being selected"); 
		
//		 eyes.checkWindow("Bg "+j+" in Window");
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
				 screenshot2("Window  bg "+(j+7));
				 if(j==4) {
					 last_bg();
					 screenshot2("Window last bg");
				 }
				 else {
					 System.out.println("No last background");
				 } 
			//	 eyes.checkWindow("Bg "+j+" in "+i+" set of Window");
		 }
		 }
		 else {
			 for(int j=0;j<4;j++) {
				 
				 bg_options.get(j).click();
				 Thread.sleep(3000);
				 screenshot2("Window  bg "+(j+4+(3*i)));
				
				 
			//	 eyes.checkWindow("Bg "+j+" in "+i+" set of Window");
		 
			 
			 }
		 }
		 }
	 
}

@Test
public void U_Testcase21() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 MobileElement colorcombo_cat=(MobileElement) element2.colorcombo_cat;
	 colorcombo_cat.click();
	 MobileElement window=(MobileElement) element2.window;
	 window.click();
	 MobileElement painting_cat=(MobileElement) element2.painting_cat;
	 painting_cat.click();
	 System.out.println("Painting Cat being selected"); 
	 for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 Thread.sleep(3000);
		 screenshot2("Painting  bg "+(j+1));
		 if(j==4) {
			 last_bg();
			 screenshot2("Painting last bg");
		 }
		 else {
			 System.out.println("No last background");
		 } 
		 System.out.println(" bg being selected"); 
		
//		 eyes.checkWindow("Bg "+j+" in Painting Cat");
}

	 
}
@Test
public void V_Testcase22() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 MobileElement colorcombo_cat=(MobileElement) element2.colorcombo_cat;
	 colorcombo_cat.click();
	 MobileElement window=(MobileElement) element2.window;
	 window.click();
	 MobileElement painting_cat=(MobileElement) element2.painting_cat;
	 painting_cat.click();
	 MobileElement Papertorn=(MobileElement) element2.papertorn_cat;
	 Papertorn.click();
	 System.out.println("Papertorn Cat being selected"); 
	 for(int j=0;j<4;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		 screenshot2("Papertorn bg "+(j+1));
		 
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 System.out.println(" bg being selected"); 
		
	//	 eyes.checkWindow("Bg "+j+" in Papertorn Cat");
}
	 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/downloadLay\")"));
	 AndroidElement firdelement=e.get(0);

	 AndroidElement fourthElement=e.get(4);	

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
	
	 for(int j=0;j<2;j++) {
		 
		 bg_options.get(j+3).click();
		 Thread.sleep(3000);
		 screenshot2("Papertorn bg "+(j+5));
		 if(j==1) {
			 last_bg();
			 screenshot2("Papertorn last bg");
		 }
		 else {
			 System.out.println("No last background");
		 }
		
		
 }
}
@Test
public void W_Testcase23() throws InterruptedException, IOException {
	 Magazine_pageobject element2= new Magazine_pageobject((AndroidDriver) driver);

	 List<MobileElement> bg_options=element2.gradient_option;
	 gradient_pg element3= new gradient_pg((AndroidDriver) driver);
	 MobileElement gradient_tab1=element3.magazine_tab;
	 gradient_tab1.click();
	  MobileElement gradient_tab2=element3.neon_tab;
	 
	  gradient_tab2.click();
	  MobileElement gradient_tab=element3.quotes_tab;
	  gradient_tab.click();
		 MobileElement recording=(MobileElement) element2.recording;
		 recording.click();
		 
	 MobileElement Frames=(MobileElement) element2.Frames;
	 Frames.click();
	 MobileElement stroke=(MobileElement) element2.Stroke;
	 stroke.click();	
	 MobileElement space=(MobileElement) element2.Space;
	 space.click();
	 MobileElement wall=(MobileElement) element2.Walls;
	 wall.click();
	 MobileElement creative=(MobileElement) element2.Creative;
	 creative.click();
	 MobileElement graffiti=(MobileElement) element2.Graffiti;
	 graffiti.click();
	 MobileElement texture=(MobileElement) element2.texture_cat;
	 texture.click();
	 MobileElement splitup=(MobileElement) element2.SplitUp;
	 splitup.click();
	 MobileElement drip=(MobileElement) element2.Drip;
	 drip.click();
	 MobileElement walls=(MobileElement) element2.Wall;
	 walls.click();
	MobileElement Newspaper_cat=(MobileElement) element2.Newspaper_cat;
	 Newspaper_cat.click();
	 MobileElement solid=(MobileElement) element2.Solid;
	 solid.click();
	 MobileElement cloud=(MobileElement) element2.cloud;
	 cloud.click();
	 MobileElement colorcombo_cat=(MobileElement) element2.colorcombo_cat;
	 colorcombo_cat.click();
	 MobileElement window=(MobileElement) element2.window;
	 window.click();
	 MobileElement painting_cat=(MobileElement) element2.painting_cat;
	 painting_cat.click();
	 MobileElement Papertorn=(MobileElement) element2.papertorn_cat;
	 Papertorn.click();
	 MobileElement text=(MobileElement) element2.text_cat;
	 text.click();
	 System.out.println("Text Cat being selected"); 
	 for(int j=0;j<5;j++) {
		 
		 bg_options.get(j).click();
		 Thread.sleep(3000);
		 screenshot2("Text bg "+(j+1));
		 
		 if(j==0) {
			 Thread.sleep(7000);}
			 else {
				 System.out.println("Don't wait");
			 }
		 if(j==4) {
			 last_bg();
			 screenshot2("Text bg");
		 }
		 else {
			 System.out.println("No last background");
		 }
		 System.out.println(" bg being selected"); 
		
//		 eyes.checkWindow("Bg "+j+" in Text Cat");
}

}


	
/*	@AfterClass
	    public void teardown() {
		  eyes.close();
	        System.out.println("closed window");
	        //Abort eyes if it is not closed
	        eyes.abortIfNotClosed();
	 }*/
}
