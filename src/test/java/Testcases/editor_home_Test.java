package Testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import Baseclass.baseclasstwo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageobjects.EditImageScreen;
import pageobjects.Home_page;
import pageobjects.gradient_pg;

public class editor_home_Test extends baseclasstwo{
	
	  @Test
	  public void A_editor_home_1() throws InterruptedException, IOException {
		  Thread.sleep(10000);
		  Home_page element=new Home_page((AndroidDriver) driver);
			
		  EditImageScreen element1=new EditImageScreen((AndroidDriver) driver);
			 
			
			MobileElement Person=element.Person;
			MobileElement Person_float_btn=element.float_person;
			MobileElement Object_float_btn=element.float_object;
			List<MobileElement> images=element.images;
			MobileElement Searchbar=element1.search_bar;
			MobileElement forwardicon=element1.forward_icon;
			MobileElement albums=element.album_button;
			MobileElement webimages=element.Download_Folder;
			
			
			Person.click();
			
			Thread.sleep(5000);
			albums.click();
			webimages.click();
			Thread.sleep(5000);
			 images.get(5).click();
			 wait(Searchbar);
			 
			
			
			 
			 gradient_pg element2= new gradient_pg((AndroidDriver) driver);
			 List<MobileElement> bg_options=element2.gradient_option;
			  MobileElement gradient_tab=element2.gradient_tab;
			  gradient_tab.click();
			 //com.vyroai.AutoCutCut:id/thumbnailIV
			 
					 
					 bg_options.get(1).click();
					 forwardicon.click();
			 
	  }
	
	 

}
