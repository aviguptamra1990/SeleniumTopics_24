package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		WebElement Radio1= driver.findElement(By.xpath("//input[@value='radio1']"));
		
		String Radio1_Text= Radio1.getText();
		System.out.println("Radio1 WebElement Text is : " + Radio1_Text);
		
		
		WebElement OpenWindow= driver.findElement(By.id("openwindow"));
		
		String openwindow_Text= OpenWindow.getText();
		System.out.println("openwindow WebElement Text is : "  + openwindow_Text);
		
		
		WebElement MouseHover= driver.findElement(By.id("mousehover"));
		
		String MouseHover_Text= MouseHover.getText();
		System.out.println("MouseHover WebElement Text is : " + MouseHover_Text);

	}

}
