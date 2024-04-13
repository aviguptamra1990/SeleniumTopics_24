package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_40 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");
		
		
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,100)");
		
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('number').value='986674023';");
		
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@value='Send OTP']")));
		
		Thread.sleep(1000);
		
		js.executeScript("history.go(0)");
		
		Thread.sleep(1000);
		
		System.out.println(js.executeScript("return document.title").toString());
		
		Thread.sleep(1000);
		
		System.out.println(js.executeScript("return document.domain"));
		
		
		driver.quit();
		

	}

}
