package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;

import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.EditImageScreen;
import pageobjects.Home_page;

public class Home_Test extends baseclasstwo{
	
//	WebDriverWait wait=new WebDriverWait(driver,30);
	  @Test
	  public void A_Gallery_Invalid_1() throws IOException, InterruptedException {
		//	WebDriverWait wait=new WebDriverWait(driver,30);
		
		  //	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.vyroai.AutoCutCut:id/albumText")));
//			MobileElement gallery_home=(MobileElement) driver.findElementById("com.vyroai.AutoCutCut:id/ic_folder_album");
//			gallery_home.click();
		//	Home_page element=new Home_page((AndroidDriver) driver);
	//		EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			Home_page element=new Home_page((AndroidDriver) driver);
		
			MobileElement folder=element.Folder;
			MobileElement Person=element.Person;
			MobileElement gallery=element.gallery;
			MobileElement close_button=element.close_text_view;
		/*	if(close_button.isDisplayed()) {
				wait(close_button);
				close_button.click();
			}
			else {
				System.out.println("no premium screen");
			}
			*/
			wait(Person);
			Person.click();
			if(gallery.isDisplayed()==true) {
       			System.out.println("Woohoo Success :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}
		
			screenshot2("gallery");

			
	  }
	  @Test
	  public void B_Gallery_Invalid_2() {
		  Home_page element=new Home_page((AndroidDriver) driver);
	
			
			MobileElement back=element.back_btn;
		
		
			MobileElement settings=element.settings;
		
			back.click();
			
		
			if(settings.isDisplayed()==true) {
       			System.out.println("Test case 2 passed :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}	
			
			
			
		  
	  }

	  @Test
	  public void C_Gallery_Valid_3() throws IOException, InterruptedException {
		  Home_page element=new Home_page((AndroidDriver) driver);
			
			
			MobileElement camera=element.camera;
			MobileElement camera_button=element.shutter;
			MobileElement Person=element.Person;
			wait(Person);
			Person.click();
			camera.click();
			if(camera_button.isDisplayed()==true) {
       			System.out.println("Test case 3 passed ,camera opened:D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}	
			
			screenshot2("Camera screen");
		
		  
	  }
	  @Test
	  public void D_Gallery_Valid_4() {
		  Home_page element=new Home_page((AndroidDriver) driver);
			
			
			MobileElement retry_btn=element.retry;
			MobileElement camera_button=element.shutter;
			camera_button.click();
			wait(retry_btn);
			if(retry_btn.isDisplayed()==true) {
     			System.out.println("Test case 4 passed ,image clicked:D ");
     		}
     		else {
     			AssertJUnit.assertTrue(false);
     			System.out.println("Tch tch Failed ;(");
     		}	
			
	  }
	  @Test
	  public void E_Gallery_Valid_5() {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		 
			MobileElement retry_btn=element.retry;
			MobileElement camera_button=element.shutter;
			retry_btn.click();
			if(camera_button.isDisplayed()==true) {
     			System.out.println("Test case 5 passed ,retake image :D ");
     		}
     		else {
     			AssertJUnit.assertTrue(false);
     			System.out.println("Tch tch Failed ;(");
     		}	
	  }
	  @Test
	  public void F_Gallery_Valid_6() throws IOException, InterruptedException {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		 
			MobileElement okay_btn=element.ok_btn;
			MobileElement camera_button=element.shutter;
			MobileElement back_button=element.back_btn;
			MobileElement close_btn=element.close_btn;
			
			EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 
		
		
				MobileElement Searchbar=element1.search_bar;
			camera_button.click();
			wait(okay_btn);
			okay_btn.click();
			wait(Searchbar);
			if(Searchbar.isDisplayed()==true) {
     			System.out.println("Test case 6 passed ,image clicked :D ");
     		}
     		else {
     			AssertJUnit.assertTrue(false);
     			System.out.println("Tch tch Failed ;(");
     		}	
			close_btn.click();
			screenshot2("Main screen");
	  }
	  @Test
	  public void G_Gallery_Valid_7() throws IOException, InterruptedException {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		   
			
			MobileElement Person=element.Person;
			MobileElement albums=element.album_button;
			MobileElement webimages=element.webimages_folder;
			
			albums.click();
			if(webimages.isDisplayed()) {
				System.out.println("Test case 7 gallery view displayed !");
			}
			else {
				System.out.println("No gallery view button !!");
				AssertJUnit.assertTrue(false);
			}
			
	  }
	  
	  @Test
	  public void H_Gallery_Valid_8() throws IOException, InterruptedException {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		 
			
			MobileElement Person=element.Person;
			MobileElement webimagesbutton=element.webimages_button;
			MobileElement webimages=element.webimages_folder;
			webimages.click();
			if(webimagesbutton.isDisplayed()) {
				System.out.println("Test case 8 Webimages folder  displayed !");
			}
			else {
				System.out.println("No gallery view button !!");
				AssertJUnit.assertTrue(false);
			}
			screenshot2("Albums folder");
	  }
	  @Test
	  public void I_Gallery_Valid_9() {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		 
			
			MobileElement Person=element.Person;
			MobileElement Person_float_btn=element.float_person;
			MobileElement Object_float_btn=element.float_object;
			
			Person_float_btn.click();
			if(Object_float_btn.isDisplayed()) {
				System.out.println("Test case 9 Object float button displayed !");

			}
			else {
				System.out.println("No float button !!");
				AssertJUnit.assertTrue(false);
			}
			
	  }
	  
	
	  @Test
	  public void J_Gallery_Valid_10() throws InterruptedException, IOException {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 
			List<MobileElement> images=element.images;
		

			MobileElement Searchbar=element1.search_bar;
		
			MobileElement Object_float_btn=element.float_object;
			List<MobileElement> Object_seg=element.Object_seg;
			MobileElement albums=element.album_button;
			MobileElement bg_eraser_folder=element.bg_eraser_folder;
		
			Object_float_btn.click();
			if(Object_float_btn.isDisplayed()) {
				System.out.println("Object float button displayed !");
				
			}
			else {
				System.out.println("No float button !!");
				AssertJUnit.assertTrue(false);
			}
			albums.click();
			
			
	//		((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Background-Eraser\"));").click();	
			 List<AndroidElement> e=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.vyroai.AutoCutCut:id/name\")"));
			 AndroidElement firdelement=e.get(0);	
			 AndroidElement fourthElement=e.get(8);	
			 int midOfY =fourthElement.getLocation().x +(fourthElement.getSize().height/2);
			 int fromXLocation=fourthElement.getLocation().y;
			 int toXLocation=firdelement.getLocation().y;
			 						
			 TouchAction  action =new TouchAction(driver);
			 action.press(PointOption.point(midOfY,fromXLocation+60))
			 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			 .moveTo(PointOption.point(midOfY,toXLocation))
			 .release()
			 .perform();
			 System.out.println(" scroll done");
			bg_eraser_folder.click();
			Thread.sleep(5000);
				 images.get(1).click();
				 wait(Searchbar);
				String obje_cat= Object_seg.get(3).getText();
				String studio="Studio";
				String studio1="Shadows";
				 if(obje_cat.equals(studio) || obje_cat.equals(studio1)) {
					 System.out.println("Test case 10 Object segmentation mode!!"); 
				 }
				 else {
					 System.out.println("Not an Object segmentation mode!!"); 
					 AssertJUnit.assertTrue(false);
				 }
				 screenshot2("Object main screen");
			}
	  
	  @Test
	  public void K_Gallery_Valid_11() throws IOException, InterruptedException {
		  
		  Home_page element=new Home_page((AndroidDriver) driver);
			EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
		 
		List<MobileElement> images=element.images;
	
			MobileElement Searchbar=element1.search_bar;
			
			MobileElement Person_float_btn=element.float_person;
			MobileElement Object_float_btn=element.float_object;
			List<MobileElement> human_seg=element.human_seg;
			MobileElement close_btn=element.close_btn;
			MobileElement albums=element.album_button;
			MobileElement bg_download=element.Download_Folder;
		
			close_btn.click();
			Object_float_btn.click();
			Person_float_btn.click();
			
			if(Person_float_btn.isDisplayed()) {
				System.out.println("Person float button displayed !");
			}
			else {
				System.out.println("No float button !!");
			}albums.click();
			bg_download.click();
			Thread.sleep(5000);
		//	wait(images.get(0));
				 images.get(2).click();
				 wait(Searchbar);
				 String obje_cat= human_seg.get(3).getText();
					String studio="Magazine";
					String studio1="Neon";
					 if(obje_cat.equals(studio) || obje_cat.equals(studio1)) {
			
					 System.out.println("HUman segmentation mode!!"); 
				 }
				 else {
					 System.out.println("Not an Human segmentation mode!!");
					 AssertJUnit.assertTrue(false);
				 }
					 screenshot2("Human Mainscreen");
			}
	  
	  

	
	}