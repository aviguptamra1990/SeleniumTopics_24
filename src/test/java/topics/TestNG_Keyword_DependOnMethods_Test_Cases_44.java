package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Keyword_DependOnMethods_Test_Cases_44 {
	
	
   WebDriver driver;
	
	@Test
	public void browserDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		
	}
	
	@Test(dependsOnMethods = "maximizeBrowser")
	public void launchBrowser()
	{
		
		
		driver.get("https://www.google.com");
		
	}
	
	@Test(dependsOnMethods = "browserDriver")
	public void maximizeBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
	}
	
	@Test(dependsOnMethods = "maximizeBrowser")
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		
		
	}
	
	

}
