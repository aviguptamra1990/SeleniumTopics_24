package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_On_ImageLink_20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("navbar-brand")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://www.opencart.com/index.php?route=common/home']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();

	}

}
