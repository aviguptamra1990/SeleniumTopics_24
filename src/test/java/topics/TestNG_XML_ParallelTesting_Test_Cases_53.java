package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_XML_ParallelTesting_Test_Cases_53 {
	
	WebDriver driver;
	
	@Test
	public void edge()
	{
		WebDriverManager.edgedriver().setup();
 		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println("title " + title);
		
		
		
	}
	
	@Test
	public void edgeBrowser()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String CurrentURL= driver.getCurrentUrl();
		System.out.println("CurrentURL " + CurrentURL);
		
		
	}

}
