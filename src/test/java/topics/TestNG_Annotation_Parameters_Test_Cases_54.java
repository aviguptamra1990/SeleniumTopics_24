package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Annotation_Parameters_Test_Cases_54 {
	
	WebDriver driver;
	
	@Test
	@Parameters ({"Value1","Value2"})
	public void getTitle(String param1,String param2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\Users\\ASUS\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys(param1 + param2,Keys.ENTER);
		
		
	}
	
	@Test
	@Parameters ({"Value3","Value4"})
	public void getCurrentURL(String param1, String param2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\Users\\ASUS\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys(param1 + param2,Keys.ENTER);
		
		
	}

	
	

}
