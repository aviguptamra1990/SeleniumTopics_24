package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class ReadExcel_For_DataDrivenTesting {
	
    WebDriver driver;
	
	@Test(dataProvider = "LoginDataProvider")
	
	public void AbotTitleInvalid(String Email, String Password) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        
       driver.findElement(By.id("user-name")).sendKeys(Email);
       
       Thread.sleep(3000);
       
       driver.findElement(By.name("password")).sendKeys(Password);
       
       Thread.sleep(3000);
       
       driver.findElement(By.className("btn_action")).click();
		
	}
	
	
	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = "C:\\Users\\ASUS\\Desktop\\TestDataFile.xlsx";


		int ttlRows = ReadExcelFile_61.getRowCount(fileName, "Data");
		int ttlColumns = ReadExcelFile_61.getColCount(fileName, "Data");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile_61.getCellValue(fileName,"Data", i,j);
			}

		}
		return data;
	}
	
	
	
	
	

}
