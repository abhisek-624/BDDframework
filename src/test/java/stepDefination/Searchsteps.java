package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;

public class Searchsteps {
	
	public WebDriver driver;
	public HomePage hp;

	@Given("user lanch chrome browser")
	public void user_lanch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisek\\Desktop\\Compre\\CA-BDDFramework\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}

	@When("user open url  {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	}

	@When("^user enter (.*) in the search box$")
	public void user_enter_table_in_the_search_box(String word) {
		hp= new HomePage(driver);
	    hp.searchbar(word);
	}

	@Then("click the surch button")
	public void click_the_surch_button() {
		hp= new HomePage(driver);
	    hp.clicksearchbtn();
	}

	@And("close browser")
	public void close_browser() {
		driver.close();
	    driver.quit();
	}

}
