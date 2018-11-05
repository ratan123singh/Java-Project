import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gmaillogin extends Constantpart
{
	 static WebDriver d;

	public static void main(String[] args)
	{
		gmaillogin obj = new gmaillogin();
		obj.initialize();
		
		d.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//d.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		d.findElement(By.name("identifier")).sendKeys(" ");
		
        d.findElement(By.id("identifierNext")).click();
        
        d.findElement(By.name("password")).sendKeys(" ");
        
        d.findElement(By.id("passwordNext")).click();	
                
        d.findElement(By.cssSelector("svg[class='gb_he']")).click();
        
        d.findElement(By.id("gb23")).click();
        
        d.findElement(By.xpath("//div[text()='Compose']")).click();
         
        d.findElement(By.id(":lw")).click();
        
        d.findElement(By.cssSelector("span[class='gb_db gbii']")).click();
  
        d.findElement(By.id("gb_71")).click();
	}

}


