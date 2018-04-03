package nicebank;


import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

public class AccountSteps {
    KnowsTheDomain helper;

    static {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
    }


    public AccountSteps(KnowsTheDomain helper){ this.helper = helper;}


    @Given("^my account has been credited with (\\$\\d+\\.\\d+)$")
    public void my_account_has_been_credited_with_$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().credit(amount);
    }

    @Then("^the balance of my account should be (\\$\\d+\\.\\d+)$") public void theBalanceOfMyAccountShouldBe$(
            @Transform(MoneyConverter.class) Money amount) throws Throwable {
        Assert.assertEquals("Incorrect account balance -",
                amount, helper.getMyAccount().getBalance());
    }


}
