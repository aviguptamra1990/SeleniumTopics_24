package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadlessBrowser_31 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        FirefoxOptions opt=new FirefoxOptions();
        opt.setHeadless(true);
		WebDriver driver=new FirefoxDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        
        String CurrentURLTitle= driver.getTitle();
        System.out.println("Current URL Title is : " + CurrentURLTitle);
        

	}

}
