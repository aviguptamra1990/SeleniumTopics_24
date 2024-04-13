package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Print_Hyperlinks_28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		List<WebElement> Links= driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
		int Links_Size= Links.size();
		System.out.println(Links_Size);
		
		for(WebElement ele : Links)
		{
			String Links_Text=ele.getText();
			System.out.println("Link Name is : " + Links_Text);
		}
		
		
		Thread.sleep(1000);
		
		System.out.println("-----------------------------");
		
		
		for(int i=0;i<=Links_Size-1;i++)
			
		{
			WebElement Ele= Links.get(i);
			String Linkss= Ele.getText();
			System.out.println("Link name is : " + Linkss);
		}

	}

}
