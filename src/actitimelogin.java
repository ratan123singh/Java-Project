import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimelogin extends Constantpart
{
   static WebDriver d;

	public static void main(String[] args) throws Exception 
	{
		Constantpart obj = new Constantpart();
		obj.initialize();
		
		d.navigate().to("https://demo.actitime.com/login.do;jsessionid=85763D049502FFF931FEF6B03268F793"); 

		d.findElement(By.name("username")).sendKeys("user"); 
		
		d.findElement(By.name("pwd")).sendKeys("user"); 
		
		d.findElement(By.id("loginButton")).click(); 
		
		d.quit();
	}
	
	
}
