package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GetTitle_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxOptions opt=new FirefoxOptions();
		opt.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		String Current_URL_Title= driver.getTitle();
		System.out.println("Current URL Title is : "  + Current_URL_Title);

	}

}
