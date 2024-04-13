package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_HardAssert_Test_Cases_48 {
	
	WebDriver driver;
	

	
	@Test(retryAnalyzer = TestNG_IRetryAnalyzer_Test_Cases_50.class)
	public void getTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		Assert.assertEquals(title, "Google11111");
		
		System.out.println("Google title failed");//This line will not execute because hard assertion failed on above line, if any hard assertion failed next line wont execute.
		
		
	}
	
	@Test
	public void getCurrentURL()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String CurrentURL= driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, "https://www.google.com/");
		
		System.out.println("Get current passed");//This line will execute because hard assertion passed on above line 
		
		
	}

}
