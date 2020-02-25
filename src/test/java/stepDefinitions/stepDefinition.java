package stepDefinitions;


import org.junit.runner.RunWith;
//import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	 @Given("^user is on login page$")
	    public void user_is_on_login_page() throws Throwable {
		 System.out.println("Given");
	    }

	 @When("^user enters correct \"([^\"]*)\" and correct \"([^\"]*)\"$")
	    public void user_enters_correct_something_and_correct_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	    }

	 @Then("^user gets confirmation$")
	    public void user_gets_confirmation() throws Throwable {
	    	System.out.println("then");

	    }

}