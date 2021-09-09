package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class save_screen_test {
	public save_screen_test(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryTV")

	public MobileElement save_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/homeView")

	public MobileElement home_btn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Share']")

	public MobileElement share_text;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/sharePicView")

	public MobileElement image;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/contentView")

	public MobileElement imageview;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Rate Us!']")

	public MobileElement rateus;
	
	@AndroidFindBy(xpath="//android.widget.ImageView")

	public MobileElement stars;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/rate_btn")

	public MobileElement rate_us_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/dontShowText")

	public MobileElement dontshow;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveWithoutHd")

	public MobileElement save_without_hd;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveCardView")

	public MobileElement save_card_view;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveInHd")

	public MobileElement save_inhd;
	

	

//com.vyroai.AutoCutCut:id/featureThumb





}
