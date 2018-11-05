import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbsignup extends Constantpart
{
	private static WebDriver d;

	public static void main(String[] args)
	{
		Constantpart obj = new Constantpart();
		obj.initialize();

		d.navigate().to("https://goo.gl/Sxyfgy");  //mention the link of the site

		d.findElement(By.name("firstname")).sendKeys("");  //pass the value of firstname	
	
		d.findElement(By.name("lastname")).sendKeys("");  //pass the value of lastname
	
		d.findElement(By.id("u_0_p")).sendKeys("");  //pass the link of email id
		
		d.findElement(By.id("u_0_s")).sendKeys("");  //pass the link of the of the confirm email id
		
		d.findElement(By.id("u_0_w")).sendKeys("ratan");
		
		d.findElement(By.id("day")).sendKeys("5");
		d.findElement(By.id("month")).sendKeys("september");
		d.findElement(By.id("year")).sendKeys("1995");
		
		//driver.findElement((SearchContext) By.id("u_0_7")).isEnabled();
		//radioBtn.click();
		
	
		WebElement radioBtn = d.findElement(By.id("u_0_7"));

		radioBtn.click();
		
		
		d.findElement(By.id("u_0_8")).click();
    
    	
       d.quit();
		
		
		//d.findElement(By.name("sex")).isEnabled();
	//	d.findElement(By.name("ConfirmPasswd")).sendKeys("ratan");
	//	Thread.sleep(1000);
      //  d.findElement(By.id("identifierNext")).click();
   //     Thread.sleep(1000);
      //  d.findElement(By.id("accountDetailsNext")).click();	
}

}



