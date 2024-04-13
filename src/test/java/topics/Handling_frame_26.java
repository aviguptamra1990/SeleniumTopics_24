package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frame_26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
		Thread.sleep(3000);
		
	    //driver.switchTo().frame(1);
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div[text()='Share']")).click();
		
		Thread.sleep(1000);
		
		//driver.switchTo().parentFrame();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("a077aa5e");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
	    driver.switchTo().frame(driver.findElement(By.id("a077aa5e")));
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	    
	    driver.switchTo().parentFrame();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//a[text()='Bank Project']")).click();
	    
	    
		
		
		
		
		
		
		

	}

}
