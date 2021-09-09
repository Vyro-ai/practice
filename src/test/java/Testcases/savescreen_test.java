package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import pageobjects.Home_page;
import pageobjects.Overlay_view_Test;
import pageobjects.save_screen_test;

public class savescreen_test extends baseclasstwo {
	
	@Test 
	public void A_Testcase1() throws InterruptedException, IOException {
	//	  Thread.sleep(30000);
		  save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
	//		 List<MobileElement> footer_options=element2.footer_options;
			 MobileElement savebutton=element2.save_card_view;
			 MobileElement save_in_hd=element2.save_inhd;
			 savebutton.click();
			 wait(save_in_hd);
			 screenshot("Save options");
			 if(save_in_hd.isDisplayed()) {
				 
				 System.out.println("TC:1 Save view opened");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
	  }
	
	@Test 
	public void B_Testcase2() throws InterruptedException, IOException {
		  
		  save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
	//		 List<MobileElement> footer_options=element2.footer_options;
			 MobileElement save_without_hdbutton=element2.save_without_hd;
			 MobileElement savetext=element2.rateus;
			 save_without_hdbutton.click();
			 wait(savetext);
			 screenshot("Rate us dialogue");
			 if(savetext.isDisplayed()) {
				 
				 System.out.println("TC:2 Woohoo image saved without");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
	  }
	
	
	@Test 
	  public void C_Testcase3() throws InterruptedException, IOException {
		save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
		//		 List<MobileElement> footer_options=element2.footer_options;
				 MobileElement rate_us_btn=element2.rate_us_btn;
				 MobileElement dontshow=element2.dontshow;
				 MobileElement star=element2.stars;
				 MobileElement savetext=element2.share_text;
				 star.click();
				 rate_us_btn.click();
				 dontshow.click();
				 wait(savetext);
				 screenshot("Rate us dialogue closed");
				 
				 if(savetext.isDisplayed()) {
					 
					 System.out.println("TC:3 App rated");
					}
					else {
						AssertJUnit.assertTrue(false);
						System.out.println("Tch tch Failed ;(");
					}
		
	}


	@Test 
	  public void D_Testcase4() throws InterruptedException, IOException {
		  save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
			//		 List<MobileElement> footer_options=element2.footer_options;
					 MobileElement savebutton=element2.save_card_view;
					
					 MobileElement backbutton=element2.back_btn;
					 
					 backbutton.click();
					 wait(savebutton);
					 screenshot("backto edit screen");
					 if(savebutton.isDisplayed()) {
						 
						 System.out.println("TC:4 Woohoo back from save screen");
						}
						else {
							AssertJUnit.assertTrue(false);
							System.out.println("Tch tch Failed ;(");
						} 
					
		  
	  }
	
	@Test 
	public void E_Testcase5() throws InterruptedException, IOException {
		 
		  save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
	//		 List<MobileElement> footer_options=element2.footer_options;
			 MobileElement save_inhd_button=element2.save_inhd;
			 MobileElement save_imageview=element2.save_card_view;

			 MobileElement savetext=element2.share_text;
			 save_imageview.click();
			 save_inhd_button.click();
			 wait(savetext);
			 screenshot("Image saved in HD");
			 if(savetext.isDisplayed()) {
				 
				 System.out.println("TC:5 Woohoo image saved in hd");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
	  }

	@Test 
	  public void F_Testcase6() throws InterruptedException, IOException {
		  save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
			//		 List<MobileElement> footer_options=element2.footer_options;
					 MobileElement savebutton=element2.save_btn;
					 MobileElement image_maxview=element2.image;
					
					 MobileElement savetext=element2.share_text;
					 
					 MobileElement imageview=element2.imageview;
					 image_maxview.click();
					 wait(imageview);
					 screenshot("Max size of image checked");
					 imageview.click();
					
					 if(savetext.isDisplayed()) {
						 
						 System.out.println("TC:6 Woohoo succesfully checked image.");
						}
						else {
							AssertJUnit.assertTrue(false);
							System.out.println("Tch tch Failed ;(");
						} 
					
		  
	  }
	@Test  
	  public void G_Testcase7() throws InterruptedException {
		  save_screen_test element2= new  save_screen_test((AndroidDriver) driver);
			//		 List<MobileElement> footer_options=element2.footer_options;
					
					  Home_page element=new Home_page((AndroidDriver) driver);
					
					  MobileElement Person=element.Person;
					  MobileElement homebutton=element2.home_btn;
					 homebutton.click();
					
					 if(Person.isDisplayed()) {
						 
						 System.out.println("TC:7 Woohoo succesfully navigated to home");
						}
						else {
							AssertJUnit.assertTrue(false);
							System.out.println("Tch tch Failed ;(");
						} 
					 
		  
	  }

}
