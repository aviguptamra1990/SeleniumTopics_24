package topics;




import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncryptPassword_34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
        
        Thread.sleep(1000);
        
        String UserName="standard_user";
        
        String Password="secret_sauce";
        
        
        byte[] EncodeUserName= Base64.encodeBase64(UserName.getBytes());
        System.out.println(new String(EncodeUserName));
        
        byte[] DecodeUserName= Base64.decodeBase64(EncodeUserName);
        System.out.println(new String(DecodeUserName));
       
       Thread.sleep(1000);
       
       byte[] EncodePassword= Base64.encodeBase64(Password.getBytes());
       System.out.println(new String(EncodePassword));
       
       byte[] DecodePassword= Base64.decodeBase64(EncodePassword);
       System.out.println(new String(DecodePassword));
        
		

	}

}
