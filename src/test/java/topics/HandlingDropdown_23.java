package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown_23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement oldSelectMenu= driver.findElement(By.id("oldSelectMenu"));
		
		Select SingleDropdown=new Select(oldSelectMenu);
		
		SingleDropdown.selectByIndex(2);
		
		Thread.sleep(1000);
		
		SingleDropdown.selectByValue("4");
		
		Thread.sleep(1000);
		
		SingleDropdown.selectByVisibleText("Magenta");
		
		Thread.sleep(1000);
		
		WebElement getFirstSelectedOption= SingleDropdown.getFirstSelectedOption();
		String DropdownDefaultSelectedvalue= getFirstSelectedOption.getText();
		System.out.println("Dropdown Default Selected Value is : " + DropdownDefaultSelectedvalue);
		
		Thread.sleep(1000);
		
		List<WebElement> DropdownAllOptions= SingleDropdown.getOptions();
		int DropdownAllOptions_Size=DropdownAllOptions.size();
		System.out.println(DropdownAllOptions_Size);
		
		for(WebElement ele : DropdownAllOptions)
			
		{
			
			String DropdownAllOptions_Text= ele.getText();
			System.out.println("Dropdown All Options Text is : "  + DropdownAllOptions_Text);
			
			
		}
		
		
		WebElement Standardmultiselect =driver.findElement(By.id("cars"));
		
		Select MultiTypeDropdown= new Select(Standardmultiselect);
		
		MultiTypeDropdown.selectByIndex(2);
		
		Thread.sleep(1000);
		
		MultiTypeDropdown.selectByValue("audi");
		
		Thread.sleep(1000);
		
		MultiTypeDropdown.selectByVisibleText("Volvo");
		
		Thread.sleep(1000);
		
		List<WebElement> getAllSelectedOptions= MultiTypeDropdown.getAllSelectedOptions();
		int getAllSelectedOptions_Size= getAllSelectedOptions.size();
		System.out.println("All Selected Value Size is :" + getAllSelectedOptions_Size);
		
		for(WebElement ele : getAllSelectedOptions)
			
		{
			
			String getAllSelectedOptions_Text= ele.getText();
			System.out.println( "All Selected Options Value is : " + getAllSelectedOptions_Text);
		}
		
		Thread.sleep(1000);
		
		MultiTypeDropdown.deselectByVisibleText("Audi");
		
		Thread.sleep(1000);
		
		MultiTypeDropdown.deselectAll();
		
		
		
		
		

	}

}
