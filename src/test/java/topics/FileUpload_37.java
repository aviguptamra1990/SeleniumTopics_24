package topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_37 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ASUS\\Downloads\\appium-server-logs.txt");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("file_wraper0")).click();
        
        Thread.sleep(3000);
        
        Robot rob=new Robot();
        
        // copying File path to Clipboard
        StringSelection ss=new StringSelection("C:\\Users\\ASUS\\Downloads\\17102436687821716596.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        // press Contol+V for pasting
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_V);
        
     // release Contol+V for pasting
        rob.keyRelease(KeyEvent.VK_CONTROL);
        rob.keyRelease(KeyEvent.VK_V);
        
     // for pressing and releasing Enter
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        
        
   	     
        
        

	}

}
