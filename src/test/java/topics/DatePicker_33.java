package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_33 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        
        Thread.sleep(1000);
        
        driver.switchTo().frame(0);
        
        Thread.sleep(1000);
     /*   
        driver.findElement(By.id("datepicker")).click();
        
        Thread.sleep(1000);
        
        List<WebElement> Days= driver.findElements(By.xpath("//td[@data-handler='selectDay']//a"));
        int CalenderDay_Size= Days.size();
        System.out.println(CalenderDay_Size);
        
        Thread.sleep(1000);
        
        for (WebElement ele : Days)
        	
        {
        	
        	String Days_Text= ele.getText();
        	System.out.println("Days Name :" + Days_Text);
        	
        	if(Days_Text.equalsIgnoreCase("25"))
        	{
        		ele.click();
        	}
        	
        }
        */
        
        Thread.sleep(3000);
        
        String ExpectedDay= "14";
        String ExpectedMonth="September";
        String ExpectedYear="2024";
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("datepicker")).click();
        
        
        while (true) {
        	
        	String Month= driver.findElement(By.className("ui-datepicker-month")).getText();
        	
        	String Year= driver.findElement(By.className("ui-datepicker-year")).getText();
        	
        	if(ExpectedMonth.equalsIgnoreCase(Month) && ExpectedYear.equalsIgnoreCase(Year))
        	
        	{
        		List<WebElement> TotalDays= driver.findElements(By.xpath("//td[@data-handler='selectDay']//a"));
                int TotalCalenderDay_Size= TotalDays.size();
                System.out.println(TotalCalenderDay_Size);
                
                for(WebElement ele : TotalDays)
                	
                {
                	String Days_Text= ele.getText();
                	System.out.println("Day name is " + Days_Text);
                	
                	if(Days_Text.equalsIgnoreCase(ExpectedDay))
                		
                	{
                		ele.click();
                		
                		
                	}
                	
                }
                
                break;
        		
        	}
        	
        	  else
              {
              	driver.findElement(By.xpath("//span[text()='Next']")).click();
              }
        
        	
        	
			
		}
        
      
        

	}

}
