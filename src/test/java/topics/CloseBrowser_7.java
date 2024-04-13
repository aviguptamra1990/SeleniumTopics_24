package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    driver.findElement(By.id("opentab")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("openwindow")).click();
    
    Thread.sleep(2000);
    
    driver.close();
	
		
	}

}
