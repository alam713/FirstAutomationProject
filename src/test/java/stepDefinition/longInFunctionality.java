package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class longInFunctionality {
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user is on the login page");
	    
	    
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("user enters valid username and password");
	    
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	  System.out.println("user clicks on login button");  
	    
	}

	@Then("user is navigated to the dashboard page")
	public void user_is_navigated_to_the_dashboard_page() {
	    System.out.println("user is navigated to the dashboard page");
	    
	}


}
