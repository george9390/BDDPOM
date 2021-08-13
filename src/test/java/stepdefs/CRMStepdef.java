package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class CRMStepdef extends TestBase{
	LoginPage loginPage;
	@Before
	
	public void setup() {
		initialize();
		loginPage = new LoginPage();
	}
	
		WebDriver driver;
			@Given("User is already on login page")
			public void user_is_already_on_login_page() {
				String pageTitle = loginPage.getPageTitle();
				Assert.assertEquals("Cogmento CRM", pageTitle);
			}


			

			@When("User enters credentials")
			public void user_enters_credentials(DataTable loginCreds) {
			   List<Map<String, String>> data = loginCreds.asMaps();
			   String strUser = data.get(0).get("username");
			   String strPwd = data.get(0).get("password");
			   loginPage.login(strUser, strPwd);
			}
			

					
			
			@Then("Should display Home page")
			public void should_display_home_page() {
			   
			}
			@Then("close the browser")
			public void close_the_browser() {
			   driver.close();
			}



}
