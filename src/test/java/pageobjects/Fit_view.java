package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Fit_view {

	public Fit_view(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/buttonOnBoardingAction")

public MobileElement next_btn;


@AndroidFindBy(id="com.vyroai.AutoCutCut:id/itemIcon")

public List<MobileElement> colors;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/featureThumb")

public List<MobileElement> grids;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/resetContentView")

public MobileElement reset;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveCardView")

public MobileElement save_btn;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cancelImageView")

public MobileElement close_fit_view;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

public MobileElement apply_structure;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

public List<MobileElement> footer_options;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveImageView")

public MobileElement save_img_view;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

public MobileElement back_view;

@AndroidFindBy(id="com.vyroai.AutoCutCut:id/undoView")

public MobileElement undo;


}
