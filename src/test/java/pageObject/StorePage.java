package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage {

	WebDriver ldriver;
	
	public StorePage(WebDriver rdriver){
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section[2]/div/a[1]/div[3]/button")
	@CacheLookup
	WebElement viewbtn;
	
	public boolean verifyviewbtn() {
		boolean results= viewbtn.isDisplayed();
		return results;
	}
}
