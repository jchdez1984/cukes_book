package nicebank;


import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

public class AccountSteps {
    KnowsTheDomain helper;

    public AccountSteps(KnowsTheDomain helper){ this.helper = helper;}

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount)
            throws Throwable {
        helper.getMyAccount().credit(amount);

        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }


    @Then("^the balance of my account should (\\$\\d+\\.\\d+)$")
    public void the_balance_of_my_account_should_$(@Transform(MoneyConverter.class)Money amount) throws Throwable {
        Assert.assertEquals("incorrect balance - ", amount, helper.getMyAccount().getBalance());
    }
}
