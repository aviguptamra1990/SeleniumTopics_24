package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Keyword_Description_Test_Cases_45 {

	WebDriver driver;
	
	@Test(description = "Launch the google chrome browser before execute any @Test")
	public void browserDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
	}
	
	
	
	@Test(description = "Once the browser has been launched then execute this getTitle @Test to get the google.com page title")
	public void getTitle()
	{
		System.out.println(driver.getTitle());
		
		
	}

}
