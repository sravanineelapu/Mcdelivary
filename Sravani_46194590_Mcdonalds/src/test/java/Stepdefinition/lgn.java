package Stepdefinition;

import Browser.Browser;
import Browser.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class lgn {
	@Given("Open the browser {string}")
	public void open_the_browser(String string) throws Exception {
		Browser.setDriver();
		Browser.getUrl(string);
	}

	@Given("user is on Login page")
	public void user_is_on_Login_page() throws Exception {
		Log.Log();
		Log.userlogin();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws Exception {
		Log.mobilenumber();
		Log.password();
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws Exception {
		Log.clickcontinue();
	}

	@Then("user is navigating to the home page")
	public void user_is_navigating_to_the_home_page() {
	   
	}
}
