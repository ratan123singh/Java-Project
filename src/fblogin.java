import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class fblogin extends Constantpart
{
	 static Object userNavigationLabel;
	 static WebDriver d;
	

	public static void main(String[] args) throws Exception
	{
		fblogin obj = new fblogin();
		d= obj.initialize();

		d.get("https://www.facebook.com/login.php?login_attempt=1&lwv=110");

		d.findElement(By.name("email")).sendKeys(" ");

		d.findElement(By.name("pass")).sendKeys(" ");

		d.findElement(By.name("login")).click();

		//d.findElement(By.id("userNavigationLabel")).click();

		//d.findElement(By.id("userNavigationLabel")).click();
		
		d = obj.quitwindow();

	}


	public WebDriver quitwindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
