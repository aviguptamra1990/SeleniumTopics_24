package topics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Cookies_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		Set<Cookie> cookies= driver.manage().getCookies();
		int cookies_Size= cookies.size();
		System.out.println("cookies_Size is : " + cookies_Size);
		
		for(Cookie cookie: cookies)
			
		{
			
			String CookieKey = cookie.getName();
			
			String CookieValue = cookie.getValue();
			
			System.out.println(CookieKey + " : " + CookieValue);
			
			
		}
		
		Cookie cook= driver.manage().getCookieNamed("session-id");
		System.out.println("Cookie Name is : " + cook);
		
		Cookie cok=new Cookie("TestCookie","www.amazon.com");
		
		driver.manage().addCookie(cok);
		
		Set<Cookie> cookies1= driver.manage().getCookies();
		int cookies_Size1= cookies1.size();
		System.out.println("cookies_Size is : " + cookies_Size1);
		
		driver.manage().deleteCookieNamed("TestCookie");
		
		Set<Cookie> cookies2= driver.manage().getCookies();
		int cookies_Size2 = cookies2.size();
		System.out.println("cookies_Size is : " + cookies_Size2);
		
		
		
		

	}

}
