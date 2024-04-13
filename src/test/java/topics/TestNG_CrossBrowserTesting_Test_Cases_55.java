package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_CrossBrowserTesting_Test_Cases_55 {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browserName"})
	public void launchBrowser(String browser) throws InterruptedException
	{
		
		if(browser.equalsIgnoreCase("chrome"))
			
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
			
		{
			
			WebDriverManager.firefoxdriver().setup();
 			driver = new FirefoxDriver();

		}
		
        else if(browser.equalsIgnoreCase("edge"))
			
		{
			
        	WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		
        else
        {
        	System.out.println("No driver found");
        }
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}
