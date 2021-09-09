package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class gradient_pg {

	
	public gradient_pg(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/downloadLay")
	

	public List<MobileElement> gradient_option;
	
@AndroidFindBy(id="com.vyroai.AutoCutCut:id/categoryItemLay")
	

	public List<MobileElement> categories;


@AndroidFindBy(xpath="//android.widget.TextView[@text='Gradients']")

public MobileElement gradient_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Magazine']")

public MobileElement magazine_tab;
	
@AndroidFindBy(xpath="//android.widget.TextView[@text='Neon']")

public MobileElement neon_tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Quotes']")

public MobileElement quotes_tab;
}
