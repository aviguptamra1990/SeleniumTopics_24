package topics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class implicitWait_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        
        Stopwatch watch=null;
        
    
        
        try 
        
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
        	watch= Stopwatch.createStarted();
        	
        	driver.findElement(By.id("submit1")).click();
        	
        	
        }
        
        catch(Exception e)
        
        {
        	
        	watch.stop();
        	
        	System.out.println("Exception occurs " + e);
        	
        	long ElapsedTime=watch.elapsed(TimeUnit.SECONDS);
        	System.out.println(ElapsedTime);
        	
        }
        

	}

}
