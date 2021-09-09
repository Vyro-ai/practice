package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class setting_pg_test {

	
	public setting_pg_test(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

	public List<MobileElement> footer_options;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")


	public MobileElement settings_heading;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Get Inspired']")

	public MobileElement instagram;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='background.changer']")
	
	public MobileElement insta_view;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Contact Us']")

	public MobileElement contact_us;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Help']")
	
	public MobileElement help;
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='Rate']")
	
	public MobileElement rate;
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='More by Vyro']")


public MobileElement more_by_vyro;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Refine Photo']")

public MobileElement refine_app;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Focus']")

public MobileElement help_heading;

@AndroidFindBy(xpath="//android.widget.Button[@text='Get Inspired']")

public MobileElement insta_button;

@AndroidFindBy(xpath="//android.widget.Button[@text='CONTACT US']")

public MobileElement contactus_button;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivSettings")

	public MobileElement settings;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backImg")

	public MobileElement back_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivBack")

	public MobileElement back_btn_2;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Open with']")

	public MobileElement open_with_view;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Gmail']")

	public MobileElement gmail_app;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Compose']")

	public MobileElement Compose_text;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Vyro.ai']")

	public MobileElement  Vyro_btn;

	@AndroidFindBy(id="com.google.android.gm:id/peoplekit_autocomplete_popup_contact_method")

	public MobileElement vyro_mail;
	
	@AndroidFindBy(id="com.google.android.gm:id/subject")

	public MobileElement mail_subject;
	
	@AndroidFindBy(id="com.google.android.gm:id/send")

	public MobileElement send_btn;
	
	@AndroidFindBy(id="com.google.android.gm:id/wc_body_layout")

	public MobileElement compose_area;
	
	
	
	
	/*  
	  
	  android.widget.TextView
	  text
	  Get Inspired
	  
	  
	  android.widget.TextView
	  text
	  background.changer
	  
	  
	  android.widget.TextView
	  text
	  Contact Us
	  
	  
	  android.widget.TextView
	  text
	  Help
	  
	  android.widget.TextView
	  text
	  Rate
	  
	  
	  android.widget.Button
	  text
	  More by Vyro
	  
		
	  android.widget.TextView
	  text
	  Refine Photo
	  
	  android.widget.Button
	  text
	  Get Inspired
	  
	  android.widget.TextView
	  text
	  Open with
	  */
}
