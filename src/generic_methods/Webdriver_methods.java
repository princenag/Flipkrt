package generic_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class Webdriver_methods {
	
	public String gettheTitle(WebDriver driver ) {
		String title= driver.getTitle();
		return title;
	}
	public String getcurrenturl(WebDriver driver) {
		String s1= driver.getCurrentUrl();
		return s1;
	}
	public String getpagesource(WebDriver driver) {
		String pgsrc= driver.getPageSource();
		return pgsrc;
	}
	public String getwindowhandle(WebDriver driver) {
		String Gwinhandle= driver.getWindowHandle();
		return Gwinhandle;
	}
	public Set<String> getwindowhandles(WebDriver driver) {
		Set<String> Gwinhandles= driver.getWindowHandles();
		return Gwinhandles;
	}
	public void close(WebDriver driver) {
		 driver.close();
	}
	public void quit(WebDriver driver) {
		 driver.quit();
	}
	public void manage(WebDriver driver) {
	 driver.manage().window().maximize();
	}
	public  void navigateback  (WebDriver driver) {
		  driver.navigate().back();
	
	}
	public  void navigatefrwd  (WebDriver driver) {
		  driver.navigate().forward();
	
	}
	public  void navigaterefrsh  (WebDriver driver) {
		  driver.navigate().refresh();
	
	}
	public  void siwtchToframe  (WebDriver driver,int value) {
		  driver.switchTo().frame(value);
	
	}
	public  void siwtchToalert  (WebDriver driver,int value) {
		  driver.switchTo().alert();
	
	}
	
	
	
	
	
	

}
