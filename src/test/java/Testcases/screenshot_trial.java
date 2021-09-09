package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.baseclasstwo;

public class screenshot_trial extends baseclasstwo {
	//screenshot();
	public void screenShot(String filename) throws IOException, InterruptedException {
		
		String destDir = "screenshots";
	    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    new File(destDir).mkdirs();
	    File dest = new File(System.getProperty("user.dir")+"\\"+filename+".png");
	    FileUtils.copyFile(scr, dest);
	}

}
