package topics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        
        Stopwatch watch=null;
        
        try {
        	
        	watch = Stopwatch.createStarted();
        	
        	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        	wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.id("id"))));
        	
        }
        
        catch(Exception e)
        
        {
        	watch.stop();
        	
        	System.out.println("Exception occurs : " + e);
        	
        	long ElepasedTime= watch.elapsed(TimeUnit.SECONDS);
        	
        	System.out.println(ElepasedTime);
        	
        }

	}

}
