package TestDefination;


import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Mainsteps {

	@Given("User on netbanking page")
	public void User_on_netbanking_page()
	{
		System.out.println("User on netbanking page");
		
	}
	
//	@When("User login into Application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Username is   "+ username + "   Password is " + password);
//	}
	
	//Regex method
	//(.+) This Represent any data Types
	//With the help of ^ and $ you can find the regex pattern 
	@When("^User login into Application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Username is   "+ username + "   Password is " + password);
	}
	@Then ("Home page is display")
	public void Home_page_is_display()
	{
		System.out.println("Home page is display");
		
	}
	
	@Then ("Cards are displayed")
	public void Cards_are_displayed()
	{
		System.out.println("Cards are displayed");
	}
	
	@Given("User on practice page")
	public void user_on_practice_page() {
	   
	}
	@When("User Signup into Application")
	public void user_signup_into_application(List<String> data) {
//Here we have provided the all those data mentioned in scenario and it will stored in dada attributes,	
	   //Below are the method to wright the data on page 
		//driver.findElement(sendKeys(data.get(0))
		System.out.println((data.get(0)));
		System.out.println((data.get(1)));
		System.out.println((data.get(2)));
		System.out.println((data.get(3)));
		
	}
	
}
