package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElementPresents_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement CheckBox1= driver.findElement(By.id("checkBoxOption1"));
		
		boolean CheckBox1_IsDisplayed =  CheckBox1.isDisplayed();
		System.out.println("CheckBox1 WebElement is Displayed : " + CheckBox1_IsDisplayed);
		
		boolean CheckBox1_IsSelected= CheckBox1.isSelected();
		System.out.println("CheckBox1 WebElement is Selected : " + CheckBox1_IsSelected);
		
		
		WebElement OpenWindow= driver.findElement(By.id("openwindow"));
		
		boolean OpenWindow_IsEnabled= OpenWindow.isEnabled();
		System.out.println("Open Window WebElement is Enabled : " + OpenWindow_IsEnabled);
		

	}

}
