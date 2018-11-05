import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailregister extends Constantpart
{
	private static WebDriver d;

	public static void main(String[] args)
	{
		Constantpart obj = new Constantpart();
		obj.initialize();

		d.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");

		d.findElement(By.id("firstName")).sendKeys("");
	
		d.findElement(By.id("lastName")).sendKeys("");
	
		d.findElement(By.id("username")).sendKeys("");
	
        d.findElement(By.cssSelector("input[type='password']")).sendKeys("");;
		
		d.findElement(By.name("ConfirmPasswd")).sendKeys("");
	
        d.findElement(By.id("accountDetailsNext")).click();
    
	}
}


