package nicebank;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class Steps {

    public class Account{
        public Account(int openingBalance){

        }
    }

    @Given("^I have deposited \\$(\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(int amount) throws Throwable {
        new Account(amount);
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
