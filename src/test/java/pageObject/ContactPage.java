package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	WebDriver ldriver;
	
	public ContactPage(WebDriver rdriver){
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="help-center-search-input")
	@CacheLookup
	WebElement searchbar;
	
	public boolean verifysearchbar() {
		boolean results= searchbar.isDisplayed();
		return results;
	}
	
	public void enterdata(String data) {
		searchbar.sendKeys(data);
		searchbar.sendKeys(Keys.ENTER);
	}
}
