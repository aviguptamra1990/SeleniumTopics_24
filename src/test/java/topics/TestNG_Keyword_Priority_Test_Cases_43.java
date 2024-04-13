package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Keyword_Priority_Test_Cases_43 {
	
	WebDriver driver;
	
	@Test(priority = -1)
	public void browserDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		
	}
	
	@Test(priority = 1)
	public void launchBrowser()
	{
		
		
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority = 0)
	public void maximizeBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
	}
	
	@Test(priority = 2)
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		
		
	}
	
	
	
	

}
