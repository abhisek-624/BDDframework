package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver){
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="search")
	@CacheLookup
	WebElement searcher;
	
	@FindBy(id="search_button")
	@CacheLookup
	WebElement search_btn;
	
	@FindBy(id="email_id")
	@CacheLookup
	WebElement Emailtxt;
	
	@FindBy(xpath="//*[@id=\"nl-subscribe-footer\"]/div[2]/input")
	@CacheLookup
	WebElement email_submit;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[2]/a[1]")
	@CacheLookup
	WebElement sofaitem;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[2]/a[2]")
	@CacheLookup
	WebElement Beditem;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[2]/a[4]")
	@CacheLookup
	WebElement TVitem;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[2]/a[6]")
	@CacheLookup
	WebElement Seatingitem;
	
	@FindBy(linkText="About Us")
	@CacheLookup
	WebElement aboutpage;
	
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[1]/a")
	@CacheLookup
	WebElement storelink;
	
	@FindBy(linkText="Contact Us")
	@CacheLookup
	WebElement Contactlink;
	
	
	public void searchbar(String word) {
		searcher.sendKeys(word);
		
	}
	
	public void clicksearchbtn() {
		search_btn.click();
		
	}
	
	public void clearsearchbar() {
		searcher.clear();
	}
	
	public void Emailtxtbar(String gmail) {
		Emailtxt.sendKeys(gmail);
	}
	
	public void clickEmailSubmit() {
		email_submit.click();
	}
	
	public boolean checksofaitem() {
		boolean results= sofaitem.isDisplayed();
		return results;
	}
	
	public boolean checksbeditem() {
		boolean results= Beditem.isDisplayed();
		return results;
	}
	
	public boolean checkstvitem() {
		boolean results= TVitem.isDisplayed();
		return results;
	}
	
	public boolean checkseatingitem() {
		boolean results= Seatingitem.isDisplayed();
		return results;
	}
	
	public void clickaboutpage() {
		aboutpage.click();
	}
	
	public void clickstorepage() {
		storelink.click();
	}
	
	public void clickcontactpage() {
		Contactlink.click();
	}
}
