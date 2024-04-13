package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Print_Radiobuttons_29 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        
        Thread.sleep(1000);
        
       List<WebElement> RadioButton= driver.findElements(By.xpath("//input[@name='radioButton']"));
       int RadioButton_Size= RadioButton.size();
       System.out.println("RadioButton_Size is : " + RadioButton_Size);
       
       for(WebElement ele : RadioButton)
    	   
       {
    	   String AttributeValue= ele.getAttribute("value");
    	   System.out.println("Radio button Name is : "  + AttributeValue);
       }
        
        

	}

}
