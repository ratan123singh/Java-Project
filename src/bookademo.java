import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class bookademo extends Constantpart
{
	private static WebDriver d;

	public static void main(String[] args) throws AWTException
	{
		Constantpart obj = new Constantpart();
		d= obj.initialize();
		
		d.get(" ");
		

		d.findElement(By.xpath("//a[text()='book a demo']	")).click();	
	   
	    
		d.findElement(By.id("book_demo_customer_name")).sendKeys(" ");
	
		
		d.findElement(By.id("book_demo_email_id")).sendKeys(" ");  //pass the value of password

		
		d.findElement(By.id("book_demo_mobile_no")).sendKeys(" ");
	

		d.findElement(By.xpath("//div[@class='selectize-input items not-full has-options']	")).click();
		

		d.findElement(By.cssSelector("div[data-value='1")).click();			
		
		
        d.findElement(By.id("book_demo_pincode")).sendKeys("123456");  //click on the login button
		
		
		d.findElement(By.id("submit-book-demo")).click();	
	  
	    
	    d.findElement(By.id("close_book_a_demo_popup")).click();
	    
			
}
}
