import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Tilogin extends Constantpart
{
	static WebDriver d;

	public static void main(String[] args)
	{
		Constantpart Obj = new Constantpart();
		Obj.initialize();
		
		String email[] = {"" , "" , ""};
		String pass[] = {"" , "" , ""};
		
		for(int i=0; i<email.length; i++) 
		{
			
			d.get("");
			
	
			d.findElement(By.id("edit-name")).sendKeys(email[i]);
			
			
			d.findElement(By.name("pass")).sendKeys(pass[i]);
			
			
			if(i==2)
			{
				d.findElement(By.name("op")).click();
				
				//d.findElement(By.id("user_name_hover")).click();
				
				//Actions a = new Actions(d);
				//a.moveToElement(d.findElement(By.id("user_name_hover"))).perform();
				
				//Thread.sleep(2000);
				
			    // d.findElement(By.xpath("//text()[contains(.,'Logout')]/ancestor::a[1]")).click();
				 //Thread.sleep(2000);
				 //d.quit();

					
			}
			else 
			{
				d.findElement(By.name("op")).click();
				d.quit();
			}
			 
		}
	


             Actions a = new Actions(d);
             a.moveToElement(d.findElement(By.xpath("//span[text()='Cycles']"))).perform();
             
             d.findElement(By.xpath("//h3[text()='All Cycles']")).click();
             
     
	}
}


