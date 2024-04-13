package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Tooltip_25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement ToolTip= driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
		
		act.moveToElement(ToolTip).build().perform();
		
		String ToolTip_Attribute_title= ToolTip.getAttribute("title");
		System.out.println("ToolTip Text is : " + ToolTip_Attribute_title);
		
		
		

	}

}
