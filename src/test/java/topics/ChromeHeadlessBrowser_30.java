package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrowser_30 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions opt= new ChromeOptions();
        opt.setHeadless(true);
		WebDriver driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        
        String CurrentURLTitle= driver.getTitle();
        System.out.println("Current URL Title is : " + CurrentURLTitle);

	}

}
