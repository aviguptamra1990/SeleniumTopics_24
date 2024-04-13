package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_XML_ParallelTesting_Test_Cases_52 {
	
	WebDriver driver;
	
	@Test
	public void getTitle()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println("title " + title);
		
		
		
	}
	
	@Test
	public void getCurrentURL()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String CurrentURL= driver.getCurrentUrl();
		System.out.println("CurrentURL " + CurrentURL);
		
		
	}

}
