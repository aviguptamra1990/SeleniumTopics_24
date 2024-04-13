package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		WebElement OpenWindow= driver.findElement(By.id("openwindow"));
		
		String OpenWindowCssValue_Backg_Color= OpenWindow.getCssValue("background-color");
		System.out.println("OpenWindow WebElement 'BackGroundColor' CssValue is : " + OpenWindowCssValue_Backg_Color);
		
		String OpenWindowCssValue_FontFamily= OpenWindow.getCssValue("font-family");
		System.out.println("OpenWindow WebElement 'Font family' CssValue is : " + OpenWindowCssValue_FontFamily);
		
		String OpenWindowCssValue_FontSize= OpenWindow.getCssValue("font-size");
		System.out.println("OpenWindow WebElement 'Font size' CssValue is : " + OpenWindowCssValue_FontSize);
		
		String OpenWindowCssValue_Color= OpenWindow.getCssValue("color");
		System.out.println("OpenWindow WebElement 'Color' CssValue is : " + OpenWindowCssValue_Color);
		
		String OpenWindowCssValue_Padding= OpenWindow.getCssValue("padding");
		System.out.println("OpenWindow WebElement 'Padding' CssValue is : " + OpenWindowCssValue_Padding);
		
		String OpenWindowCssValue_Border= OpenWindow.getCssValue("border");
		System.out.println("OpenWindow WebElement 'Border' CssValue is : " + OpenWindowCssValue_Border);
		
		String OpenWindowCssValue_Invalid= OpenWindow.getCssValue("invalid");
		System.out.println("OpenWindow WebElement 'invalid' CssValue is : " + OpenWindowCssValue_Invalid);

	}

}
