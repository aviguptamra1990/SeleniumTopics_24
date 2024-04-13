package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GetAttribute_12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxOptions opt=new FirefoxOptions();
		opt.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		WebElement SignUp= driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]"));
		String SignUp_InnerHTML= SignUp.getAttribute("innerHTML");
		System.out.println("SignUp WebElement Attribute InnerHTML value is : " + SignUp_InnerHTML);
		
		Thread.sleep(1000);
		
		WebElement TypeToSelectCountry= driver.findElement(By.id("autocomplete"));
		String TypeToSelectCountry_PlaceHolder= TypeToSelectCountry.getAttribute("placeholder");
		System.out.println("TypeToSelectCountry WebElement Attribute PlaceHolder value is : " + TypeToSelectCountry_PlaceHolder);
		
		Thread.sleep(1000);
		
		String TypeToSelectCountry_Id= TypeToSelectCountry.getAttribute("id");
		System.out.println("TypeToSelectCountry WebElement Attribute Id value is : " + TypeToSelectCountry_Id);
		
		Thread.sleep(1000);
		
		String TypeToSelectCountry_Class= TypeToSelectCountry.getAttribute("class");
		System.out.println("TypeToSelectCountry WebElement Attribute Class value is : " + TypeToSelectCountry_Class);
		
	    Thread.sleep(1000);
		
		String TypeToSelectCountry_Type= TypeToSelectCountry.getAttribute("type");
		System.out.println("TypeToSelectCountry WebElement Attribute Type value is : " + TypeToSelectCountry_Type);

	}

}
