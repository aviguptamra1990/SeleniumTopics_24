package topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot_32 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        
        
        Thread.sleep(1000);
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        
        File file= ts.getScreenshotAs(OutputType.FILE);
       
        FileUtils.copyFile(file, new File("C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumTopics_24\\ScreenShot\\SimpleScreenShot.png"));
        
        Thread.sleep(1000);
        
        WebElement WebTableExample= driver.findElement(By.id("autocomplete"));
        
        File WebElementFile= WebTableExample.getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(WebElementFile, new File("C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumTopics_24\\ScreenShot\\WebElementScreenShot.png"));
        
        Thread.sleep(1000);
        
        WebElement WebElementSection= driver.findElement(By.className("gf-t"));
        
        File SectionFile= WebElementSection.getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(SectionFile, new File("C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumTopics_24\\ScreenShot\\WebElementSection.png"));
        

	}

}
