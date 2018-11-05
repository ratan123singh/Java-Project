import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constantpart 
{

	public WebDriver initialize()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		WebDriver d = new ChromeDriver(); 

		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		d.manage().window().maximize();

		return d;
	}
	public static void quitwindow(WebDriver d) throws Exception
	{
		d.quit();
		
		try
		{
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
