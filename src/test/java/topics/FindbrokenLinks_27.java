package topics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindbrokenLinks_27 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@id='gf-BIG']//li//a"));
		int Links_Size= links.size();
		System.out.println("Links_Size is : " + Links_Size);
		
		int RespoCode=200;
		int brokenlinksCount=0;
		
		for(WebElement ele : links)
			
		{
			String href= ele.getAttribute("href");
			
			try {
				
				URL url=new URL(href);
				HttpURLConnection huc= (HttpURLConnection)url.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				RespoCode=huc.getResponseCode();
				
				if(RespoCode>=400)
					
				{
					System.out.println(href + " - " + RespoCode + " : broken links");
					brokenlinksCount++;
				}
				
				else
				{
					System.out.println(href + " - "+  RespoCode + ": Valid link");
				}
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		System.out.println(brokenlinksCount);

	}

}
