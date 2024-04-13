package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutBrowserDriver_15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver chromedriver= new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://www.google.com");

		Thread.sleep(1000);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver firefoxdriver= new FirefoxDriver();
		firefoxdriver.manage().window().maximize();
		firefoxdriver.get("https://www.gmail.com");
		
        Thread.sleep(1000);
		
		WebDriverManager.edgedriver().setup();
		WebDriver edgedriver= new EdgeDriver();
		edgedriver.manage().window().maximize();
		edgedriver.get("https://www.google.com/images");
	}

}
