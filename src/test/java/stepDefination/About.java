package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.HomePage;

public class About {
	public WebDriver driver;
	public HomePage hp;
	@Given("open chrome browser")
	public void open_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisek\\Desktop\\Compre\\CA-BDDFramework\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
		
	}

	@When("user enter url  {string}")
	public void user_enter_url(String url) {
		driver.get(url);
		
		
	}

	@Then("click about us option")
	public void click_about_us_option() {
		hp= new HomePage(driver);
	    hp.clickaboutpage();
	}

	@And("verify the about page title")
	public void verify_the_about_page_title() {
		if(driver.getTitle()=="Urban Ladder | About Us - Urban Ladd") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

	@Then("close chrome browser")
	public void close_chrome_browser() {
		driver.close();
	    driver.quit();  
	}

}
