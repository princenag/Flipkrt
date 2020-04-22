package generic_methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Methods {

	public void selectbyindex (WebElement ele,int i ) {
		Select s= new Select(ele);
		s.selectByIndex(i);
		
	}
	public void selectbyvalue (WebElement ele,String value ) {
		Select s= new Select(ele);
		s.selectByValue(value);
		
	}
	public void selectbyvisibletext (WebElement ele,String value ) {
		Select s= new Select(ele);
		s.selectByVisibleText(value);
		
	}
	public void deselectbyindex (WebElement ele,int value ) {
		Select s= new Select(ele);
		s.deselectByIndex(value);
		
	}
	public void deselectbyvalue(WebElement ele,String value ) {
		Select s= new Select(ele);
		s.deselectByValue(value);
	
	}
	public void deselectbyvisibletext(WebElement ele,String value ) {
		Select s= new Select(ele);
		s.deselectByVisibleText(value);
	
	}
	public List<WebElement> getoptions(WebElement ele,String value ) {
		Select s= new Select(ele);
		List<WebElement> options=s.getOptions();
	int count=options.size();
	for (WebElement wh:options) {
	String text = wh.getText();
	System.out.println(text);
	}
	return options;
	
	}
	public List<WebElement> getallselectedoptions(WebElement ele,String value ) {
		Select s= new Select(ele);
		List<WebElement> options=s.getAllSelectedOptions();
		int count=options.size();
		for (WebElement wh:options) {
		String text = wh.getText();
		System.out.println(text);
		}
		
		return options;
	
	}
	public List<WebElement>  getfirstselectedoptions(WebElement ele,String value ) {
		Select s= new Select(ele);
		List<WebElement>options= (List<WebElement>) s.getFirstSelectedOption();
		int count=options.size();
		for (WebElement wh:options) {
		String text = wh.getText();
		System.out.println(text);
		}
		return options;
	
	}
	public void destelectall(WebElement ele,String value ) {
		Select s= new Select(ele);
		s.deselectAll();
	
	}
	public void ismultiple(WebElement ele,String value ) {
		Select s= new Select(ele);
		s.isMultiple();
	
	}
	
}
