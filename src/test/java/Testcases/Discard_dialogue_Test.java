package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageobjects.Discard_dialogue;
import pageobjects.EditImageScreen;
import pageobjects.save_screen_test;

public class Discard_dialogue_Test extends baseclasstwo{
	@Test 
	public void A_Testcase1() throws InterruptedException, IOException {
		 
		  Discard_dialogue element2= new  Discard_dialogue((AndroidDriver) driver);
	//		 List<MobileElement> footer_options=element2.footer_options;
			 MobileElement discard_dialogue=element2.description;
			 MobileElement back_btn=element2.back_view;
			 
			 back_btn.click();
			 wait(discard_dialogue);
			 screenshot("Discard_dialogue");
			 if(discard_dialogue.isDisplayed()) {
				 
				 System.out.println("TC:1 Discard dialogue given to user");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
	  }
	
	@Test 
	public void B_Testcase2() throws InterruptedException, IOException {
		  
		  Discard_dialogue element2= new  Discard_dialogue((AndroidDriver) driver);
			//		 List<MobileElement> footer_options=element2.footer_options;
					 MobileElement No_btn=element2.No_discard;
					 MobileElement back_btn=element2.back_view;
					 No_btn.click();
					// wait3(back_btn);
					 screenshot("NO clicked on discard dialogue");
			 if(back_btn.isDisplayed()) {
				 
				 System.out.println("TC:2 No button clicked");
				}
				else {
					AssertJUnit.assertTrue(false);
					System.out.println("Tch tch Failed ;(");
				}
	  }
	
	
	@Test 
	  public void C_Testcase3() throws InterruptedException, IOException {
		  Discard_dialogue element2= new  Discard_dialogue((AndroidDriver) driver);
			//		 List<MobileElement> footer_options=element2.footer_options;
					 MobileElement yes_btn=element2.yes_discard;
					 MobileElement back_btn=element2.back_view;
					 MobileElement flip_btn=element2.flip_btn;
					  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
				
						MobileElement forwardicon=element1.forward_icon;
					
					 
					 back_btn.click();
					
					 yes_btn.click();
					 wait(flip_btn);
					 screenshot("Yes clicked on Discard_dialogue");
					 if(flip_btn.isDisplayed()) {
						 
						 System.out.println("TC:3 Changes are discarded !!");
						}
						else {
							AssertJUnit.assertTrue(false);
							System.out.println("Tch tch Failed ;(");
						}
					 
					 
					 forwardicon.click();	 
		
	}
}
