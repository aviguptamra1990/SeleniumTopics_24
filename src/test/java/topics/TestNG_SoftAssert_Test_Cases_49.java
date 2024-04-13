package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAssert_Test_Cases_49 {
	
WebDriver driver;

SoftAssert asserts;
	
	@Test()
	public void browserDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		asserts=new SoftAssert();
	}
	
	@Test
	public void getTitle()
	{
		String title= driver.getTitle();

		asserts.assertEquals(title, "Google1111111");
		
		System.out.println("After Title Assertion failed, This line will be execute");
		
		asserts.assertAll();
		
		
		
		
		
		
	}
	
	@Test
	public void getCurrentURL()
	{
		String CurrentURL= driver.getCurrentUrl();

		asserts.assertEquals(CurrentURL, "https://www.google.com/");
		
		System.out.println("After CurrentURL Assertion PASSESD, This line will be execute");
		
		asserts.assertAll();
		
		
		
	}

	

}
