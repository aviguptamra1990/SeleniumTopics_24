package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GetCurrentUrl_10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxOptions opt=new FirefoxOptions();
		opt.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ASUS\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		String Loaded_Current_URL=driver.getCurrentUrl();
		System.out.println("Loaded Current URL is : " + Loaded_Current_URL);
		
		

	}

}
