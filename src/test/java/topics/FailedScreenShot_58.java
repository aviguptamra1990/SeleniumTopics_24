package topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class FailedScreenShot_58 extends Testng_Listeners_Test_Cases_60 {
	
	
	
	public static  void takeScreenshot(String ScreenShotName) throws IOException
	
	{
		
		
        TakesScreenshot ts = (TakesScreenshot)driver;
        
        File file= ts.getScreenshotAs(OutputType.FILE);
       
        FileUtils.copyFile(file, new File("C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumTopics_24\\Failed_TestCases_ScreenShot\\" + ScreenShotName + ".png"));
        
		
	}
	

}
