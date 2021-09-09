package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class pxbg {
	public pxbg(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='Architecture']")
	
	public MobileElement architecture_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Cars']")

public MobileElement car_tab; 

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")

public MobileElement close_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryTV")


public List<MobileElement> categoriess;

@AndroidFindBy(id="android:id/search_bar")

public MobileElement px_searchbar;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/search_action_full")

public MobileElement px_searchbutton;

@AndroidFindBy(id="android:id/search_close_btn")

public MobileElement px_searchclosebutton;

@AndroidFindBy(xpath="//android.widget.FrameLayout/android.widget.ImageView")
public List<MobileElement> Px_cat_images;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvUse")

public MobileElement apply_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivClose")

public MobileElement close_btn2;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivDownload")

public MobileElement download_img;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/progressLoader")

	public MobileElement progress_bar;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Unsplash']")


	public MobileElement google_header;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_btn;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/etSearch")

	public MobileElement search_bar;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivPhoto")

	public List<MobileElement> photo;



	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/touch_outside")

	public MobileElement outer;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivCross")

	public MobileElement cross_search;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backToTop")

	public MobileElement back_to_top;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/unsplashContainer")

	public MobileElement drag_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivPhoto")

	public MobileElement photo_view;




	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search any background']")


	public MobileElement search_bar2;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/bUse")

	public MobileElement use_btn;
		
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/focusWrapper")

	public MobileElement eraser;


}
