package topics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Fill_A_Form_In_One_Statement_38 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        Thread.sleep(1000);
        
        Actions actions=new Actions(driver);
        
        Action SeriesOfactions = actions
        		                 .click(driver.findElement(By.id("user-name")))
                                 .sendKeys("standard_user", Keys.TAB)
                                 .sendKeys("secret_sauce", Keys.ENTER).build();
                         
        
                                 SeriesOfactions.perform();
        		          
                         

	}

}
