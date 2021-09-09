package pageobjects;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class onboarding_view {

	public onboarding_view(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/buttonOnBoardingAction")

public MobileElement next_btn;


@AndroidFindBy(id="com.vyroai.AutoCutCut:id/buttonSkipAction")

public MobileElement skip_btn;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Person']")

public MobileElement Person;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Premium Features']")

public MobileElement premium;


}


