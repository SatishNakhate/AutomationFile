package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.io.FileOutputStream;
import java.rmi.AccessException;
import java.util.Properties;

import com.beust.jcommander.defaultprovider.PropertyFileDefaultProvider;

import io.cucumber.java.en.And;
public class mainsteps {

	@Given ("User is on the netbanking page")
		public void User_is_on_the_netbanking_page()
		{
			try {
				FileOutputStream fs = new FileOutputStream("C:/abc");
						
			}
			catch(Exception e)
			{
				
			}
		}
	@When("^User login into application user (.+) Pass (.+)$")
	public void user_login_into_application_user_pass(String Username, String Password) {
		System.out.println(Username + "login into application user" + Password);
	}
	@Then ("Home page is displayed")
		public void Home_page_is_displayed()
		{
			System.out.println("Home page is displayed");
		}
	@And ("Cards are dispayed")
		public void Cards_are_dispayed()
		{
			System.out.println("Cards are dispayed");
		}
}
