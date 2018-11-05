import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class tiregister extends Constantpart
{
	private static RemoteWebDriver d;

	public static void main(String[] args)
	{
		Constantpart obj = new Constantpart();
		obj.initialize();
		
		d.get(" ");
		
		d.findElement(By.xpath("//a[text()='sign up']	")).click();
		
		d.findElement(By.id("edit-mail")).sendKeys(" ");
		
		d.findElement(By.id("edit-pass-pass1")).sendKeys("");
		
		d.findElement(By.id("edit-pass-pass2")).sendKeys("");;

        d.findElement(By.id("edit-field-full-name-und-0-value")).sendKeys(" ");
		
		 d.findElement(By.id("edit-field-user-mobile-number-und-0-value")).sendKeys("");
			
		d.findElement(By.xpath("//input[@type='checkbox'][@name='field_opt_in_for_newsletter[und]']	")).click();
		
		d.findElement(By.id("edit-submit")).click();
		
		
	}

}


