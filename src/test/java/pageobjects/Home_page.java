package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Home_page {

	
	public Home_page(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ic_folder_album")
	
	public MobileElement gallery_home;
	
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ic_folder_camera")
	
	public MobileElement camera_home;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ic_folder_creation")

public MobileElement creations_home;
	
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/albumText")

public MobileElement Home;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Download']")

public MobileElement Downloads;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tvCancel")

public MobileElement close_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivCarrot")

public MobileElement Dropdown;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Folders']")

public MobileElement Folder;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Download']")

public MobileElement Download_Folder;
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivImage")

public List<MobileElement> images;

		@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Image\"])[2]")

		public MobileElement img2;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Person']")

public MobileElement Person;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Object']")

public MobileElement Object;


@AndroidFindBy(id="com.vyroai.AutoCutCut:id/fabPerson")

public MobileElement float_person;
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/fabObject")

public MobileElement float_object;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryTV")

public List<MobileElement> Object_seg;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryTV")

public List<MobileElement> human_seg;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Gallery']")

public MobileElement gallery;

@AndroidFindBy(xpath="//android.widget.TextView[@text='PicsApp']")

public MobileElement bg_eraser_folder;

@AndroidFindBy(xpath="//android.widget.TextView[@text='WebImages']")

public MobileElement webimages_folder;


@AndroidFindBy(id="com.vyroai.AutoCutCut:id/btnAlbums")

public MobileElement album_button;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/btnCamera")

public MobileElement camera_button;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

public MobileElement back_btn;



@AndroidFindBy(id="com.vyroai.AutoCutCut:id/ivSettings")

public MobileElement settings;

@AndroidFindBy(xpath="//android.widget.Button[@text='WebImages']")

public MobileElement webimages_button;



@AndroidFindBy(id="com.vyroai.AutoCutCut:id/crossImg")

public MobileElement close_text_view;



@AndroidFindBy(id="com.vyroai.AutoCutCut:id/btnCamera")

public MobileElement camera;

@AndroidFindBy(xpath="//GLButton[@text='Shutter']")

public MobileElement shutter;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Retry']")

public MobileElement retry;

@AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")

public MobileElement ok_btn;

/*  com.vyroai.AutoCutCut:id/btnCamera

GLButton
text
Shutter

android.widget.TextView
text
Retry

android.widget.TextView
text
OK
*/




}
