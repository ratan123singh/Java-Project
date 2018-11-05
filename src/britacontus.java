import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class britacontus extends Constantpart
{
	private static WebDriver d;

	public static void main(String[] args) 
	{
		Constantpart obj = new Constantpart();
		d=obj.initialize();

		d.get(" ");

		d.findElement(By.xpath("//a[text()='Contact Us']	")).click();

		d.findElement(By.id("contact_submit")).click();

		d.findElement(By.id("contact_name")).sendKeys(" ");

		d.findElement(By.name("email")).sendKeys(" ");

		d.findElement(By.id("contact_subject")).sendKeys("QWEERTY");

		d.findElement(By.id("contact_message")).sendKeys("pawanvedak");

		d.findElement(By.id("contact_submit")).click();

	}
}
