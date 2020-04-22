package generic_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_test implements Framework_constants{
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		
		ChromeOptions  options = new ChromeOptions ();
		options.addArguments("--disable-notifications");
		System.setProperty(CHROME_KEY, CHROME_VALUE);

		 driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		/*@AfterMethod
		public void closeappln() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();
		}*/

	}


