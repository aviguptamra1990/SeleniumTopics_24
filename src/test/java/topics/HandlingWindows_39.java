package topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows_39 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        
        Thread.sleep(1000);
        
        String SingleWindowHandling= driver.getWindowHandle();
        System.out.println("Primary Window Id is :  " + SingleWindowHandling);
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//a[text()=' HOTELS ']")).click();
        
        Set<String> SecondryWindowHandling= driver.getWindowHandles();
        System.out.println("Secondry & Primary both Window Id is : " + SecondryWindowHandling);
        int SecondryWindow_Size= SecondryWindowHandling.size();
        System.out.println(SecondryWindow_Size);
        
        for(String str : SecondryWindowHandling)
        	
        {
        	
        	if(!SingleWindowHandling.equalsIgnoreCase(str))
        		
        	{
        		driver.switchTo().window(str);
        		
        		String HotelTabTitle=driver.getTitle();
        		System.out.println("Hotel Tab Title is : " + HotelTabTitle);
        		break;
        	}
        	
        	
        	
        }
        
        driver.switchTo().window(SingleWindowHandling);
        
        String IrctcTabTitle=driver.getTitle();
		System.out.println("IRCTC Tab Title is : " + IrctcTabTitle);
        
        
        

	}

}
