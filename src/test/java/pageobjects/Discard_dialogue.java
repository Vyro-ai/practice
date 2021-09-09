package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Discard_dialogue {
	public Discard_dialogue(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_view;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='No']")

	public MobileElement No_discard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Yes']")

	public MobileElement yes_discard;
	
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/description")

	public MobileElement description;
	

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/flipWrapper")

public MobileElement flip_btn;
}	










