package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Keyword_InnvocationCount_Test_Cases_47 {
	
WebDriver driver;
	
	@Test()
	public void browserDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
	}
	
	
	
	@Test(invocationCount = 2)
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		
		
	}
	
	@Test(invocationCount = 1)
	public void getCurrentURL()
	{
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	@Test(invocationCount = 0)
	public void getPageSource()
	{
		System.out.println(driver.getPageSource());
		
		
	}


}
