package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import pageobjects.Home_page;
import pageobjects.Stickres_pg;
import pageobjects.setting_pg_test;

public class settings_test extends baseclasstwo{
	 @Test
	  public void A_Testcase1() throws InterruptedException, IOException {
		 Thread.sleep(5000);
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
		
		 MobileElement settings_icon=element2.settings;
		
		 MobileElement settings_headings=element2.settings_heading;
		 settings_icon.click();
 if(settings_headings.isDisplayed()) {
			 
			 System.out.println("TC:1 Woohoo Successfully opened Settings !!!!");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			}
 screenshot2("Settings screen");

	 }
	 
	 @Test
	  public void B_Testcase2() throws InterruptedException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
	
		
		 MobileElement back_btn=element2.back_btn;
		
		 back_btn.click();
		 Home_page element=new Home_page((AndroidDriver) driver);
			
		  MobileElement Person=element.Person;
	
		 if(Person.isDisplayed()) {
			 
			 System.out.println("TC:2 Woohoo succesfully navigated to home");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 MobileElement settings_icon=element2.settings;
			
	
		 settings_icon.click();
	 }
	 
	 @Test
	  public void C_Testcase3() throws InterruptedException, IOException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
	
		
		 MobileElement insta=element2.instagram;
		 MobileElement insta_view=element2.insta_view;
		
		 insta.click();
	
		 if(insta_view.isDisplayed()) {
			 
			 System.out.println("TC:3 Woohoo succesfully opened instagram");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		 screenshot2("Insta screen");
	 }
	 
	 @Test
	  public void D_Testcase4() throws InterruptedException, IOException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
			
			
		 MobileElement contactus=element2.contact_us;
		 MobileElement gmail_app=element2.gmail_app;
		 MobileElement composetext=element2.Compose_text;
		
		 contactus.click();
		 gmail_app.click();
		 
if(composetext.isDisplayed()) {
			 
			 System.out.println("TC:4 Woohoo succesfully navigated to gmail");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 
screenshot2("Gmail app opened");
		 
	//	 
		 
		 
		 
		 
		 
			
	//	 Background Changer Feedback
		 
		 
		 
		 
	 }
	 @Test
	  public void E_Testcase5() throws InterruptedException, IOException {
		 
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
		 
		 MobileElement vyro_btn=element2.Vyro_btn;
		 MobileElement vyro_mail=element2.vyro_mail;
		 vyro_btn.click();
		 String mail=vyro_mail.getText();
		 String original="background.changer.support@vyro.ai";
		 if(mail.equals(original)) {
	        	System.out.println("TC:05 Mail is correct !!!");	
	        	screenshot2("Vyro's mail");
	       	}
		 else {
			 System.out.println("Mail is in-correct !!!");
			 AssertJUnit.assertTrue(false);
		 }
		 vyro_mail.click();
		 
	 }
	 @Test
	  public void F_Testcase6() throws InterruptedException, IOException {
		 
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
		 
		 MobileElement vyro_btn=element2.Vyro_btn;
		 MobileElement mail_subject=element2.mail_subject;
		 String mail=mail_subject.getText();
		 String original="Background Changer Feedback";
		 if(mail.equals(original)) {
	        	System.out.println("TC: 06 Subject is correct !!!");	
	        	screenshot2("Email's Subject");
	       	}
		 else {
			 System.out.println("Subject is in-correct !!!");
			 AssertJUnit.assertTrue(false);
		 }
		 
	 }
	 
	 @Test
	  public void G_Testcase7() throws InterruptedException {
		 
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
		 
		 MobileElement send_btn=element2.send_btn;
		 MobileElement compose_area=element2.compose_area;
		 MobileElement settings_page=element2.settings_heading;
		 compose_area.click();
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.H));
		 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.I));
		 send_btn.click();
		 
if(settings_page.isDisplayed()) {
			 
			 System.out.println("TC:07 Woohoo succesfully navigated back to app");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 
	 }
	 
	 @Test
	  public void H_Testcase8() throws InterruptedException, IOException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
	
		
		 MobileElement help=element2.help;
		 MobileElement help_heading=element2.help_heading;
		
		 help.click();
	
		 if(help_heading.isDisplayed()) {
			 
			 System.out.println("TC:08 Woohoo succesfully opened help !!!");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 screenshot2("Help screen");
	 }

	 @Test
	  public void I_Testcase9() throws InterruptedException, IOException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
	
		
		 MobileElement help=element2.help;
		 MobileElement help_heading=element2.help_heading;
		 MobileElement back_btn=element2.back_btn_2;
		 MobileElement settings_headings=element2.settings_heading;
		
		 back_btn.click();
	
		 if(settings_headings.isDisplayed()) {
			 
			 System.out.println("TC:09 Woohoo succesfully closed help !!!");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 screenshot2("Back from help");
	 }
	 @Test
	  public void J_Testcase10() throws InterruptedException, IOException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
	
		
		 MobileElement help=element2.help;
		 MobileElement help_heading=element2.help_heading;
		 MobileElement contactus_btn=element2.contactus_button;
		 MobileElement settings_headings=element2.settings_heading;
		 
		 help.click();
		 ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CONTACT US\"));");
		
		 
		 if(contactus_btn.isDisplayed()) {
			 
			 System.out.println("TC:10 Woohoo succesfully scrolled till contact us!!!");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
		 screenshot2("Contact us button");
	 }
	 @Test
	  public void K_Testcase11() throws InterruptedException {
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
	
		
		 MobileElement help=element2.help;
		 MobileElement help_heading=element2.help_heading;
		 MobileElement contactus_btn=element2.contactus_button;
		 MobileElement settings_headings=element2.settings_heading;
		 
		 contactus_btn.click();
		 
		 MobileElement gmail_app=element2.gmail_app;
		 MobileElement composetext=element2.Compose_text;
		
		
		 gmail_app.click();
		 
if(composetext.isDisplayed()) {
			 
			 System.out.println("TC:11 Woohoo succesfully navigated to gmail");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 


((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
MobileElement back_btn=element2.back_btn_2;


back_btn.click();		
	 }
	 @Test
	  public void L_Testcase12() throws InterruptedException, IOException {
		 
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
		 MobileElement rate=element2.rate;
		 MobileElement open_withview=element2.open_with_view;
		 rate.click();
 if(open_withview.isDisplayed()) {
			 
			 System.out.println("TC:12 Woohoo succesfully opened rate view!!!");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
 screenshot2("Rate view");
 ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	 }
	 
	 @Test
	  public void M_Testcase13() throws InterruptedException, IOException {
		 
		 setting_pg_test element2= new  setting_pg_test((AndroidDriver) driver);
		 MobileElement more_by_vyro=element2.more_by_vyro;
		 MobileElement refine_app=element2.refine_app;
		 wait(more_by_vyro);
		 more_by_vyro.click();
if(refine_app.isDisplayed()) {
			 
			 System.out.println("TC:13 More by vyro is clickable!!!");
			 screenshot2("Morebyvyro screen");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("Tch tch Failed ;(");
			} 
((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
MobileElement back_btn=element2.back_btn;

back_btn.click();
		 
	 }
	
		
		
	
	 
}
