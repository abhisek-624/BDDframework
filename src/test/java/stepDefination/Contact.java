package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.ContactPage;
import pageObject.HomePage;

public class Contact {
	public WebDriver driver;
	public HomePage hp;
	public ContactPage cp;
	@Given("user use  browser")
	public void user_use_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisek\\Desktop\\Compre\\CA-BDDFramework\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}

	@When("user url  {string} in browser")
	public void user_url_in_browser(String url) {
		driver.get(url);
	}

	@Then("click contact us")
	public void click_contact_us() {
		hp= new HomePage(driver);
		hp.clickcontactpage();
	}

	@And("verify the contact page title")
	public void verify_the_contact_page_title() {
		if(driver.getTitle()=="Contact Us | urbanladder.com") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

	@Then("verify contact page element")
	public void verify_contact_page_element() {
		cp= new ContactPage(driver);
		boolean l1=cp.verifysearchbar();
		if(l1==true) {
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		} 
	}

	@And("quit browser")
	public void quit_browser() {
		driver.close();
	    driver.quit();


}}

