package generic_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WebElement_methods {
	public String getattribute (WebElement ele,String value ) {
		String st= ele.getAttribute(value);
		return st;
	}
	
	public String getcssvalue (WebElement ele,String value ) {
		String st1= ele.getCssValue(value);
		return st1;
	}
	public Point getlocation (WebElement ele ) {
		Point st2= ele.getLocation();
		return st2;
	}
	public Object getscreenshot (WebElement ele,OutputType file) {
		
		Object st2= ele.getScreenshotAs(file);
		return st2;
	}
	public Dimension getsize (WebElement ele ) {
		Dimension s2= ele.getSize();
		return s2;
	}
	
	public String gettagname (WebElement ele ) {
		String s2= ele.getTagName();
		return s2;
	}
	public String gettext (WebElement ele ) {
		String text= ele.getText();
		return text;
	}
	public boolean isdisplayed (WebElement ele ) {
		boolean result= ele.isDisplayed();
		return result;
	}
	public boolean isenabled (WebElement ele ) {
		boolean result= ele.isEnabled();
		return result;
	}
	public boolean isselected (WebElement ele ) {
		boolean result= ele.isSelected();
		return result;
	}
	public void submit (WebElement ele ) {
		 ele.submit();
	}
	public void sendkeys (WebElement ele,String vlaue ) {
		 ele.sendKeys(vlaue);
	}
	
}
