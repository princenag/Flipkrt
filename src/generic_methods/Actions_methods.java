package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_methods {
	public void mouseHover(WebDriver driver ,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void dragdrop(WebDriver driver ,WebElement ele,WebElement source,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	public void doubleclick(WebDriver driver ,WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	public void rightclick(WebDriver driver ,WebElement ele,WebElement target) {
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
	}
	
}
