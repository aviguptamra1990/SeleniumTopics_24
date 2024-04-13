package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations_41 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		
		  act.click(driver.findElement(By.xpath("//button[text()='Search']"))).build().
		  perform();
		  
		  Thread.sleep(1000);
		  
		  act.contextClick(driver.findElement(By.xpath("//a[text()=' MORE ']"))).build(
		  ).perform();
		  
		  Thread.sleep(1000);
		  
		  act.doubleClick(driver.findElement(By.xpath("//button[text()='Search']"))).
		  build().perform();
		  
		  Thread.sleep(1000);
		  
		  act.clickAndHold(driver.findElement(By.xpath("//strong[text()='TRAINS']"))).
		  build().perform();
		  
		  Thread.sleep(1000);
		  
		  act.moveToElement(driver.findElement(By.
		  xpath("//span[text()='Cancel Ticket']"))).build().perform();
		  
		  Thread.sleep(1000);
		  
		  act.moveToElement(driver.findElement(By.
		  xpath("//span[text()='Counter Ticket']"))).build().perform();
		  
		  Thread.sleep(1000);
		  
		  act.scrollToElement(driver.findElement(By.xpath("//span[text()='About us']"))
		  ).build().perform();
		  
		 Thread.sleep(1000);
		
		act.sendKeys(driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")), "New Delhi").build().perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB,"Morena").build().perform();
		
		
		

	}

}
