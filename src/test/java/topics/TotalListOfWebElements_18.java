package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalListOfWebElements_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		 List<WebElement> totalWebElements  = driver.findElements(By.xpath("//*"));
		 int TotalWebElementSize=totalWebElements.size();
		 System.out.println(TotalWebElementSize);
		 
		 for(WebElement ele : totalWebElements)
			 
		 {
			 
			 String totalWebElements_Name= ele.getText();
			 System.out.println(totalWebElements_Name);
			 
		 }

	}

}
