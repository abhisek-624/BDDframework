package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.HomePage;

public class Email {

	public WebDriver driver;
	public HomePage hp;
	
	@Given("open  any browser")
	public void open_any_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisek\\Desktop\\Compre\\CA-BDDFramework\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}

	@When("user open url")
	public void user_open_url() {
		driver.get("https://www.urbanladder.com/");
	}

	@And("user enter {string}")
	public void user_enter(String email) {
		hp= new HomePage(driver);
		hp.Emailtxtbar(email);
	}

	@Then("user clicks on the subscribe button")
	public void user_clicks_on_the_subscribe_button() {
		hp= new HomePage(driver);
		hp.clickEmailSubmit();
	}

	@And("close the brower")
	public void close_the_brower() {
	 
		 driver.close();
		    driver.quit();	
		
	}

	

}
