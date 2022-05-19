package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.StorePage;

public class Store {

	public WebDriver driver;
	public HomePage hp;
	public StorePage sp;
	
	@Given("user start chrome browser")
	public void user_start_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisek\\Desktop\\Compre\\CA-BDDFramework\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}

	@When("user url  {string} in chrome")
	public void user_url_in_chrome(String url) {
		driver.get(url);
	}

	@And("click store option")
	public void click_store_option() {
		hp= new HomePage(driver);
		hp.clickstorepage();
	}

	@Then("verify the page title")
	public void verify_the_page_title() {
		if(driver.getTitle()=="India's Favorite Office & Home Furniture Store") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	
	}

	@And("verify the option")
	public void verify_the_option() {
	    sp=new StorePage(driver);
	    boolean li=sp.verifyviewbtn();
	    if(li==true) {
	    	System.out.println("test Pass");
	    }
	    else {
	    	System.out.println("test failed");
	    }
	}

	@Then("off the browser")
	public void off_the_browser() {
		driver.close();
	    driver.quit();
	}



}
