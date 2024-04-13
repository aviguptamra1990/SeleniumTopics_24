package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("btn_action")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("select")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("inventory_details_back_button")).click();//support code
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Sauce Labs Fleece")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div.bm-burger-button")).click();// by tag.className
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a#inventory_sidebar_link")).click();// by tag#id
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[class='bm-burger-button']")).click(); //by tag[attribute='attributeValue']
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div.bm-cross-button[style='position: absolute; width: 24px; height: 24px; right: 8px; top: 8px;']")).click();
		//by tag.class[attribute='attributeValue']
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("div[class='bm-burger-button']")).click(); //support code
        
		Thread.sleep(1000);
		
		driver.findElement(By.id("logout_sidebar_link")).click(); //support code
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");// by tag[@attribute='attribute value']
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");//by tag[@attribute='attribute value']
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();//by tag[@attribute='attribute value']
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));//by tag[text='text value']
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bo')]"));//div[contains(text(),'partial text')]
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[starts-with(@class,'bm-b')]")).click();//div[starts-with(@attribute,'partial attribute value')]
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='inventory_sidebar_link' or text()='All Items']"));// by or expression
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='inventory_sidebar_link' and text()='All Items']"));//by and expression
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//nav[@class='bm-item-list']//a[3]"));//by index[]
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//nav[@class='bm-item-list']//a[last()]")); //by last expression
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//nav[@class='bm-item-list']//a[position()=4]"));//by position() expression
		
		

	}

}
