package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Testng_Listeners_Test_Cases_60 {
	
      static WebDriver driver;
	
	@Test
	
	public void AbotTitleInvalid() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       
       Thread.sleep(3000);
       
       driver.findElement(By.name("password")).sendKeys("secret_sauce");
       
       Thread.sleep(3000);
       
       driver.findElement(By.className("btn_action")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.cssSelector("div.bm-burger-button")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.cssSelector("a[id='about_sidebar_link']")).click();
       
       Assert.assertEquals(driver.getTitle(), "sauce labs");
       
		
	}
	
	
	@Test
public void AbotTitleValid() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       
       Thread.sleep(3000);
       
       driver.findElement(By.name("password")).sendKeys("secret_sauce");
       
       Thread.sleep(3000);
       
       driver.findElement(By.className("btn_action")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.cssSelector("div.bm-burger-button")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.cssSelector("a[id='about_sidebar_link']")).click();
       
       Assert.assertEquals(driver.getTitle(), "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
       
	   
	}
	
	
	
	
	

}
