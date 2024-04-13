package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts_22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().sendKeys("Advance Alert");
		
		Thread.sleep(1000);
		
		String PromptAlert_Text=driver.switchTo().alert().getText();
		
		System.out.println("Prompt Alert Text is : " + PromptAlert_Text);
		
		driver.switchTo().alert().accept();

	}

}
