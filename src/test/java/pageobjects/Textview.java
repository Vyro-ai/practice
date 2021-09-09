



package pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Textview {
	public Textview(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

	public List<MobileElement> footer_options;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveImageView")

	public MobileElement save_img_view;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cancelImageView")

	public MobileElement close_text_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

	public MobileElement apply_text;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/undoView")

	public MobileElement undo;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/dragView")

	public MobileElement drag_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/tabIconView")

	public List<MobileElement> textoptions_options;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveCardView")

	public MobileElement save_btn;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

	public MobileElement apply_imageview;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/itemTitle")

	public List<MobileElement> texts;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/compareClick")

	public MobileElement compare_button;
	
	 
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/footerView")

	public MobileElement footer_view;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/add_text_done_tv")

	public MobileElement done_button;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/textFontsView")

	public MobileElement font_color;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/textFontBgsView")

	public MobileElement font_background;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/parentView")

	public List<MobileElement> font_style;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/textAlignsView")

	public MobileElement text_alignment;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/addTextContentView")

	public MobileElement add_text;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/color_picker_view")

	public List<MobileElement> font_color_options;
	
}
