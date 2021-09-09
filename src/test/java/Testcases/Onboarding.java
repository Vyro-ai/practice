package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageobjects.Home_page;
import pageobjects.onboarding_view;

public class Onboarding extends baseclasstwo{
	 @Test
	  public void A_onboarding_1() throws InterruptedException {
		 Thread.sleep(5000);
		 onboarding_view element=new  onboarding_view((AndroidDriver) driver);
			
			MobileElement next=element.next_btn;
			MobileElement premium=element.premium;
			
			for(int i=0;i<4;i++) {
				next.click();
				System.out.println("next clicked once");
			
			
			}
			if(premium.isDisplayed()==true) {
       			System.out.println("Woohoo Success :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}
		 
	 }
/*	 @Test
	  public void B_onboarding_2() {
		 onboarding_view element=new  onboarding_view((AndroidDriver) driver);
			
			MobileElement skip=element.skip_btn;
			MobileElement person=element.Person;
			MobileElement premium=element.premium;
			skip.click();
			if(premium.isDisplayed()==true) {
       			System.out.println("Woohoo Success :D ");
       		}
       		else {
       			AssertJUnit.assertTrue(false);
       			System.out.println("Tch tch Failed ;(");
       		}
		 
	 }
*/
}
