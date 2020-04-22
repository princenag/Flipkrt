package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartloginpage {
	@FindBy(id="email")
	private WebElement usrname;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement cclick;
	
	//@FindBy(xpath="//span[@class='_2n_9 f_click']")
	@FindBy(xpath="//span[contains(text(),'Nagendra')]")
	private WebElement notification;
	
	@FindBy(xpath="//div[contains(text(),'Account Settings')]")
	private WebElement Logoutbutton;
	
	@FindBy(xpath="(//span[@class='_54nh'])[7]")
	private WebElement logout;
	
	
	//@FindBy(xpath="//input[@class='_58al']")
	//private WebElement search;
	
	//@FindBy(xpath="//div[contains(text(),'Vinay Shetty')]")
	//private WebElement clickonfrd;
	
	public Flipkartloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String ps) {
		usrname.sendKeys(ps);
	}
		public void setpassrd(String ps) {
			password.sendKeys(ps);
		}
	public void clicklogin() {
		cclick.click();
	}
	
	public void clickprofile() {
		notification.click();
	}
	public void clickonlogoutbutton(){
		Logoutbutton.click();
	}
	public void logoutclick() {
		logout.click();
	}
	
}


